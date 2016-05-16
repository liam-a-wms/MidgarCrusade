package fr.toss.common.packet;

import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fr.toss.common.Main;
import fr.toss.common.player.ClientPlayerBaseMagic;
import fr.toss.common.player.ServerPlayerBaseMagic;

public class PacketLogIn implements IMessage {
   
	

    public PacketLogIn()
    {
    	this(0,0,0,0);
    }
    
    
	public int classe_id;
	public int level;
	public int current_experience;
	public int race_id;
	
    public PacketLogIn(int a, int b, int c,int d)
    {
    	
        this.classe_id = a;
        this.level = b;
        this.current_experience = c;
        this.race_id= d;
    }
    
    public PacketLogIn(ServerPlayerBaseMagic player)
    {
    	
        this.classe_id = player.getClasse();
        this.level = player.getLevel();
        this.current_experience = player.getExperience();
        this.race_id = player.getRace();
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
    	
        this.classe_id = buf.readInt();
        this.level = buf.readInt();
        this.current_experience = buf.readInt();
        this.race_id = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
    	
    	buf.writeInt(this.classe_id);
    	buf.writeInt(this.level);
    	buf.writeInt(this.current_experience);
    	buf.writeInt(this.race_id);
    }

    public static class Handler implements IMessageHandler<PacketLogIn, IMessage> {
       
        @Override
        public IMessage onMessage(PacketLogIn message, MessageContext ctx) 
        {
        	ClientPlayerBaseMagic player;
        	
        	player = Main.getPlayerClient();
        	player.initPlayer(message);

        	
        	return null;
        }
    }
}
