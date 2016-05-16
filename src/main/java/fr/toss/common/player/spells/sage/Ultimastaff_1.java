package fr.toss.common.player.spells.sage;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import fr.toss.common.command.ChatColor;
import fr.toss.common.packet.PacketParticleEffectToServer;
import fr.toss.common.packet.PacketSpellToServer;
import fr.toss.common.packet.Packets;
import fr.toss.common.player.spells.Spell;

public class Ultimastaff_1 extends Spell {

	public static int getUniqueID()
	{
		return 70;
	}
	
	@Override
	public int getLevel() 
	{
		return 1;
	}

	@Override
	public int getCost()
	{
		return 4;
	}
	
	@Override
	public String getName()
	{
		return I18n.format("spell.sage.ultimastaff");
	}

	@Override
	public boolean onUse()
	{
		PacketSpellToServer packet;

		packet = new PacketSpellToServer(getUniqueID());
		Packets.network.sendToServer(packet);
		return (true);
	}
	
	@Override
	public String[] getDescription() 
	{
		String str[];
		
		str = new String[1];
		str[0] = "Deals heavy Physical damage.";
		

		return (str);
	}
	
	@Override
	public void sendEffectToServer(Object ... obj) {}
	
	public static void playEffect(double x, double y, double z) {}
}
