package fr.toss.FF7Flora;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Magickfruit extends ItemFood
	{
	public Magickfruit(int i,int j, boolean b)
	
	{
		
	  super(j , b);
	  
	  setCreativeTab(ItemRegistry1.Flora);
	  setUnlocalizedName("Magick_fruit");
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

	
	}

