package fr.toss.common.player.classes;

import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.ranger.Invisible_1;
import fr.toss.common.player.spells.ranger.Lifebond_1;
import fr.toss.common.player.spells.rogue.Critic_1;
import fr.toss.common.player.spells.rogue.FeatherFalling_6;
import fr.toss.common.player.spells.rogue.Invisible_3;
import fr.toss.common.player.spells.rogue.Poison_4;
import fr.toss.common.player.spells.rogue.Speed_2;
import fr.toss.common.player.spells.rogue.Vision_5;

public class ClasseRanger extends Classe {

	public ClasseRanger()
	{
		super();
	}
	
	@Override
	public String getName() 
	{
		return I18n.format("Ranger");
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
		
		this.CLASSE_SPELL.add(new Lifebond_1());
		this.CLASSE_SPELL.add(new Invisible_1());
		
		
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
		return (Ranger);
	}
}
