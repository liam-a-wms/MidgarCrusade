package fr.toss.FF7Weapons;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;

import com.google.common.collect.Multimap;

public class Tournesol extends FF7weapon
{
private float field_150934_a;
private final Item.ToolMaterial field_150933_b;

public Tournesol(Item.ToolMaterial p_i45356_1_)

{
	
  super();
  this.field_150933_b = p_i45356_1_;
  setUnlocalizedName("Tournesol");
  this.field_150934_a = 78F + p_i45356_1_.getDamageVsEntity();
}

public float func_150931_i()
{
    return this.field_150933_b.getDamageVsEntity();
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


