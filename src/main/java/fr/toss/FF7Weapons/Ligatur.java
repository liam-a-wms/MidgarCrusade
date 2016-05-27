package fr.toss.FF7Weapons;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.BulletChamberEvent;
import fr.toss.FF7.BulletLooseEvent;
import fr.toss.FF7.ItemRegistry1;
import fr.toss.FF7.projectiles.entities.EntityEnergyBall;

public class Ligatur extends Item
	{
	public Ligatur(int id)
	
	{
		
	  super();
	  this.setFull3D(); 
	  setCreativeTab(ItemRegistry1.Weapons);
	  setUnlocalizedName("Ligatur");
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}


	 public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int i)
	    {
	        int j = this.getMaxItemUseDuration(stack) - i;

	        
	        BulletLooseEvent event = new BulletLooseEvent(player, stack, j);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return;
	        }
	        j = event.charge;

	        boolean flag = player.capabilities.isCreativeMode;

	        if (flag || player.inventory.hasItem(ItemRegistry1.plasma))
	        {
	            float f = (float)j / 20.0F;
	            f = (f * f + f * 2.0F) / 3.0F;

	            if ((double)f < 0.1D)
	            {
	                return;
	            }

	            if (f > 1.0F)
	            {
	                f = 1.0F;
	            }

	            EntityEnergyBall entityenergyball = new EntityEnergyBall(world, player);
	            world.spawnEntityInWorld(entityenergyball);
	            
	           
	            player.inventory.consumeInventoryItem(ItemRegistry1.plasma);

	            if (!world.isRemote)
	            {
	                
	            }
	        }
	    }
	    /**
	     * Prevents the item from being consumed on use
	     */
	    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        return par1ItemStack;
	    }

	    /**
	     * How long it takes to use or consume an item
	     */
	    public int getMaxItemUseDuration(ItemStack par1ItemStack)
	    {
	        return 72000;
	    }

	    /**
	     * returns the action that specifies what animation to play when the items is being used
	     */
	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.bow;
	    }

	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        BulletChamberEvent event = new BulletChamberEvent(par3EntityPlayer, par1ItemStack);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return event.result;
	        }

	        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(ItemRegistry1.plasma))
	        {
	            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	        }

	        return par1ItemStack;
	    }
}