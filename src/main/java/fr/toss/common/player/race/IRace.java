package fr.toss.common.player.race;

import fr.toss.common.command.ChatColor;

public interface IRace {
	
	/** retourne le nom de la classe */
	public String getName();
	
	/** retourne la couelur correspondant à la classe */
	public ChatColor getColor();

	/** definis tous les sorts de la classe */
	public void defineRaceSpells();

	/** retourne le maximum d'energy actuel du joueur */
	public int getMaxEnergy();
	
	/** retourne le type de classe (dps, tank, heal) */
	public EnumType getType();

	/** Retournes la regeneration d'energy par tick */
	public int getBaseEnergyRegen();
}
