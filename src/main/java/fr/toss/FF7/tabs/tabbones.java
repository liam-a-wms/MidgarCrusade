package fr.toss.FF7.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public final class tabbones extends CreativeTabs
{
    public tabbones(int par1, String par2Str)
    {
        super(par1, par2Str);
        
    }

    
		
	
	@SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
    	return ItemRegistry1.Boneicon;
    }
}
