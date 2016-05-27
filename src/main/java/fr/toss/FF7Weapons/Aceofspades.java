package fr.toss.FF7Weapons;

import com.google.common.collect.Multimap;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Aceofspades extends FF7weapon
	{
	public boolean idle;
	private float field_150934_a;
	private final Item.ToolMaterial field_150933_b;
	public Aceofspades(Item.ToolMaterial p_i45356_1_)
	
	{
		
	  super();
	  this.field_150933_b = p_i45356_1_;
	  setUnlocalizedName("Ace_of_spades");
	  this.field_150934_a = 4.0F + p_i45356_1_.getDamageVsEntity();
	}

	public float func_150931_i()
    {
        return this.field_150933_b.getDamageVsEntity();
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}
	 public String getToolMaterialName()
	    {
	        return this.field_150933_b.toString();
	    }

	 public Multimap getItemAttributeModifiers()
	    {
	        Multimap multimap = super.getItemAttributeModifiers();
	        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.field_150934_a, 0));
	        return multimap;
	    }
	}
	

