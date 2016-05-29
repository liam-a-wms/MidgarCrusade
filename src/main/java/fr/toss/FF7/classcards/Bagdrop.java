package fr.toss.FF7.classcards;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;
import fr.toss.client.gui.GuiSelectHumeClass;

public class Bagdrop extends Item
	{
	public Bagdrop(int id)
	
	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.FF7cards);
	  setUnlocalizedName("bagdrop");
	  
	}

	
	Random random;
	public int rare;
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		Random rand = new Random();
		ItemStack[] itemstack2 = new ItemStack[100];
		itemstack2[0] = new ItemStack(ItemRegistry1.alchemist);
		itemstack2[1] = new ItemStack(ItemRegistry1.arcanist);
		itemstack2[2] = new ItemStack(ItemRegistry1.archer);
		itemstack2[3] = new ItemStack(ItemRegistry1.assasin);
		itemstack2[4] = new ItemStack(ItemRegistry1.beastmaster);
		itemstack2[5] = new ItemStack(ItemRegistry1.berserker);
		itemstack2[6] = new ItemStack(ItemRegistry1.bishop);
		itemstack2[7] = new ItemStack(ItemRegistry1.blackmage);
		itemstack2[8] = new ItemStack(ItemRegistry1.bluemage);
		itemstack2[9] = new ItemStack(ItemRegistry1.cannoneer);
		itemstack2[10] = new ItemStack(ItemRegistry1.chocoboknight);
		itemstack2[11] = new ItemStack(ItemRegistry1.defender);
		itemstack2[12] = new ItemStack(ItemRegistry1.dragoon);
		itemstack2[13] = new ItemStack(ItemRegistry1.elementalist);
		itemstack2[14] = new ItemStack(ItemRegistry1.fencer);
		itemstack2[15] = new ItemStack(ItemRegistry1.fighter);
		itemstack2[16] = new ItemStack(ItemRegistry1.flintlock);
		itemstack2[17] = new ItemStack(ItemRegistry1.fusilier);
		itemstack2[18] = new ItemStack(ItemRegistry1.geomancer);
		itemstack2[19] = new ItemStack(ItemRegistry1.gladiator);
		itemstack2[20] = new ItemStack(ItemRegistry1.greenmage);
		itemstack2[21] = new ItemStack(ItemRegistry1.hunter);
		itemstack2[22] = new ItemStack(ItemRegistry1.illusionist);
		itemstack2[23] = new ItemStack(ItemRegistry1.juggler);
		itemstack2[24] = new ItemStack(ItemRegistry1.lanista);
		itemstack2[25] = new ItemStack(ItemRegistry1.mastermonk);
		itemstack2[26] = new ItemStack(ItemRegistry1.moogleknight);
		itemstack2[27] = new ItemStack(ItemRegistry1.ninja);
		itemstack2[28] = new ItemStack(ItemRegistry1.paladin);
		itemstack2[29] = new ItemStack(ItemRegistry1.ranger);
		itemstack2[30] = new ItemStack(ItemRegistry1.raptor);
		itemstack2[31] = new ItemStack(ItemRegistry1.ravager);
		itemstack2[32] = new ItemStack(ItemRegistry1.redmage);
		itemstack2[33] = new ItemStack(ItemRegistry1.sage);
		itemstack2[34] = new ItemStack(ItemRegistry1.samurai);
		itemstack2[35] = new ItemStack(ItemRegistry1.scholar);
		itemstack2[36] = new ItemStack(ItemRegistry1.seer);
		itemstack2[37] = new ItemStack(ItemRegistry1.sniper);
		itemstack2[38] = new ItemStack(ItemRegistry1.spellblade);
		itemstack2[39] = new ItemStack(ItemRegistry1.summoner);
		itemstack2[40] = new ItemStack(ItemRegistry1.templar);
		itemstack2[41] = new ItemStack(ItemRegistry1.thief);
		itemstack2[42] = new ItemStack(ItemRegistry1.timemage);
		itemstack2[43] = new ItemStack(ItemRegistry1.tinker);
		itemstack2[44] = new ItemStack(ItemRegistry1.trickster);
		itemstack2[45] = new ItemStack(ItemRegistry1.viking);
		
		//...
		for(int i = 0; i < 3; i++) {
		player.inventory.addItemStackToInventory(itemstack2[rand.nextInt(100)]);
		}
		return itemstack;
	
		
	}
	
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}
	 
	}
