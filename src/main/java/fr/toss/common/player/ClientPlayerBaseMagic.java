package fr.toss.common.player;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import api.player.client.ClientPlayerAPI;
import api.player.client.ClientPlayerBase;
import fr.toss.client.event.SoundEventM;
import fr.toss.client.gui.GuiSelectClass;
import fr.toss.client.gui.GuiSelectRace;
import fr.toss.common.Main;
import fr.toss.common.command.ChatColor;
import fr.toss.common.items.ItemArmorM;
import fr.toss.common.items.ItemSwordM;
import fr.toss.common.packet.PacketLogIn;
import fr.toss.common.player.classes.Classe;
import fr.toss.common.player.classes.ClasseAlchemist;
import fr.toss.common.player.classes.ClasseAnimist;
import fr.toss.common.player.classes.ClasseArcanist;
import fr.toss.common.player.classes.ClasseArcher;
import fr.toss.common.player.classes.ClasseAssassin;
import fr.toss.common.player.classes.ClasseBeastmaster;
import fr.toss.common.player.classes.ClasseBerserker;
import fr.toss.common.player.classes.ClasseBishop;
import fr.toss.common.player.classes.ClasseBlackmage;
import fr.toss.common.player.classes.ClasseBluemage;
import fr.toss.common.player.classes.ClasseCannoneer;
import fr.toss.common.player.classes.ClasseChampion;
import fr.toss.common.player.classes.ClasseDefender;
import fr.toss.common.player.classes.ClasseDragoon;
import fr.toss.common.player.classes.ClasseElementalist;
import fr.toss.common.player.classes.ClasseFencer;
import fr.toss.common.player.classes.ClasseFighter;
import fr.toss.common.player.classes.ClasseFlintlock;
import fr.toss.common.player.classes.ClasseFusilier;
import fr.toss.common.player.classes.ClasseGeomancer;
import fr.toss.common.player.classes.ClasseGladiator;
import fr.toss.common.player.classes.ClasseGreenMage;
import fr.toss.common.player.classes.ClasseHunter;
import fr.toss.common.player.classes.ClasseIllusionist;
import fr.toss.common.player.classes.ClasseJuggler;
import fr.toss.common.player.classes.ClasseLanista;
import fr.toss.common.player.classes.ClasseMage;
import fr.toss.common.player.classes.ClasseMasterMonk;
import fr.toss.common.player.classes.ClasseNecromancer;
import fr.toss.common.player.classes.ClasseNinja;
import fr.toss.common.player.classes.ClassePaladin;
import fr.toss.common.player.classes.ClassePriest;
import fr.toss.common.player.classes.ClasseDragonslayer;
import fr.toss.common.player.classes.ClasseRanger;
import fr.toss.common.player.classes.ClasseRaptor;
import fr.toss.common.player.classes.ClasseRavager;
import fr.toss.common.player.classes.ClasseRedMage;
import fr.toss.common.player.classes.ClasseRogue;
import fr.toss.common.player.classes.ClasseSage;
import fr.toss.common.player.classes.ClasseSamurai;
import fr.toss.common.player.classes.ClasseScholar;
import fr.toss.common.player.classes.ClasseSeer;
import fr.toss.common.player.classes.ClasseSniper;
import fr.toss.common.player.classes.ClasseSoldier;
import fr.toss.common.player.classes.ClasseSpellblade;
import fr.toss.common.player.classes.ClasseSummoner;
import fr.toss.common.player.classes.ClasseTemplar;
import fr.toss.common.player.classes.ClasseThief;
import fr.toss.common.player.classes.ClasseTimeMage;
import fr.toss.common.player.classes.ClasseTinker;
import fr.toss.common.player.classes.ClasseTrickster;
import fr.toss.common.player.classes.ClasseViking;
import fr.toss.common.player.classes.ClasseWarrior;
import fr.toss.common.player.classes.ClasseWhiteMonk;
import fr.toss.common.player.classes.ClasseWhitemage;
import fr.toss.common.player.race.Race;
import fr.toss.common.player.spells.Spell;

public class ClientPlayerBaseMagic extends ClientPlayerBase
{
	public Item armor[];

	public Race race;
	public Classe classe;
	public int level;
	public int experience;
	public int experience_to_get;
	public float exp_to_next_level;
	
	public boolean canJumpOnWater;
	public long water_jump_delay;
	
	public float clarity;
	public float energy;
	public float max_energy;
	public float energy_regen;
	public float strength;
	public float agility;
	public float endurance;
	public float holy;
	public double hp;
	
	public long last_hit;

	public ClientPlayerBaseMagic(ClientPlayerAPI playerapi)
	{
		super(playerapi);
		this.armor = new Item[5];
	}
	

	/** definit la classe à partir de son ID  */
	public void initPlayer(PacketLogIn packet)
	{
		this.race = Race.getRace(packet.race_id);
		this.experience = packet.current_experience;
		this.classe = Classe.getClasse(packet.classe_id);
		this.max_energy = this.classe.getMaxEnergy();
		this.energy_regen = this.classe.getBaseEnergyRegen();
		this.level = packet.level;
		this.exp_to_next_level = this.level * 20 * (this.level + 1);
		this.energy = this.max_energy;
		
		if (packet.race_id == 0)
			Minecraft.getMinecraft().displayGuiScreen(new GuiSelectRace());
	}
	
