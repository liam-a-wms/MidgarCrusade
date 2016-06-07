package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.berserker.*;

public class ClasseBerserker extends Classe {
	
	public ClasseBerserker()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "Berserker";
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

		this.CLASSE_SPELL.add(new FuroreT());
		this.CLASSE_SPELL.add(new ScreamT());
		this.CLASSE_SPELL.add(new SmiteofrageT());
		this.CLASSE_SPELL.add(new HelmsmashW());
		
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
		return (Berserker);
	}
}
