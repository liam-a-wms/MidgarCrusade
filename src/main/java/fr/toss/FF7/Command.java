package fr.toss.FF7;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class Command implements ICommand
{ 
    private final List aliases;
  
     
  
    public Command() 
    { 
        aliases = new ArrayList(); 
        aliases.add("rubble"); 
        aliases.add("rubbledrops"); 
    } 
  
    @Override 
    public int compareTo(Object o)
    { 
        return 0; 
    } 

    @Override 
    public String getCommandName() 
    { 
        return "rubbleDrops"; 
    } 

          
    public String getCommandUsage(ICommandSender var1) 
    { 
    	String helpDescription = new String("Rubble Drops commands: /rubbledrops ");
		return helpDescription = new String(helpDescription
							+ " - " + new String("authors")
							+ " - " + new String("skype"))
							+ " - " + new String("PMC")
							+ " - " + new String("MCF");
		
    } 

    @Override 
    public List getCommandAliases() 
    { 
        return this.aliases;
    } 

    @Override 
    public void processCommand(ICommandSender var1, String[] var2) {
		if(var2.length < 1) {
			return;
		}
    { 
    	if(var2[0].equals("authors") ) {
			String message = new String("Wakkytabbaky " + " Givemhell: ") ;
			
			if(var1 instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) var1;
				player.addChatMessage(new ChatComponentText(message));
				
		      

			}
			
			else {
				
			}
			
			return;
		}
			if(var2[0].equals("skype"))
			{	String message = new String("Wakkytabbaky " + " Givemh311: ");
			if(var1 instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) var1;
				player.addChatMessage(new ChatComponentText(message));
			}
				else 
					return;
    	}
    
			if(var2[0].equals("PMC"))
			{	String message = new String("http://bit.ly/1bHIMRC shortened planet minecraft mod link");
			if(var1 instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) var1;
				player.addChatMessage(new ChatComponentText(message));
			}
				else 
					return;
    
    }
			if(var2[0].equals("MCF"))
			{	String message = new String("http://bit.ly/1clIGQj shortened minecraft forum mod link");
			if(var1 instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) var1;
				player.addChatMessage(new ChatComponentText(message));
			}
				else 
					return;
    }
		}  
    }
    
    @Override 
    public boolean canCommandSenderUseCommand(ICommandSender var1) 
    { 
        return true;
    } 

    @Override  
    public List addTabCompletionOptions(ICommandSender var1, String[] var2) 
    { 
        // TODO Auto-generated method stub 
        return null; 
    } 

    @Override 
    public boolean isUsernameIndex(String[] var1, int var2) 
    { 
        // TODO Auto-generated method stub 
        return false;
    } 
}