	public void init(int p_classe,int i_race) throws InstantiationException, IllegalAccessException
	{
		this.race = Race.getRace(i_race);
		this.classe = Classe.getClasse(p_classe);
		if (this.classe != null)
		{
			this.max_energy = this.classe.getMaxEnergy();
			this.energy_regen = this.classe.getBaseEnergyRegen();
			this.energy = (classe instanceof ClasseChampion) ? 0 : this.max_energy;
			this.level = 1;
			this.experience = 0;
			this.exp_to_next_level = this.level * 20 * (this.level + 1);
			this.armor = new Item[5];
			this.clarity = 0;
			this.strength = 0;
			this.agility = 0;
			this.endurance = 0;
			this.holy = 0;
		}
	}
	
	@Override
	/** Lorsque le joueur est update */
	public void onUpdate()
	{
		super.onUpdate();
		
		if (this.getPlayer().dimension == Main.DIM_ID)
			SoundEventM.update_sound(this.getPlayer().worldObj.isDaytime(), this.player.worldObj.rand);
		
		if (this.getPlayer().capabilities.isCreativeMode)
			this.energy = this.max_energy;
		if (this.classe instanceof ClasseChampion|| this.classe instanceof ClasseSoldier|| this.classe instanceof ClasseFighter
    			|| this.classe instanceof ClasseSamurai|| this.classe instanceof ClasseWarrior|| this.classe instanceof ClasseDragoon
    			|| this.classe instanceof ClasseDefender|| this.classe instanceof ClasseGladiator|| this.classe instanceof ClasseBerserker
    			|| this.classe instanceof ClasseLanista|| this.classe instanceof ClasseViking|| this.classe instanceof ClasseRaptor
    			|| this.classe instanceof ClasseRavager)
		{
			long time = System.currentTimeMillis();
			
			if (this.energy > 0 && time - this.last_hit > 5000)
				this.energy--;
		}
		else if (this.classe instanceof ClasseNecromancer || this.classe instanceof ClasseMage || this.classe instanceof ClassePriest
       	     || this.classe instanceof ClasseBlackmage|| this.classe instanceof ClasseBluemage|| this.classe instanceof ClasseGreenMage
       	     || this.classe instanceof ClasseTimeMage|| this.classe instanceof ClasseRedMage|| this.classe instanceof ClasseWhitemage
       	     || this.classe instanceof ClassePaladin|| this.classe instanceof ClasseIllusionist|| this.classe instanceof ClasseSeer
       	     || this.classe instanceof ClasseSummoner|| this.classe instanceof ClasseElementalist|| this.classe instanceof ClasseSpellblade
       	     || this.classe instanceof ClasseBishop|| this.classe instanceof ClasseTemplar|| this.classe instanceof ClasseSage
       	     || this.classe instanceof ClasseAlchemist|| this.classe instanceof ClasseArcanist|| this.classe instanceof ClasseScholar
       	     || this.classe instanceof ClasseGeomancer)
		{
			if (this.energy < this.max_energy)
				this.increase_energy(this.energy_regen);
		}
		else if (this.classe instanceof ClasseDragonslayer || this.classe instanceof ClasseRogue
        		|| this.classe instanceof ClasseThief|| this.classe instanceof ClasseArcher
        		|| this.classe instanceof ClasseHunter|| this.classe instanceof ClasseNinja
        		|| this.classe instanceof ClasseAnimist|| this.classe instanceof ClasseFusilier
        		|| this.classe instanceof ClasseJuggler|| this.classe instanceof ClasseTinker
        		|| this.classe instanceof ClasseFlintlock|| this.classe instanceof ClasseFencer
        		|| this.classe instanceof ClasseAssassin|| this.classe instanceof ClasseSniper
        		|| this.classe instanceof ClasseWhiteMonk|| this.classe instanceof ClasseCannoneer
        		|| this.classe instanceof ClasseMasterMonk|| this.classe instanceof ClasseTrickster
        		|| this.classe instanceof ClasseBeastmaster|| this.classe instanceof ClasseRanger)
		{
			if (this.energy < this.getClasse().getMaxEnergy())
				this.energy++;
		}
		
		if (this.experience_to_get > 0)
		{
			this.experience += 8;
			if (this.experience >= this.exp_to_next_level && this != null)
			{
				this.onLevelUp();
			}
			this.experience_to_get -= 8;
		}
		this.updateArmor();
	}

