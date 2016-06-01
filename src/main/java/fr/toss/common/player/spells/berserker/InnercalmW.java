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

public class InnercalmW extends Spell {

	public static int getUniqueID()
	{
		return 99;
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
		return "Scream";
	}

	
	@Override
	public String[] getDescription() 
	{
		String str[];
		
		str = new String[3];
		str[0] = "Dispell every positive effect";
		str[1] = "on surrounding units such as";
		str[2] = "resistance, strength, speed...";
		
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
	@Override
	public void sendEffectToServer(Object ... obj)
	{
		PacketParticleEffectToServer packet;
		Entity e;
		
		e = (Entity) obj[0];
		packet = new PacketParticleEffectToServer(getUniqueID(), e.posX, e.posY, e.posZ, player.getPlayer().dimension);
		Packets.network.sendToServer(packet);		
	}
	
	public static void playEffect(double x, double y, double z)
	{
		World world;
		EntityPlayer player;
		EntityFX particles;
		float a;
		float b;
		float c;
		
		world = Minecraft.getMinecraft().theWorld;
    	player = Minecraft.getMinecraft().thePlayer;
		for (int i = 0; i < 250; i++)
        {
    		a = (float) (Math.random() - 0.5);
    		if(Math.random() * 2 + 1 == 0)
    			a = -a;
    		b = (float) (Math.random() * 2 - 0.5);
    		if(Math.random() * 2 + 1 == 0)
    			b=-b;
    		c = (float) (Math.random() - 0.5);
    		if(Math.random() * 2 + 1 == 0)
    			c=-c;
    		
    		world.spawnParticle("fireworksSpark", x, y, z, a, b, c);
    		particles = new EntityFX_Colored(world, x, y, z, a, -b, c, 2.0f, 0, 1.5f, 5.0f);
    		Minecraft.getMinecraft().effectRenderer.addEffect(particles);
        }
	}
}
