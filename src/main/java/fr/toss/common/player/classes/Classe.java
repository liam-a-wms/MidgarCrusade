package fr.toss.common.player.classes;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.Main;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.ClientPlayerBaseMagic;
import fr.toss.common.player.spells.Spell;

public class Classe implements IClasse {
	
	public List<Spell> CLASSE_SPELL;
	public ClientPlayerBaseMagic player;
	
	public static final ResourceLocation PRIEST = new ResourceLocation("magiccrusade:textures/spells/priest.png");
	public static final ResourceLocation MAGE = new ResourceLocation("magiccrusade:textures/spells/mage.png");
	public static final ResourceLocation CHAMPION = new ResourceLocation("magiccrusade:textures/spells/champion.png");
	public static final ResourceLocation DRAGONSLAYER = new ResourceLocation("magiccrusade:textures/spells/dragon_slayer.png");
	public static final ResourceLocation NECROMANCER = new ResourceLocation("magiccrusade:textures/spells/necromancer.png");
	public static final ResourceLocation Soldier = new ResourceLocation("magiccrusade:textures/spells/soldier.png");
	public static final ResourceLocation WhiteMage = new ResourceLocation("magiccrusade:textures/spells/WhiteMage.png");
	public static final ResourceLocation Thief = new ResourceLocation("magiccrusade:textures/spells/Thief.png");
	public static final ResourceLocation BlackMage = new ResourceLocation("magiccrusade:textures/spells/BlackMage.png");
	public static final ResourceLocation Archer = new ResourceLocation("magiccrusade:textures/spells/Archer.png");
	public static final ResourceLocation Paladin = new ResourceLocation("magiccrusade:textures/spells/Paladin.png");
	public static final ResourceLocation Fighter = new ResourceLocation("magiccrusade:textures/spells/Fighter.png");
	public static final ResourceLocation Samurai = new ResourceLocation("magiccrusade:textures/spells/Samurai.png");
	public static final ResourceLocation Bluemage = new ResourceLocation("magiccrusade:textures/spells/Blue Mage.png");
	public static final ResourceLocation Illusionist = new ResourceLocation("magiccrusade:textures/spells/Illusionist.png");
	public static final ResourceLocation Seer = new ResourceLocation("magiccrusade:textures/spells/Seer.png");
	public static final ResourceLocation Ninja = new ResourceLocation("magiccrusade:textures/spells/Ninja.png");
	public static final ResourceLocation Animist = new ResourceLocation("magiccrusade:textures/spells/Animist.png");
	public static final ResourceLocation MoogleKnight = new ResourceLocation("magiccrusade:textures/spells/Moogle Knight.png");
	public static final ResourceLocation Fusilier = new ResourceLocation("magiccrusade:textures/spells/Fusilier.png");
	public static final ResourceLocation Juggler = new ResourceLocation("magiccrusade:textures/spells/Juggler.png");
	public static final ResourceLocation Tinker = new ResourceLocation("magiccrusade:textures/spells/Tinker.png");
	public static final ResourceLocation TimeMage = new ResourceLocation("magiccrusade:textures/spells/Time Mage.png");
	public static final ResourceLocation ChocoboKnight = new ResourceLocation("magiccrusade:textures/spells/Chocobo Knight.png");
	public static final ResourceLocation Flintlock = new ResourceLocation("magiccrusade:textures/spells/Flintlock.png");
	public static final ResourceLocation Fencer = new ResourceLocation("magiccrusade:textures/spells/Fencer.png");
	public static final ResourceLocation Assassin = new ResourceLocation("magiccrusade:textures/spells/Assassin.png");
	public static final ResourceLocation Summoner = new ResourceLocation("magiccrusade:textures/spells/Summoner.png");
	public static final ResourceLocation Sniper = new ResourceLocation("magiccrusade:textures/spells/Sniper.png");
	public static final ResourceLocation Elementalist = new ResourceLocation("magiccrusade:textures/spells/Elementalist.png");
	public static final ResourceLocation RedMage = new ResourceLocation("magiccrusade:textures/spells/Red Mage.png");
	public static final ResourceLocation GreenMage = new ResourceLocation("magiccrusade:textures/spells/Green Mage.png");
	public static final ResourceLocation Spellblade = new ResourceLocation("magiccrusade:textures/spells/Spellblade.png");
	public static final ResourceLocation Warrior = new ResourceLocation("magiccrusade:textures/spells/Warrior.png");
	public static final ResourceLocation WhiteMonk = new ResourceLocation("magiccrusade:textures/spells/White Monk.png");
	public static final ResourceLocation Dragoon = new ResourceLocation("magiccrusade:textures/spells/Dragoon.png");
	public static final ResourceLocation Defender = new ResourceLocation("magiccrusade:textures/spells/Defender.png");
	public static final ResourceLocation Bishop = new ResourceLocation("magiccrusade:textures/spells/Bishop.png");
	public static final ResourceLocation Gladiator = new ResourceLocation("magiccrusade:textures/spells/Gladiator.png");
	public static final ResourceLocation Templar = new ResourceLocation("magiccrusade:textures/spells/Templar.png");
	public static final ResourceLocation Cannoneer = new ResourceLocation("magiccrusade:textures/spells/Cannoneer.png");
	public static final ResourceLocation MasterMonk = new ResourceLocation("magiccrusade:textures/spells/master_monk.png");
	public static final ResourceLocation Trickster = new ResourceLocation("magiccrusade:textures/spells/Trickster.png");
	public static final ResourceLocation Beastmaster = new ResourceLocation("magiccrusade:textures/spells/Beastmaster.png");
	public static final ResourceLocation Sage = new ResourceLocation("magiccrusade:textures/spells/Sage.png");
	public static final ResourceLocation Alchemist = new ResourceLocation("magiccrusade:textures/spells/Alchemist.png");
	public static final ResourceLocation Arcanist = new ResourceLocation("magiccrusade:textures/spells/Arcanist.png");
	public static final ResourceLocation Scholar = new ResourceLocation("magiccrusade:textures/spells/Scholar.png");
	public static final ResourceLocation Ranger = new ResourceLocation("magiccrusade:textures/spells/Ranger.png");
	public static final ResourceLocation Berserker = new ResourceLocation("magiccrusade:textures/spells/Berserker.png");
	public static final ResourceLocation Lanista = new ResourceLocation("magiccrusade:textures/spells/Lanista.png");
	public static final ResourceLocation Viking = new ResourceLocation("magiccrusade:textures/spells/Viking.png");
	public static final ResourceLocation Raptor = new ResourceLocation("magiccrusade:textures/spells/Raptor.png");
	public static final ResourceLocation Hunter = new ResourceLocation("magiccrusade:textures/spells/Hunter.png");
	public static final ResourceLocation Ravager = new ResourceLocation("magiccrusade:textures/spells/Ravager.png");
	public static final ResourceLocation Geomancer = new ResourceLocation("magiccrusade:textures/spells/Geomancer.png");
	public static final ResourceLocation Agent = new ResourceLocation("magiccrusade:textures/spells/Agent.png");
	public static final ResourceLocation Heritor = new ResourceLocation("magiccrusade:textures/spells/Heritor.png");
	public static final ResourceLocation Dancer = new ResourceLocation("magiccrusade:textures/spells/Dancer.png");
	public static final ResourceLocation skypirate = new ResourceLocation("magiccrusade:textures/spells/sky_pirate.png");
	public static final ResourceLocation Bard = new ResourceLocation("magiccrusade:textures/spells/Bard.png");
	public static final ResourceLocation ROGUE = new ResourceLocation("magiccrusade:textures/spells/rogue.png");
	

