package fr.toss.common.player.classes;

import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.juggler.*;
import fr.toss.common.player.spells.rogue.Critic_1;
import fr.toss.common.player.spells.rogue.FeatherFalling_6;
import fr.toss.common.player.spells.rogue.Invisible_3;
import fr.toss.common.player.spells.rogue.Poison_4;
import fr.toss.common.player.spells.rogue.Speed_2;
import fr.toss.common.player.spells.rogue.Vision_5;

public class ClasseJuggler extends Classe {

	public ClasseJuggler()
	{
		super();
	}
	
	@Override
	public String getName() 
	{
		return I18n.format("Juggler");
	}

	@Override
	public ChatColor getColor() 
	{
		return ChatColor.YELLOW;
	}

	@Override
	/** definis tous les sorts de la classe */
	public void defineClasseSpells()
	{	
		this.CLASSE_SPELL.clear();
		this.CLASSE_SPELL.add(new Smiletoss_1 ());
		this.CLASSE_SPELL.add(new Molotovcocktail_1());
		this.CLASSE_SPELL.add(new Ringtoss_1());
		this.CLASSE_SPELL.add(new Weapontoss_1());
		this.CLASSE_SPELL.add(new Balltoss_1());
		
	}
	
	@Override
	public EnumType getType() 
	{
		return EnumType.DPS;
	}
	
	@Override
	public int getBaseEnergyRegen()
	{
		return 1;
	}
	
	@Override
	public ResourceLocation getTexture()
	{
		return (Juggler);
	}
}
