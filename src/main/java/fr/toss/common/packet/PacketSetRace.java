package fr.toss.common.packet;

import fr.toss.common.Main;
import fr.toss.common.player.ServerPlayerBaseMagic;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketSetRace implements IMessage {
   
	public static int race;

    public PacketSetRace()
    {
    	this(0);
    }
    
    public PacketSetRace(int race)
    {
    	this.race = race;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
    	this.race = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
    	buf.writeInt(this.race);
    }

    public static class Handler implements IMessageHandler<PacketSetRace, IMessage> 
    {
		@Override
		public IMessage onMessage(PacketSetRace message, MessageContext ctx)
		{
			EntityPlayerMP player;
			ServerPlayerBaseMagic pm;
			
			player = ctx.getServerHandler().playerEntity;
			pm = Main.getPlayerServer(player);
			
			pm.init(message.race);

			
			return null;
		}
    }
}
