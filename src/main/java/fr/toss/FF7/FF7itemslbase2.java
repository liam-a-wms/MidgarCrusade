package fr.toss.FF7;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;
import fr.toss.common.command.ChatColor;
import fr.toss.common.items.ItemArmorM;

public class FF7itemslbase2 extends ItemArmorM 
{

	public FF7itemslbase2(ArmorMaterial material, int render_index,
			int armor_type) {
		super(material, render_index, armor_type);
		// TODO Auto-generated constructor stub
		  setCreativeTab(ItemRegistry1.FF7itemsL);
		  
		  
		}

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
		
		
		public FF7itemslbase2 setAgility(float i)
		{
			this.agility = i;
			return (this);
		}
		
		public FF7itemslbase2 setStrenght(float i)
		{
			this.strength = i;
			return (this);
		}
		
		public FF7itemslbase2 setClarity(float i)
		{
			this.clarity = i;
			return (this);
		}
		
		public FF7itemslbase2 setMana(float i)
		{
			this.mana = i;
			return (this);
		}
		
		public FF7itemslbase2 setEndurance(float i)
		{
			this.endurance = i;
			return (this);
		}
		
		public FF7itemslbase2 setManaRegen(int i)
		{
			this.mana_regeneration = i;
			return (this);
		}
		
		
		public FF7itemslbase2 setfire(float i)
		{
			this.fire = i;
			return (this);
		}
		
		public FF7itemslbase2 setice(float i)
		{
			this.ice = i;
			return (this);
		}
		
		public FF7itemslbase2 setlightning(float i)
		{
			this.lightning = i;
			return (this);
		}
		
		public FF7itemslbase2 setearth(float i)
		{
			this.earth = i;
			return (this);
		}
		
		public FF7itemslbase2 setwind(float i)
		{
			this.wind = i;
			return (this);
		}
		
		public FF7itemslbase2 setwater(float i)
		{
			this.water = i;
			return (this);
		}
		
		public FF7itemslbase2 setholy(float i)
		{
			this.holy = i;
			return (this);
		}
		
		public FF7itemslbase2 setshadow(float i)
		{
			this.shadow = i;
			return (this);
		}
		
		public FF7itemslbase2 setmagic(float i)
		{
			this.magic = i;
			return (this);
		}
		
		public FF7itemslbase2 setprojectile(float i)
		{
			this.projectile = i;
			return (this);
		}
		
		public FF7itemslbase2 setphysical(float i)
		{
			this.physical = i;
			return (this);
		}
		
		
		
		public FF7itemslbase2 setHasEffect()
		{
			this.hasEffect = true;
			return (this);
		}
		
		
		
		
		
		
		
		@SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister iconRegister)
		{
			  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
		}


		}


		
		
		
		
		

