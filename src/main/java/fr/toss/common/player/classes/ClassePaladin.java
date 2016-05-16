package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;

import fr.toss.common.player.spells.paladin.*;

public class ClassePaladin extends Classe {
	
	public ClassePaladin()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "Paladin";
	}

	@Override
	public ChatColor getColor() 
	{
		return ChatColor.AQUA;
	}

	@Override
	/** definis tous les sorts de la classe */
	public void defineClasseSpells()
	{	
		this.CLASSE_SPELL.clear();
		this.CLASSE_SPELL.add(new Defender_1());
		this.CLASSE_SPELL.add(new Holyblade_1());
		this.CLASSE_SPELL.add(new Nurse_1());
		this.CLASSE_SPELL.add(new Saintcross_1());
		this.CLASSE_SPELL.add(new Warcry_1());
		this.CLASSE_SPELL.add(new Sanctify_1());
		this.CLASSE_SPELL.add(new Cover_1());
		}
	
	@Override
	public EnumType getType() 
	{
		return EnumType.DPS;
	}
	
	@Override
	public int getMaxEnergy()
	{
		return 2000;
	}
	
	@Override
	public int getBaseEnergyRegen()
	{
		return 5;
	}
	
	@Override
	public ResourceLocation getTexture()
	{
		return (Paladin);
	}
}
