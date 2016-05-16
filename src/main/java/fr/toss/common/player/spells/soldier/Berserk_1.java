package fr.toss.common.player.spells.soldier;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import fr.toss.client.render.particles.EntityFX_Colored;
import fr.toss.common.items.ItemArmorM;
import fr.toss.common.packet.PacketParticleEffectToServer;
import fr.toss.common.packet.PacketSpellToServer;
import fr.toss.common.packet.Packets;
import fr.toss.common.player.spells.Spell;

public class Berserk_1 extends Spell {
	
	public static int getUniqueID()
	{
		return 57;
	}
	
	@Override
	public int getLevel() 
	{
		return 1;
	}

	@Override
	public int getCost()
	{
		return 80;
	}
	
	@Override
	public String getName()
	{
		return I18n.format("spell.Soldier.berserk");
	}

	@Override
	public String[] getDescription() 
	{
		String str[];
		
		str = new String[2];
		str[0] = "Go berserk and gain";
		str[1] = "a damage and speed buff";
		

		return (str);
	}
	
	
	@Override
	public boolean onUse()
	{
		PacketSpellToServer packet;
		List entities;
		Entity e;
		Item item;
		float clarity;
		
		clarity = 0;
		entities = this.getEntitiesAround(20.0d, false);

		for (int i = 0; i < 4; i++)
		{
			if (player.getPlayer().inventory.armorInventory[i] != null)
			{
				item = player.getPlayer().inventory.armorInventory[i].getItem();
				if (item != null && item instanceof ItemArmorM)
					clarity += ((ItemArmorM)item).clarity;
			}
		}
		
		for (int i = 0; i < entities.size(); i++)
		{
			e = (Entity) entities.get(i);
			if (!(e instanceof EntityItem))
			{
				this.sendEffectToServer(e);
				packet = new PacketSpellToServer(getUniqueID(), e.getEntityId(), clarity * 1.5f);
				Packets.network.sendToServer(packet);
			}
		}
		return (true);
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
		float c;
		
		world = Minecraft.getMinecraft().theWorld;
    	player = Minecraft.getMinecraft().thePlayer;
		for (int i = 0; i < 100; i++)
        {
			a = world.rand.nextFloat() / 20.0f;
			c = world.rand.nextFloat() / 20.0f;
			if (world.rand.nextInt(2) == 0)
				a = - a;
			if (world.rand.nextInt(2) == 0)
				c = - c;
			
    		world.spawnParticle("fireworksSpark", x, y + 1, z, a * 5, -0.25f, c * 5);
    		particles = new EntityFX_Colored(world, x, y + 1, z, a * 5, -0.25f, c * 5, 2.0f, 0, 1.5f, 5.0f);
    		Minecraft.getMinecraft().effectRenderer.addEffect(particles);
    		
    		world.spawnParticle("fireworksSpark", x, y + 1, z, a * 5, 0.1f, c * 5);
    		particles = new EntityFX_Colored(world, x, y + 1, z, a * 5, 0.1f, c * 5, 2.0f, 0, 1.5f, 5.0f);
    		Minecraft.getMinecraft().effectRenderer.addEffect(particles);
    		
    		world.spawnParticle("fireworksSpark", x, y + 1, z, a, -0.25f, c);
    		particles = new EntityFX_Colored(world, x, y + 1, z, a, -0.25f, c, 2.0f, 0, 1.5f, 5.0f);
    		Minecraft.getMinecraft().effectRenderer.addEffect(particles);
    		
    		world.spawnParticle("fireworksSpark", x, y - 1, z, a, 0.1f, c);
    		particles = new EntityFX_Colored(world, x, y - 1, z, a, 0.1f, c, 2.0f, 0, 1.5f, 5.0f);
    		Minecraft.getMinecraft().effectRenderer.addEffect(particles);
        }
	}
}