	public Classe()
	{
		this.player = Main.getPlayerClient();
		Spell.player = this.player;
		this.CLASSE_SPELL = new ArrayList<Spell>();
		this.defineClasseSpells(); 
	}

	@Override
	/** defined all class spells */
	public void defineClasseSpells() {}


	@Override
	public String getName() 
	{
		return "Paysan";
	}

	@Override
	public ChatColor getColor() 
	{
		return ChatColor.WHITE;
	}

	@Override
	public EnumType getType() 
	{
		return null;
	}


	@Override
	public int getMaxEnergy()
	{
		return 100;
	}
	
	@Override
	public int getBaseEnergyRegen()
	{
		return 1;
	}

	public static Classe getClasse(int id)
	{
		switch (id)
		{
			case 1 :
				return (new ClasseChampion());
				
			case 2 :
				return (new ClasseDragonslayer());

			case 3 :
				return (new ClassePriest());
			
			case 4 :
				return (new ClasseNecromancer());
				
			case 5 :
				return (new ClasseMage());
				
			case 6 :
				return (new ClasseRogue());
				
			case 7 :
				return (new ClasseThief());
				
			case 8 :
				return (new ClasseBlackmage());
				
			case 9 :
				return (new ClasseArcher());
				
			case 10 :
				return (new ClassePaladin());
				
			case 11 :
				return (new ClasseFighter());
				
			case 12 :
				return (new ClasseSamurai());
				
			case 13 :
				return (new ClasseBluemage());
				
			case 14 :
				return (new ClasseIllusionist());
				
			case 15 :
				return (new ClasseSeer());
				
			case 16 :
				return (new ClasseNinja());
				
			case 17 :
				return (new ClasseAnimist());
				
			case 18 :
				return (new ClasseMoogleKnight());
				
			case 19 :
				return (new ClasseFusilier());
				
			case 20 :
				return (new ClasseJuggler());
				
			case 21 :
				return (new ClasseTinker());
				
			case 22 :
				return (new ClasseTimeMage());
				
			case 23 :
				return (new ClasseChocoboKnight());
				
			case 24 :
				return (new ClasseFlintlock());
				
			case 25 :
				return (new ClasseFencer());
				
			case 26 :
				return (new ClasseAssassin());
				
			case 27 :
				return (new ClasseSummoner());
				
			case 28 :
				return (new ClasseSniper());
				
			case 29 :
				return (new ClasseElementalist());
				
			case 30 :
				return (new ClasseRedMage());
				
			case 31 :
				return (new ClasseGreenMage());
				
			case 32 :
				return (new ClasseWarrior());
				
			case 33 :
				return (new ClasseWhiteMonk());
				
			case 34 :
				return (new ClasseDragoon());
				
			case 35 :
				return (new ClasseDefender());
				
			case 36 :
				return (new ClasseBishop());
				
			case 37 :
				return (new ClasseGladiator());
				
			case 38 :
				return (new ClasseTemplar());
				
			case 39 :
				return (new ClasseCannoneer());
				
			case 40 :
				return (new ClasseMasterMonk());
				
			case 41 :
				return (new ClasseTrickster());
				
			case 42 :
				return (new ClasseBeastmaster());
				
			case 43 :
				return (new ClasseSage());
				
			case 44 :
				return (new ClasseAlchemist());
				
			case 45 :
				return (new ClasseArcanist());
				
			case 46 :
				return (new ClasseScholar());
				
			case 47 :
				return (new ClasseRanger());
				
			case 48 :
				return (new ClasseBerserker());
				
			case 49 :
				return (new ClasseLanista());
				
			case 50 :
				return (new ClasseViking());
				
			case 51 :
				return (new ClasseRaptor());
				
			case 52 :
				return (new ClasseHunter());
				
			case 53 :
				return (new ClasseRavager());
				
			case 54 :
				return (new ClasseGeomancer());
				
			case 55 :
				return (new ClasseAgent());
				
			case 56 :
				return (new ClasseHeritor());
				
			case 57 :
				return (new ClasseDancer());
				
			case 58 :
				return (new Classeskypirate());
				
			case 59 :
				return (new ClasseBard());
				
			case 60 :
				return (new ClasseSoldier());
					
		}
		return (new ClasseFarmer());
	}
	
