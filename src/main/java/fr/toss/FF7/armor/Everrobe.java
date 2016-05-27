package fr.toss.FF7.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;
import fr.toss.common.Main;

public class Everrobe extends ItemArmor
{
	
	public String textureName;

	public Everrobe(ArmorMaterial material, int render_idx, int type) {
		super(material, 0, type);
		this.textureName = "Everrobe";
		setUnlocalizedName("Everrobe");
		 setCreativeTab(ItemRegistry1.FF7Armor);
		this.setTextureName(Main.MODID + ":" + getUnlocalizedName());
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Main.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";

	
  
  
  
  
 
  
  
 	}

 	@SideOnly(Side.CLIENT)
 	public void registerIcons(IIconRegister iconRegister)
 	{
 		  this.itemIcon = iconRegister.registerIcon("FF7" + ":" + getUnlocalizedName().substring(5));
 	}


 	}