package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.mage.ArcanaPillow_5;
import fr.toss.common.player.spells.illusionist.*;
import fr.toss.common.player.spells.mage.FieldDestruction_4;
import fr.toss.common.player.spells.mage.Fireball_6;
import fr.toss.common.player.spells.mage.FreezeCube_2;
import fr.toss.common.player.spells.mage.Transfert_3;

public class ClasseIllusionist extends Classe {
	
	public ClasseIllusionist()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "Illusionist";
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
		this.CLASSE_SPELL.add(new Deluge_1());
		this.CLASSE_SPELL.add(new Freezeblink_1());
		this.CLASSE_SPELL.add(new Prominence_1());
		this.CLASSE_SPELL.add(new Rockfall_1());
		this.CLASSE_SPELL.add(new Starcross_1());
		this.CLASSE_SPELL.add(new Tempest_1());
		this.CLASSE_SPELL.add(new Wildtornado_1());
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
		return (Illusionist);
	}
}
