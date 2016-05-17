package fr.toss.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.client.gui.*;
import fr.toss.common.Main;
import fr.toss.common.command.ChatColor;
import fr.toss.common.packet.PacketLogIn;
import fr.toss.common.player.ClientPlayerBaseMagic;
import fr.toss.common.player.classes.Classe;
import fr.toss.common.player.classes.ClasseNecromancer;
import fr.toss.common.player.classes.ClasseWhitemageViera;
import fr.toss.common.player.classes.*;
import fr.toss.common.player.race.*;
import fr.toss.common.player.spells.Spell;
import fr.toss.common.world.bioms.deco.WorldGenOrc;

public class KeyInputHandler {

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onKeyInput(InputEvent.KeyInputEvent event)
    {
    	ClientPlayerBaseMagic player = Main.getPlayerClient();
    	
        if(KeyBindings.KEY_GENERATE.isPressed())
        {
        	(new WorldGenOrc()).generate(player.getPlayer().getRNG(), (int) player.getPlayer().posX / 16, (int) player.getPlayer().posZ / 16, player.getPlayer().worldObj, null, null);
        }
        EntityPlayer p;
        ClientPlayerBaseMagic pm;
        pm = Main.getPlayerClient();
		p = pm.getPlayer();
	

 if(KeyBindings.KEY_SELECT_CLASSE.isPressed())

 {	{ if (pm.getClasse() instanceof ClasseWhitemageHume|| pm.getClasse() instanceof ClasseSoldier
		 || pm.getClasse() instanceof ClasseThiefHume|| pm.getClasse() instanceof ClasseBlackmageHume
		 || pm.getClasse() instanceof ClasseArcherHume|| pm.getClasse() instanceof ClassePaladin
		 || pm.getClasse() instanceof ClasseFighter|| pm.getClasse() instanceof ClasseHunterHume
		 || pm.getClasse() instanceof ClasseSamurai|| pm.getClasse() instanceof ClasseBluemage
		 || pm.getClasse() instanceof ClasseIllusionistHume|| pm.getClasse() instanceof ClasseSeer
		 || pm.getClasse() instanceof ClasseNinja)
	Minecraft.getMinecraft().displayGuiScreen(new GuiSelectHumeClass());
 		}
 
 {	 if (pm.getClasse() instanceof ClasseAnimist|| pm.getClasse() instanceof ClasseThiefMoogle
		 || pm.getClasse() instanceof ClasseBlackmageMoogle|| pm.getClasse() instanceof ClasseMoogleKnight
		 || pm.getClasse() instanceof ClasseFusilier|| pm.getClasse() instanceof ClasseJuggler
		 || pm.getClasse() instanceof ClasseTinker|| pm.getClasse() instanceof ClasseTimeMageMoogle
		 || pm.getClasse() instanceof ClasseChocoboKnight|| pm.getClasse() instanceof ClasseFlintlock)
		 
	Minecraft.getMinecraft().displayGuiScreen(new GuiSelectMoogleClass());
 		}
 
 {	 if (pm.getClasse() instanceof ClasseAnimist|| pm.getClasse() instanceof ClasseThiefMoogle
		 || pm.getClasse() instanceof ClasseBlackmageMoogle|| pm.getClasse() instanceof ClasseMoogleKnight
		 || pm.getClasse() instanceof ClasseFusilier|| pm.getClasse() instanceof ClasseJuggler
		 || pm.getClasse() instanceof ClasseTinker|| pm.getClasse() instanceof ClasseTimeMageMoogle
		 || pm.getClasse() instanceof ClasseChocoboKnight|| pm.getClasse() instanceof ClasseFlintlock)
		 
	Minecraft.getMinecraft().displayGuiScreen(new GuiSelectMoogleClass());
 		}
 
 
 
 		{ if (pm.getClasse() instanceof ClasseWhitemageViera )
		Minecraft.getMinecraft().displayGuiScreen(new GuiSelectVieraClass());
    }
 		 
 			return;
 }
 
         if(KeyBindings.KEY_SELECT_RACE.isPressed())
        	Minecraft.getMinecraft().displayGuiScreen(new GuiSelectRace());
        
        else if(KeyBindings.KEY_STATS.isPressed())
        {
        	if (Main.getPlayerClient().classe != null)
        		Minecraft.getMinecraft().displayGuiScreen(new GuiStats());
        }
        else if(KeyBindings.KEY_GROUP.isPressed())
        	if (player.getPlayer().getTeam() != null)
            	Minecraft.getMinecraft().displayGuiScreen(new GuiGroup());
        	else
            	Minecraft.getMinecraft().displayGuiScreen(new GuiCreateGroup());
        else
        {
        	if (player != null && player.getClasse() != null)
        	{
	        	for (int i = 0; i < player.getClasse().CLASSE_SPELL.size(); i++)
	        	{
	        		Spell spell;
	        		
	        		spell = player.getClasse().CLASSE_SPELL.get(i);
	        		if (KeyBindings.KEY_SPELLS[i].isPressed())
	        		{
	        			if (player.getLevel() >= spell.getLevel())
	        				player.getClasse().CLASSE_SPELL.get(i).use();
	        			else
	        				player.getPlayer().addChatComponentMessage(new ChatComponentText(ChatColor.RED + "Level " + spell.getLevel() + " is required to use " + spell.getName() + ChatColor.RESET));
	        			break ;
	        		}
	        	}
        	}
        }
 }
    }


