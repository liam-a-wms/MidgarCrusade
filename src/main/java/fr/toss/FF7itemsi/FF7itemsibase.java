package fr.toss.FF7itemsi;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class FF7itemsibase extends Item {

	public FF7itemsibase(int id)

	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.FF7itemsI);
	  
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}


	}


	
	
	
	
	

