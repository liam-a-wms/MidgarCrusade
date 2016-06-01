package fr.toss.common.player.spells.archer;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.util.ChatComponentText;
import fr.toss.common.command.ChatColor;
import fr.toss.common.items.ItemArmorM;
import fr.toss.common.packet.PacketSpellToServer;
import fr.toss.common.packet.Packets;
import fr.toss.common.player.spells.Spell;

public class Focus extends Spell {

	public static int getUniqueID()
	{
		return 65;
	}
	
	@Override
	public int getLevel() 
	{
		return 1;
	}

	@Override
	public int getCost()
	{
		return 30;
	}
	
	@Override
	public String[] getDescription() 
	{
		String str[];
		
		str = new String[2];
		str[0] = "Boost your attack by";
		str[1] = "10 for 3 seconds";
		

		return (str);
	}
	
	@Override
	public String getName()
	{
		return I18n.format("spell.archer.powershot");
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
}
