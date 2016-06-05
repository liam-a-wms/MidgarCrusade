package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.champion.Arena_6;
import fr.toss.common.player.spells.champion.Charge_1;
import fr.toss.common.player.spells.champion.EarthShield_5;
import fr.toss.common.player.spells.champion.Grab_4;
import fr.toss.common.player.spells.champion.Ironskin_3;
import fr.toss.common.player.spells.champion.Shockwave_2;
import fr.toss.common.player.spells.fighter.*;

public class ClasseFighter extends Classe {
	
	public ClasseFighter()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "Fighter";
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
		this.CLASSE_SPELL.add(new Airrender_1());
		this.CLASSE_SPELL.add(new Aurablast_1());
		this.CLASSE_SPELL.add(new Backdraft_1());
		
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
		return (Fighter);
	}
}
