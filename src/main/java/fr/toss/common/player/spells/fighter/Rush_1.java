package fr.toss.common.player.spells.fighter;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import fr.toss.client.render.particles.EntityFX_Colored;
import fr.toss.common.command.ChatColor;
import fr.toss.common.packet.PacketParticleEffectToServer;
import fr.toss.common.packet.Packets;
import fr.toss.common.player.spells.Spell;

public class Rush_1 extends Spell {

	public static int getUniqueID()
	{
		return 10;
	}
	
	@Override
	public int getLevel() 
	{
		return 1;
	}

	@Override
	public int getCost()
	{
		return 140;
	}
	
	@Override
	public String[] getDescription() 
	{
		String str[];
		
		str = new String[1];
		str[0] = "Rush towards your target.";

		return (str);
	}
	
	@Override
	public String getName()
	{
		return I18n.format("spell.champion.charge");
	}

	@Override
	public boolean onUse()
	{
		
	
		Entity e;
		
		e = this.getLookingEntity(10.0d);
		if (e != null)
		{
			if (e instanceof EntityLivingBase)
		
		this.sendEffectToServer();
		Vec3 vec = player.getPlayer().getLookVec();
		player.getPlayer().motionX = vec.xCoord * 2.5d;
		player.getPlayer().motionY += 0.2d;
		player.getPlayer().motionZ = vec.zCoord * 2.5d;
		return (true);
		}
		else
			player.getPlayer().addChatComponentMessage(new ChatComponentText(ChatColor.RED + "No target available." + ChatColor.RESET));

		return false;
	}
	
	@Override
	public void sendEffectToServer(Object ... obj)
	{
		PacketParticleEffectToServer packet;
		
		packet = new PacketParticleEffectToServer(getUniqueID(), player.getPlayer().posX, player.getPlayer().posY, player.getPlayer().posZ, player.getPlayer().dimension);
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
		for (int i = 0; i < 500; i++)
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
    		
    		particles = new EntityFX_Colored(world, x, y, z, a, -b, c, 2.0f, 0, 0, 5.0f);
    		Minecraft.getMinecraft().effectRenderer.addEffect(particles);
        }
	}
}
