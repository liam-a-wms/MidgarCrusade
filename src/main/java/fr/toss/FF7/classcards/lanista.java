package fr.toss.FF7.classcards;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;
import fr.toss.client.gui.GuiSelectClasslanista;

public class lanista extends Item
	{
	public lanista(int id)
	
	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.FF7cards);
	  setUnlocalizedName("lanista");
	  
	}

	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.addPotionEffect(new PotionEffect(ItemRegistry1.customPotion.id, 20, 0));
		Minecraft.getMinecraft().displayGuiScreen(new GuiSelectClasslanista());
		
		return par1ItemStack;
		
		
		}
	
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}
	 
	}