	/** Mis à jour de l'amure du joueur */
	public void updateArmor()
	{
		 for (int i = 0; i < 4; i++)
		 {
			 ItemStack is = this.player.inventory.armorInventory[i];
			 if (is != null)
			 {
				 Item item = is.getItem();
				 if (item != this.armor[i])
				 {
					 if (item instanceof ItemArmorM)
					 {
						 this.clarity += ((ItemArmorM)item).clarity;
						 this.endurance += ((ItemArmorM)item).endurance;
						 this.strength += ((ItemArmorM)item).strength;
						 this.agility += ((ItemArmorM)item).agility;
						 this.max_energy += ((ItemArmorM)item).mana;
						 this.holy += ((ItemArmorM)item).holy;
						 this.energy_regen += ((ItemArmorM)item).mana_regeneration;
					 }
					 this.armor[i] = item;
				 }	 
			 }
			 else if (is == null && this.armor[i] != null)
			 {
				 if (this.armor[i] instanceof ItemArmorM)
				 {
					 this.clarity -= ((ItemArmorM)this.armor[i]).clarity;
					 this.endurance -= ((ItemArmorM)this.armor[i]).endurance;
					 this.strength -= ((ItemArmorM)this.armor[i]).strength;
					 this.agility -= ((ItemArmorM)this.armor[i]).agility;
					 this.holy -= ((ItemArmorM)this.armor[i]).holy;
					 this.max_energy -= ((ItemArmorM)this.armor[i]).mana;
					 this.energy_regen -= ((ItemArmorM)this.armor[i]).mana_regeneration;
				 }
				 this.armor[i] = null;
			 }
		 }		
		 
		 ItemStack is = this.player.inventory.getCurrentItem();
		 if (is != null)
		 {
			 Item item = is.getItem();
			 if (item != this.armor[4])
			 {
				 if (item instanceof ItemSwordM)
				 {
					 this.clarity += ((ItemSwordM)item).clarity;
					 this.endurance += ((ItemSwordM)item).endurance;
					 this.strength += ((ItemSwordM)item).strength;
					 this.agility += ((ItemSwordM)item).agility;
					 this.holy += ((ItemSwordM)item).holy;
					 if (this.getClasse() instanceof ClasseNecromancer || this.getClasse() instanceof ClasseMage)
						 this.max_energy += ((ItemSwordM)item).mana;
					 this.energy_regen += ((ItemSwordM)item).mana_regeneration;
				 }
				 this.armor[4] = item;
			 }	 
		 }
		 else if (is == null && this.armor[4] != null)
		 {
			 if (this.armor[4] instanceof ItemSwordM)
			 {
				 this.clarity -= ((ItemSwordM)this.armor[4]).clarity;
				 this.endurance -= ((ItemSwordM)this.armor[4]).endurance;
				 this.strength -= ((ItemSwordM)this.armor[4]).strength;
				 this.agility -= ((ItemSwordM)this.armor[4]).agility;
				 this.holy -= ((ItemSwordM)this.armor[4]).holy;
				 if (this.getClasse() instanceof ClasseNecromancer || this.getClasse() instanceof ClasseMage)
					 this.max_energy -= ((ItemSwordM)this.armor[4]).mana;
				 this.energy_regen -= ((ItemSwordM)this.armor[4]).mana_regeneration;
			 }
			 this.armor[4] = null;
		 }
	}
	
	/** Lorsque le joueur monte d'un niveau */
	public void onLevelUp()
	{
		this.experience = 0;
		this.level = (this.level >= 20) ? 20 : this.level + 1;
		this.exp_to_next_level = this.level * 20 * (this.level + 1);
		
		this.player.addChatComponentMessage(new ChatComponentText(ChatColor.GREEN + "You have reached level " + this.level + ChatColor.RESET));

		for (Spell spell : this.getClasse().CLASSE_SPELL)
		{
			if (this.getLevel() == spell.getLevel())
				this.player.addChatComponentMessage(new ChatComponentText(ChatColor.GREEN + "You have unlocked a new spell: " + ChatColor.UNDERLINE + spell.getName() + ChatColor.RESET));
		}
	}
		 
	/** Retourne le joueur */
	public EntityPlayer getPlayer()
	{
		return (this.player);
	}

	/** Retourne le niveau du joueur */
	public int getLevel()
	{
		return (this.level);
	}
	
	/** Definit le niveau du joueur */
	public void setLevel(int p_level)
	{
		if (p_level != this.level)
		{
			this.level = p_level;
			this.setCurrentExperience(0);
		}
	}

	public Race getRace()
	{
		return (this.race);
	}

	
	/** Retournes la classe du joueur */
	public Classe getClasse()
	{
		return (this.classe);
	}

	/** Definit l'experience du joueur */
	public void setCurrentExperience(int current_experience)
	{
		this.experience = current_experience;
	}

	/** Réduit l'energy du joueur */
	public void decreaseEnergy(int cost)
	{
		this.energy -= cost;
	}

	/** Renvoie vrai si le joueur a assez d'energie */
	public boolean hasEnoughEnergy(int cost)
	{
		return (this.energy >= cost);
	}


	public void increase_energy(float i)
	{
		this.energy += i;
		if (energy > this.max_energy)
			this.energy = max_energy;
	}


	public int getMaxEnergy(int mana)
	{
		if (this.getClasse() instanceof ClasseMage || this.getClasse() instanceof ClasseNecromancer)
			return (this.getClasse().getMaxEnergy() + mana);
		else
			return (this.getClasse().getMaxEnergy());
	}
}