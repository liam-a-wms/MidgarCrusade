package fr.toss.FF7.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class PhoenixFeather
extends Item
{
public PhoenixFeather(int par1)
{
  super();
  setMaxStackSize(1);
  setCreativeTab(ItemRegistry1.FF7itemsC);
  setUnlocalizedName("Phoenix_feather");
}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
}

public boolean hasEffect(ItemStack par1ItemStack)
{
  return true;
}

public CreativeTabs[] getCreativeTabs()
{
  return new CreativeTabs[] { getCreativeTab(), CreativeTabs.tabCombat };
}
}
