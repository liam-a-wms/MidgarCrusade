package fr.toss.common.player.classes;

import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.archer.*;
import fr.toss.common.player.spells.rogue.Critic_1;
import fr.toss.common.player.spells.rogue.FeatherFalling_6;
import fr.toss.common.player.spells.rogue.Invisible_3;
import fr.toss.common.player.spells.rogue.Poison_4;
import fr.toss.common.player.spells.rogue.Speed_2;
import fr.toss.common.player.spells.rogue.Vision_5;

public class ClasseArcherHume extends Classe {

	public ClasseArcherHume()
	{
		super();
	}
	
	@Override
	public String getName() 
	{
		return I18n.format("Archer");
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
		this.CLASSE_SPELL.add(new Immobilizeshot_1());
		this.CLASSE_SPELL.add(new Powershot_1());
		this.CLASSE_SPELL.add(new Blindshot_1());
		this.CLASSE_SPELL.add(new Poison_4());
		this.CLASSE_SPELL.add(new Vision_5());
		this.CLASSE_SPELL.add(new FeatherFalling_6());
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
		return (Archer);
	}
}
