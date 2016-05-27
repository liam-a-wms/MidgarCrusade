package fr.toss.FF7Bones;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Alraunedrill  extends Item
{
	
public Alraunedrill(int par1)
{
  super();
  setMaxStackSize(64);
  setCreativeTab(ItemRegistry1.Bones);
  setUnlocalizedName("Alraune_drill");
}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
}

	
	
}
