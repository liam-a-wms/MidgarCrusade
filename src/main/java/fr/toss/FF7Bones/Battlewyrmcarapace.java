package fr.toss.FF7Bones;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Battlewyrmcarapace  extends Item
{
	
public Battlewyrmcarapace(int par1)
{
  super();
  setMaxStackSize(64);
    setUnlocalizedName("Battle_wyrm_carapace");
    setCreativeTab(ItemRegistry1.Bones);
}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
	  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
}
}