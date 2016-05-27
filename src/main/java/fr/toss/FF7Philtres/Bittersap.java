package fr.toss.FF7Philtres;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Bittersap extends Item
	{
	public Bittersap(int id)
	
	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.Philtres);
	  setUnlocalizedName("Bitter_sap");
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

	public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int i)
    {
        int j = this.getMaxItemUseDuration(stack) - i;

                         
           
            player.inventory.consumeInventoryItem(ItemRegistry1.plasma);

            if (!world.isRemote)
            {
                
            }
        }
    
    /**
     * Prevents the item from being consumed on use
     */
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        return par1ItemStack;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.eat;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
       
        return par1ItemStack;
    }
}
	
	

