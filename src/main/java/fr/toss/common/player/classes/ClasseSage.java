package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.sage.*;

public class ClasseSage extends Classe {
	
	public ClasseSage()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "Sage";
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
		this.CLASSE_SPELL.add(new Gigaflare_1());
		this.CLASSE_SPELL.add(new Aero_1());
		this.CLASSE_SPELL.add(new Water_1());
		this.CLASSE_SPELL.add(new Bio_1());
		this.CLASSE_SPELL.add(new Ultimastaff_1());
		this.CLASSE_SPELL.add(new Esunaga_1());
		this.CLASSE_SPELL.add(new Blindshot_1());
		
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
		return (Sage);
	}
}
