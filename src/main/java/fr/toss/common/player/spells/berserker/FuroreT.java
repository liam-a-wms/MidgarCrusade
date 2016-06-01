package fr.toss.common.player.spells.berserker;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import fr.toss.client.render.particles.EntityFX_Colored;
import fr.toss.common.command.ChatColor;
import fr.toss.common.entity.EntitySummonZombie;
import fr.toss.common.packet.PacketParticleEffectToServer;
import fr.toss.common.packet.PacketSpellToServer;
import fr.toss.common.packet.Packets;
import fr.toss.common.player.spells.Spell;

public class FuroreT extends Spell {

	public static int getUniqueID()
	{
		return 100;
	}
	
	@Override
	public int getLevel() 
	{
		return 1;
	}

	@Override
	public int getCost()
	{
		return 200;
	}
	
	@Override
	public String getName()
	{
		return "Furore";
	}

	
	@Override
	public String[] getDescription() 
	{
		String str[];
		
		str = new String[1];
		str[0] = "Damages and knocks back all adjacent units.";
		
		return (str);
	}
	
	@Override
	public boolean onUse()
	{
		
List list;
		
		list = this.getEntitiesAround(6.0d, false);
		if (list.size() > 0)
		{
			this.sendEffectToServer();
			for (int i = 0; i < list.size(); i++)
			{
				if (!(list.get(i) instanceof EntityItem) && !(list.get(i) instanceof EntitySummonZombie))
				{
					if (((Entity)list.get(i)).getEntityId() != player.getPlayer().getEntityId())
					{
						PacketSpellToServer packet;
						packet = new PacketSpellToServer(getUniqueID(), ((Entity)list.get(i)).getEntityId());
						Packets.network.sendToServer(packet);
					}
				}
			}
			return (true);
		}
		else
			player.getPlayer().addChatComponentMessage(new ChatComponentText(ChatColor.RED + "No ennemis around." + ChatColor.RESET));
		return (false);
	}


}