package fr.toss.FF7.eventhandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.ForgeEventFactory;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

//===========================================================================
// CustomEventHandler class
//===========================================================================
/**
 * Manages persistent block damage for up to {@value #MAX_BLOCKS} blocks.
 * 
 * @version vymdt.01.2014.09.21.0000
 * @author Ryan F. Mercer -Open source.
 */
public class CustomEventHandler {

/** Limit of blocks with block damage. */
private static final int MAX_BLOCKS = 49; //equal to 7x7 square.
/** Ticks between updates of block damage. */
private static final int TICK_DELAY = 200;

/** Counter for tick delay between block damage updates. */
private static int tick = 0;
/** Last index position of newly damaged block. */
private static int marker = -1;
/** X-axis coordinates of block damage. */
private static int[] xPos = new int[MAX_BLOCKS];
/** Y-axis coordinates of block damage. */
private static int[] yPos = new int[MAX_BLOCKS];
/** Z-axis coordinates of block damage. */
private static int[] zPos = new int[MAX_BLOCKS];
/** Block damage totals. */
private static float[] dmg = new float[MAX_BLOCKS];

//===========================================================================
/**
 * Increments persistent damage to block at given coordinates.
 * 
 * @param world   Current world.
 * @param x       X-axis coordinate of block.
 * @param y       Y-axis coordinate of block.
 * @param z       Z-axis coordinate of block.
 * @param player  Current player.
 * @param stack   Item hitting block.
 * @param factor  Damage multiplier.
 */
public static void damageBlock(World world, int x, int y, int z
    , EntityPlayer player, ItemStack stack, float factor) {
  
  //server.
  if(!world.isRemote) {
    int index = -1;
    
    //previously damaged block.
    for(int i=0; i < xPos.length; i++) {
      if(x == xPos[i] && y == yPos[i] && z == zPos[i]) {
        index = i;
        break;
      }
    }
    //newly damaged block.
    if(index < 0) {
      marker = ++marker < MAX_BLOCKS ? marker : 0;
      index = marker;
      xPos[index] = x;
      yPos[index] = y;
      zPos[index] = z;
    }
    Block block = world.getBlock(x, y, z);
    int blockId = Block.getIdFromBlock(block);
    int metadata = world.getBlockMetadata(x, y, z);
    if(block.getMaterial() != Material.air) {
      
      //apply damage relative to block hardness, tool type, and player.
      dmg[index] += factor * blockStrength
          (world, player, block, metadata, x, y, z, stack);
      
      //crack block.
      if(dmg[index] < 1.0F) {
        world.destroyBlockInWorldPartially
            (blockId, x, y, z, (int)(dmg[index] * 10.0F) - 1);
        world.playSoundEffect
            ( (float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F //center.
            , block.stepSound.getStepResourcePath() //step-sound name.
            , block.stepSound.getVolume() * 1.5F    //150% step volume.
            , block.stepSound.getPitch() * 0.5F     //half step pitch.
            );
      }
      //break block.
      else {
        if(world.setBlockToAir(x, y, z)) {
          dmg[index] = 0.0F; //reset.
          
          //break-sound plus particles.
          world.playAuxSFX(2001, x, y, z, blockId+(metadata << 12));
          
          //drop items.
          if(!player.capabilities.isCreativeMode
              && canHarvestBlock(world, player, block, metadata, stack)) {
            block.dropBlockAsItem(world, x, y, z, metadata, 0/*fortune*/);
          }
        }
      }
    }
  }
}
//===========================================================================
/**
 * Adapted from {@link net.minecraftforge.common.ForgeHooks#blockStrength
 * (Block, EntityPlayer, World, int, int, int)}.  Uses given item rather than
 * player held item.
 * 
 * @param world     Current world.
 * @param player    Current player.
 * @param block     Being hit.
 * @param metadata  Extra nibble.
 * @param x         X-axis coordinate of block.
 * @param y         Y-axis coordinate of block.
 * @param z         Z-axis coordinate of block.
 * @param stack     Item hitting block.
 * @return Relative block hardness.
 */
public static float blockStrength(World world, EntityPlayer player
    , Block block, int metadata, int x, int y, int z, ItemStack stack) {
  
  float hardness = block.getBlockHardness(world, x, y, z);
  if(hardness < 0.0F) {
    return 0.0F;
  }
  if(!canHarvestBlock(world, player, block, metadata, stack)) {
    return getBreakSpeed(player, block, metadata, x, y, z, stack)
        / hardness / 100F;
  }
  else {
    return getBreakSpeed(player, block, metadata, x, y, z, stack)
        / hardness / 30F;
  }
}
//===========================================================================
/**
 * Adapted from {@link net.minecraftforge.common.ForgeHooks#canHarvestBlock
 * (Block, EntityPlayer, int)}.  Uses given item rather than player held
 * item.
 * 
 * @param world     Current world.
 * @param player    Current player.
 * @param block     To be harvested.
 * @param metadata  Extra nibble.
 * @param stack     Item harvesting block.
 * @return If the block can be harvested.
 */
public static boolean canHarvestBlock(World world, EntityPlayer player
    , Block block, int metadata, ItemStack stack) {
  
  if(block.getMaterial().isToolNotRequired()) {
    return true;
  }
  String tool = block.getHarvestTool(metadata);
  if(stack == null || tool == null) {
    return player.canHarvestBlock(block);
  }
  int toolLevel = stack.getItem().getHarvestLevel(stack, tool);
  if(toolLevel < 0) {
    return player.canHarvestBlock(block);
  }
  return toolLevel >= block.getHarvestLevel(metadata);
}
//===========================================================================
/**
 * Adapted from {@link net.minecraft.entity.player.EntityPlayer#getBreakSpeed
 * (Block, boolean, int, int, int, int)}.  Uses given item rather than player
 * held item.
 * 
 * @param player    Current player.
 * @param block     To be broken.
 * @param metadata  Extra nibble.
 * @param x         X-axis coordinate of block.
 * @param y         Y-axis coordinate of block.
 * @param z         Z-axis coordinate of block.
 * @param stack     Item breaking block.
 * @return Relative break speed.
 */
public static float getBreakSpeed(EntityPlayer player, Block block
    , int metadata, int x, int y, int z, ItemStack stack) {
  
  float f = (stack == null ? 1.0F
      : stack.getItem().getDigSpeed(stack, block, metadata));

  if(f > 1.0F) {
    int mod = EnchantmentHelper.getEnchantmentLevel
        (Enchantment.efficiency.effectId, stack);
    if(mod > 0 && stack != null) {
      float f1 = (float)(mod * mod + 1);
      if(!ForgeHooks.canToolHarvestBlock(block, metadata, stack)
          && f <= 1.0F) {
        f += f1 * 0.08F;
      }
      else {
        f += f1;
      }
    }
  }
  if(player.isPotionActive(Potion.digSpeed)) {
    f *= 1.0F + (float)(player.getActivePotionEffect(Potion.digSpeed)
        .getAmplifier() + 1) * 0.2F;
  }
  if(player.isPotionActive(Potion.digSlowdown)) {
    f *= 1.0F - (float)(player.getActivePotionEffect(Potion.digSlowdown)
        .getAmplifier() + 1) * 0.2F;
  }
  if(player.isInsideOfMaterial(Material.water)
      && !EnchantmentHelper.getAquaAffinityModifier(player)) {
    f /= 5.0F;
  }
  if(!player.onGround) {
    f /= 5.0F;
  }
  f = ForgeEventFactory.getBreakSpeed(player, block, metadata, f, x, y, z);
  return (f < 0 ? 0 : f);
}
//===========================================================================
/**
 * Does nothing.
 * 
 * @param event  [Unused] Caught.
 */
@SubscribeEvent
public void onClientTick(TickEvent.ClientTickEvent event) {
  
  //do nothing.
}
//===========================================================================
/**
 * Does nothing.
 * 
 * @param event  [Unused] Caught.
 */
@SubscribeEvent
public void onPlayerTick(TickEvent.PlayerTickEvent event) {
  
  //do nothing.
}
//===========================================================================
/**
 * Does nothing.
 * 
 * @param event  [Unused] Caught.
 */
@SubscribeEvent
public void onRenderTick(TickEvent.RenderTickEvent event) {
  
  //do nothing.
}
//===========================================================================
/**
 * Does nothing.
 * 
 * @param event  [Unused] Caught.
 */
@SubscribeEvent
public void onServerTick(TickEvent.ServerTickEvent event) {
  
  //do nothing.
}
}
//===========================================================================
/**
 * Updates partial damage on blocks with persistent damage.
 * 
 * @param event  Caught.
 */
/*@SubscribeEvent
public void onWorldTick(TickEvent.WorldTickEvent event) {
  
  if(marker > -1) {
    if(tick < TICK_DELAY) {
      ++tick;
    }
    else {
      tick = 0; //reset.
      for(int i=0; i < dmg.length; i++) {
        if(dmg[i] < 1.0F) {
          
          //supply negative entity IDs to simulate additional players.
          event.world.destroyBlockInWorldPartially
              (-(i+1), xPos[i], yPos[i], zPos[i], (int)(dmg[i] * 10.0F) - 1);
        }
      }
    }
  }
}
//===========================================================================
}//END class
//===========================================================================
*/