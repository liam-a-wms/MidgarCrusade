package fr.toss.common.player.race;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.Main;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.ClientPlayerBaseMagic;
import fr.toss.common.player.spells.Spell;

public class Race implements IRace {
	
	public List<Spell> Race_SPELL;
	public ClientPlayerBaseMagic player;
	
	public static final ResourceLocation Hume = new ResourceLocation("magiccrusade:textures/races/Hume.png");
	
	public Race()
	{
		this.player = Main.getPlayerClient();
		Spell.player = this.player;
		this.Race_SPELL = new ArrayList<Spell>();
		this.defineRaceSpells(); 
	}

	@Override
	/** defined all class spells */
	public void defineRaceSpells() {}


	@Override
	public String getName() 
	{
		return "";
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

	public static Race getRace(int id)
	{
		switch (id)
		{
			case 1 :
				return (new RaceHume());
				
			case 2 :
				return (new RaceMoogles());

			case 3 :
				return (new RaceViera());
			
			case 4 :
				return (new RaceBangaa());
				
			case 5 :
				return (new RaceNuMou());
				
			case 6 :
				return (new RaceSeeq());
				
			case 7 :
				return (new RaceGria());
				
			case 8 :
				return (new RaceHurdy());
				
			case 9 :
				return (new RaceVaan());
				
			case 10 :
				return (new RacePenelo());
				
			case 11 :
				return (new RaceAdello());
				
			case 12 :
				return (new RaceAlCidMargrace());
				
		}
		return (new RaceUnknown());
	}
	
	public static int getIdFromClasse(Race race)
	{

		if (race instanceof RaceHume)
			return (1);
		else if (race instanceof RaceMoogles)
			return (2);
		else if (race instanceof RaceViera)
			return (3);
		else if (race instanceof RaceBangaa)
			return (4);
		else if (race instanceof RaceNuMou)
			return (5);
		else if (race instanceof RaceSeeq)
			return (6);
		else if (race instanceof RaceGria)
			return (7);
		else if (race instanceof RaceHurdy)
			return (8);
		else if (race instanceof RaceVaan)
			return (9);
		else if (race instanceof RacePenelo)
			return (10);
		else if (race instanceof RaceAdello)
			return (11);
		
		else if (race instanceof RaceAlCidMargrace)
			return (12);
	
		else
			return (0);
	}

	public ResourceLocation getTexture()
	{
		return null;
	}
}
