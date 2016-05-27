package fr.toss.FF7.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class FF7block extends Block {

	protected FF7block(Material rock) {
		super(Material.rock);
		setCreativeTab(ItemRegistry1.FF7Blocks);
		
		
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.blockIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

	
	
	
}
