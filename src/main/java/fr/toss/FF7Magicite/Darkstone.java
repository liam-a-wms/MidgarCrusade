package fr.toss.FF7Magicite;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Darkstone extends Item
	{
	public Darkstone(int id)
	
	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.Magicite);
	  setUnlocalizedName("Dark_stone");
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

	
	}

