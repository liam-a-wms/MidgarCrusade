package fr.toss.FF7Philtres;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Sweetsap extends Item
	{
	public Sweetsap(int id)
	
	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.Philtres);
	  setUnlocalizedName("Sweet_sap");
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

	
	}

