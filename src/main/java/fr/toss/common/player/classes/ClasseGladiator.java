package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;

import fr.toss.common.player.spells.gladiator.*;

public class ClasseGladiator extends Classe {
	
	public ClasseGladiator()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "Gladiator";
	}

	@Override
	public ChatColor getColor() 
	{
		return ChatColor.RED;
	}

	@Override
	/** definis tous les sorts de la classe */
	public void defineClasseSpells()
	{	
		this.CLASSE_SPELL.clear();

		this.CLASSE_SPELL.add(new Rush_1());
		this.CLASSE_SPELL.add(new Wildswing_1());
		this.CLASSE_SPELL.add(new Blizzardtackle_1());
		this.CLASSE_SPELL.add(new Thunderassault_1());
		this.CLASSE_SPELL.add(new Firesoul_1());
		this.CLASSE_SPELL.add(new Ultimasword_1());
	}
	
	@Override
	public EnumType getType() 
	{
		return EnumType.TANK;
	}
	
	@Override
	public int getMaxEnergy()
	{
		return 1000;
	}
	
	@Override
	public int getBaseEnergyRegen()
	{
		return -1;
	}
	
	@Override
	public ResourceLocation getTexture()
	{
		return (Gladiator);
	}
}
