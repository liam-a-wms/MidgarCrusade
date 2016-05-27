package fr.toss.FF7recipeitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class subwayparts extends Item {

	public subwayparts(int id)

	{
		
	  super();
	  setUnlocalizedName("subwayparts");
	  setCreativeTab(ItemRegistry1.FF7itemsC);
	  
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}


	}


	