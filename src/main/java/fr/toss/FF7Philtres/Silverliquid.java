package fr.toss.FF7Philtres;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Silverliquid extends Item
	{
	public Silverliquid(int id)
	
	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.Philtres);
	  setUnlocalizedName("Silver_liquid");
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

	
	}

