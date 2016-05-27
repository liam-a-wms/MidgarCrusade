package fr.toss.FF7.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Adamantarmor extends ItemArmor
{
	
	public String textureName;

	public Adamantarmor(ArmorMaterial material, int render_idx, int type) {
		super(material, 0, type);
		this.textureName = "Adamantarmor";
		setUnlocalizedName("Adamantarmor");
		 setCreativeTab(ItemRegistry1.FF7Armor);
	//	this.setTextureName(main.MODID + ":" + getUnlocalizedName());
	}

/*	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return main.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	
  */
  
  
  
 
  
  
 	

 	@SideOnly(Side.CLIENT)
 	public void registerIcons(IIconRegister iconRegister)
 	{
 		  this.itemIcon = iconRegister.registerIcon("FF7" + ":" + getUnlocalizedName().substring(5));
 	}


 	}