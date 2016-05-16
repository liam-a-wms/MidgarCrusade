package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.mage.ArcanaPillow_5;
import fr.toss.common.player.spells.mage.ConeFeu_1;
import fr.toss.common.player.spells.mage.FieldDestruction_4;
import fr.toss.common.player.spells.mage.Fireball_6;
import fr.toss.common.player.spells.mage.FreezeCube_2;
import fr.toss.common.player.spells.mage.Transfert_3;
import fr.toss.common.player.spells.priest.Purification_1;
import fr.toss.common.player.spells.whitemage.*;

public class ClasseWhitemage extends Classe {
	
	public ClasseWhitemage()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "White Mage";
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
		this.CLASSE_SPELL.add(new Cure_1());
		this.CLASSE_SPELL.add(new Cura_1());
		this.CLASSE_SPELL.add(new Curaga_1());
		this.CLASSE_SPELL.add(new Cleanse_1());
		this.CLASSE_SPELL.add(new Purification_1());
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
		return (WhiteMage);
	}
}
