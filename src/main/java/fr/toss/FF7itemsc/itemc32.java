package fr.toss.FF7itemsc;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class itemc32 extends Item
{
public itemc32(int id)

{
	
  super();
  
  setCreativeTab(ItemRegistry1.FF7itemsC);
  setUnlocalizedName("itemc32");
  
}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
	  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
}


}

