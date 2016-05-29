package fr.toss.common.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.common.command.ChatColor;

public class ItemArmorM extends ItemArmor {
	
	public float agility;
	public float strength;
	public float clarity;
	public float mana;
	public float endurance;
	public float mana_regeneration;
	public float fire;
	public float ice;
	public float lightning;
	public float earth;
	public float wind;
	public float water;
	public float holy;
	public float shadow;
	public float magic;
	public float projectile;
	public float physical;
	public boolean hasEffect;

	public ItemArmorM(ArmorMaterial material, int render_index, int armor_type)
	{
		super(material, render_index, armor_type);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return this.hasEffect;
    }
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
	{
		if(this.armorType != 2)
			return "magiccrusade:textures/models/armor/" + this.getArmorMaterial().toString() + "_1.png";
		else
			return "magiccrusade:textures/models/armor/" + this.getArmorMaterial().toString() + "_2.png";
	}
	
    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean bool)
    {
    	if (this.endurance != 0)
    		list.add(ChatColor.GREEN + "+ " + this.endurance + " Endurance");
    	if (this.mana != 0)
    		list.add(ChatColor.GREEN + "+ " + this.mana + " Mana");
    	if (this.strength != 0)
    		list.add(ChatColor.GREEN + "+ " + this.strength + " Strength");
    	if (this.agility != 0)
    		list.add(ChatColor.GREEN + "+ " + this.agility + " Stamina");
    	if (this.clarity != 0)
    		list.add(ChatColor.GREEN + "+ " + this.clarity + " Clarity");
    	if (this.mana_regeneration != 0)
    		list.add(ChatColor.GREEN + "+ " + this.mana_regeneration + " Mana Regen.");
    	if (this.fire != 0)
    		list.add(ChatColor.GREEN + "+ " + this.fire + " Fire damage");
    	if (this.ice != 0)
    		list.add(ChatColor.GREEN + "+ " + this.ice + " Ice damage");
    	if (this.lightning != 0)
    		list.add(ChatColor.GREEN + "+ " + this.lightning + " Lightning damage");
    	if (this.earth != 0)
    		list.add(ChatColor.GREEN + "+ " + this.earth + " Earth damage");
    	if (this.wind != 0)
    		list.add(ChatColor.GREEN + "+ " + this.wind + " Wind damage");
    	if (this.water != 0)
    		list.add(ChatColor.GREEN + "+ " + this.water + " Water damage");
    	if (this.holy != 0)
    		list.add(ChatColor.GREEN + "+ " + this.holy + " Holy damage");
    	if (this.shadow != 0)
    		list.add(ChatColor.GREEN + "+ " + this.shadow + " Shadow damage");
    	if (this.magic != 0)
    		list.add(ChatColor.GREEN + "+ " + this.magic + " Magic damage");
    	if (this.projectile != 0)
    		list.add(ChatColor.GREEN + "+ " + this.projectile + " Projectile damage");
    	if (this.physical != 0)
    		list.add(ChatColor.GREEN + "+ " + this.physical + " Physical damage");
    }
	
	public ItemArmorM setAgility(float i)
	{
		this.agility = i;
		return (this);
	}
	
	public ItemArmorM setStrenght(float i)
	{
		this.strength = i;
		return (this);
	}
	
	public ItemArmorM setClarity(float i)
	{
		this.clarity = i;
		return (this);
	}
	
	public ItemArmorM setMana(float i)
	{
		this.mana = i;
		return (this);
	}
	
	public ItemArmorM setEndurance(float i)
	{
		this.endurance = i;
		return (this);
	}
	
	public ItemArmorM setManaRegen(float f)
	{
		this.mana_regeneration = f;
		return (this);
	}
	
	public ItemArmorM setfire(float i)
	{
		this.fire = i;
		return (this);
	}
	
	public ItemArmorM setice(float i)
	{
		this.ice = i;
		return (this);
	}
	
	public ItemArmorM setlightning(float i)
	{
		this.lightning = i;
		return (this);
	}
	
	public ItemArmorM setearth(float i)
	{
		this.earth = i;
		return (this);
	}
	
	public ItemArmorM setwind(float i)
	{
		this.wind = i;
		return (this);
	}
	
	public ItemArmorM setwater(float i)
	{
		this.water = i;
		return (this);
	}
	
	public ItemArmorM setholy(float i)
	{
		this.holy = i;
		return (this);
	}
	
	public ItemArmorM setshadow(float i)
	{
		this.shadow = i;
		return (this);
	}
	
	public ItemArmorM setmagic(float i)
	{
		this.magic = i;
		return (this);
	}
	
	public ItemArmorM setprojectile(float i)
	{
		this.projectile = i;
		return (this);
	}
	
	public ItemArmorM setphysical(float i)
	{
		this.physical = i;
		return (this);
	}
	
	
	
	public ItemArmorM setHasEffect()
	{
		this.hasEffect = true;
		return (this);
	}
}
