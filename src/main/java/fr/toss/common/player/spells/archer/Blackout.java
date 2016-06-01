package fr.toss.common.player.spells.archer;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.util.ChatComponentText;
import fr.toss.common.command.ChatColor;
import fr.toss.common.packet.PacketSpellToServer;
import fr.toss.common.packet.Packets;
import fr.toss.common.player.spells.Spell;

public class Blackout extends Spell {

	public static int getUniqueID()
	{
		return 66;
	}
	
	@Override
	public int getLevel() 
	{
		return 1;
	}

	@Override
	public int getCost()
	{
		return 40;
	}
	
	@Override
	public String[] getDescription() 
	{
		String str[];
		
		str = new String[3];
		str[0] = "Instantly shoot a arrow which";
		str[1] = "will Blind any target it";
		str[2] = " hits for 5 seconds ";

		return (str);
	}
	
	@Override
	public String getName()
	{
		return I18n.format("spell.archer.blindshot");
	}
	public boolean RandomBoolean(){
	    return Math.random() < (1.8);
	}
	@Override
	public boolean onUse()
	{
		RandomBoolean randomBoolean = new RandomBoolean();
		
        {
		
		EntityPlayer p;
		
		p = this.player.getPlayer();
		if (p.getCurrentEquippedItem() != null)
		{
			if (p.getCurrentEquippedItem().getItem() instanceof ItemBow)
			 System.out.println(randomBoolean.getBoolean());
				PacketSpellToServer packet;
				
				packet = new PacketSpellToServer(getUniqueID());
				Packets.network.sendToServer(packet);
				return (true);
			}
			else
				player.getPlayer().addChatComponentMessage(new ChatComponentText(ChatColor.RED + "You must equip a bow for this." + ChatColor.RESET));
		
		
		
	}
		return false;
}
}