	public static int getIdFromClasse(Classe classe)
	{

		if (classe instanceof ClasseChampion)
			return (1);
		else if (classe instanceof ClasseDragonslayer)
			return (2);
		else if (classe instanceof ClassePriest)
			return (3);
		else if (classe instanceof ClasseNecromancer)
			return (4);
		else if (classe instanceof ClasseMage)
			return (5);
		else if (classe instanceof ClasseRogue)
			return (6);
		else if (classe instanceof ClasseThief)
			return (7);
		else if (classe instanceof ClasseBlackmage)
			return (8);
		else if (classe instanceof ClasseArcher)
			return (9);
		else if (classe instanceof ClassePaladin)
			return (10);
		else if (classe instanceof ClasseFighter)
			return (11);
		else if (classe instanceof ClasseSamurai)
			return (12);
		else if (classe instanceof ClasseBluemage)
			return (13);
		else if (classe instanceof ClasseIllusionist)
			return (14);
		else if (classe instanceof ClasseSeer)
			return (15);
		else if (classe instanceof ClasseNinja)
			return (16);
		else if (classe instanceof ClasseAnimist)
			return (17);
		else if (classe instanceof ClasseMoogleKnight)
			return (18);
		else if (classe instanceof ClasseFusilier)
			return (19);
		else if (classe instanceof ClasseJuggler)
			return (20);
		else if (classe instanceof ClasseTinker)
			return (21);
		else if (classe instanceof ClasseTimeMage)
			return (22);
		else if (classe instanceof ClasseChocoboKnight)
			return (23);
		else if (classe instanceof ClasseFlintlock)
			return (24);
		else if (classe instanceof ClasseFencer)
			return (25);
		else if (classe instanceof ClasseAssassin)
			return (26);
		else if (classe instanceof ClasseSummoner)
			return (27);
		else if (classe instanceof ClasseSniper)
			return (28);
		else if (classe instanceof ClasseElementalist)
			return (29);
		else if (classe instanceof ClasseRedMage)
			return (30);
		else if (classe instanceof ClasseGreenMage)
			return (31);
		else if (classe instanceof ClasseWarrior)
			return (32);
		else if (classe instanceof ClasseWhiteMonk)
			return (33);
		else if (classe instanceof ClasseDragoon)
			return (34);
		else if (classe instanceof ClasseDefender)
			return (35);
		else if (classe instanceof ClasseBishop)
			return (36);
		else if (classe instanceof ClasseGladiator)
			return (37);
		else if (classe instanceof ClasseTemplar)
			return (38);
		else if (classe instanceof ClasseCannoneer)
			return (39);
		else if (classe instanceof ClasseMasterMonk)
			return (40);
		else if (classe instanceof ClasseTrickster)
			return (41);
		else if (classe instanceof ClasseBeastmaster)
			return (42);
		else if (classe instanceof ClasseSage)
			return (43);
		else if (classe instanceof ClasseAlchemist)
			return (44);
		else if (classe instanceof ClasseArcanist)
			return (45);
		else if (classe instanceof ClasseScholar)
			return (46);
		else if (classe instanceof ClasseRanger)
			return (47);
		else if (classe instanceof ClasseBerserker)
			return (48);
		else if (classe instanceof ClasseLanista)
			return (49);
		else if (classe instanceof ClasseViking)
			return (50);
		else if (classe instanceof ClasseRaptor)
			return (51);
		else if (classe instanceof ClasseHunter)
			return (52);
		else if (classe instanceof ClasseRavager)
			return (53);
		else if (classe instanceof ClasseGeomancer)
			return (54);
		else if (classe instanceof ClasseAgent)
			return (55);
		else if (classe instanceof ClasseHeritor)
			return (56);
		else if (classe instanceof ClasseDancer)
			return (57);
		else if (classe instanceof Classeskypirate)
			return (58);
		else if (classe instanceof ClasseBard)
			return (59);
		else if (classe instanceof ClasseSoldier)
			return (60);
		else
			return (0);
	}

	public ResourceLocation getTexture()
	{
		return null;
	}
}
