package fr.toss.FF7Flora;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Succulentfruit extends ItemFood
	{
	public Succulentfruit(int i,int j, boolean b)
	
	{
		
	  super(j , b);
	  
	  setCreativeTab(ItemRegistry1.Flora);
	  setUnlocalizedName("Succulent_fruit");
	}
	 
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}
	 public EnumAction onitemrightlclick(ItemStack p_77661_1_)
	    {
	        return EnumAction.eat;
	
	       
	}
	    public int getMaxItemUseDuration(ItemStack p_77626_1_)
	    {
	        return 32;
	}
}