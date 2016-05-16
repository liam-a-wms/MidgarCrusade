package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.mage.ArcanaPillow_5;
import fr.toss.common.player.spells.mage.ConeFeu_1;
import fr.toss.common.player.spells.mage.FieldDestruction_4;
import fr.toss.common.player.spells.mage.Fireball_6;
import fr.toss.common.player.spells.mage.FreezeCube_2;
import fr.toss.common.player.spells.mage.Transfert_3;
import fr.toss.common.player.spells.spellblade.*;

public class ClasseSpellblade extends Classe {
	
	public ClasseSpellblade()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "Spell Blade";
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
		this.CLASSE_SPELL.add(new Confusionblade_1());
		this.CLASSE_SPELL.add(new Stunblade_1());
		this.CLASSE_SPELL.add(new Oilblade_1());
		this.CLASSE_SPELL.add(new Poisonblade_1());
		this.CLASSE_SPELL.add(new Doomblade_1());
		this.CLASSE_SPELL.add(new Maimblade_1());
		this.CLASSE_SPELL.add(new Slowblade_1());
		this.CLASSE_SPELL.add(new Sleepblade_1());
		
	
	
	
	
	
	
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
		return (Spellblade);
	}
}
