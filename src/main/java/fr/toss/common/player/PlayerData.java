package fr.toss.common.player;

public class PlayerData {
	
	public int race;
	public int classe;
	public int experience;
	public int level;

	public PlayerData() {}
	
	public PlayerData(ServerPlayerBaseMagic player)
	
	{
		this.race = player.race;
		this.classe = player.classe;
		this.experience = player.experience;
		this.level = player.level;
	}
}
