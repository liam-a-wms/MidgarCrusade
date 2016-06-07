package fr.toss.FF7.projectile.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Copy_3_of_plasma extends Item
{
	
	public Copy_3_of_plasma(int id)
	{
		super();
		  setUnlocalizedName("plasma");
		  setCreativeTab(ItemRegistry1.Weapons);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
	  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

		
		
	}
