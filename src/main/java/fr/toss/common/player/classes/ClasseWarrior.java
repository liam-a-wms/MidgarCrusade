package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.warrior.*;

public class ClasseWarrior extends Classe {
	
	public ClasseWarrior()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "Warrior";
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

		this.CLASSE_SPELL.add(new Firstaid_1());
		this.CLASSE_SPELL.add(new Rendmagick());
		this.CLASSE_SPELL.add(new Rendpower_1());
		this.CLASSE_SPELL.add(new RendMP());
		this.CLASSE_SPELL.add(new Rendspeed_1());
		
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
		return (Warrior);
	}
}
