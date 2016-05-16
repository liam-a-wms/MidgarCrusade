package fr.toss.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

import com.google.code.chatterbotapi.ChatterBot;
import com.google.code.chatterbotapi.ChatterBotFactory;
import com.google.code.chatterbotapi.ChatterBotSession;
import com.google.code.chatterbotapi.ChatterBotType;

import cpw.mods.fml.client.config.GuiUtils;
import fr.toss.common.Main;
import fr.toss.common.command.ChatColor;

public class GuiSelectNuMouClass extends GuiScreen {
	
	public static final ResourceLocation CLASSES = new ResourceLocation("magiccrusade:textures/gui/classes.png");

	@Override
	public void initGui()
	{
		GuiButton buttons[];
		
		buttons = new GuiButton[9];
		
		buttons[0] = new GuiButton(102, this.width / 2 - 40, this.height / 2 - 88, 80, 20, ChatColor.RESET + I18n.format("classe.Whitemage"));

		buttons[1] = new GuiButton(49, this.width / 2 - 40, this.height /  2 - 66, 80, 20, ChatColor.RESET + I18n.format("classe.Blackmage"));
		
		buttons[2] = new GuiButton(83, this.width / 2 - 40, this.height / 2 - 44, 80, 20, ChatColor.RESET + I18n.format("classe.Beastmaster"));

		buttons[3] = new GuiButton(63, this.width / 2 - 40, this.height / 2 - 22, 80, 20, ChatColor.RESET + I18n.format("classe.TimeMage"));
		
		buttons[4] = new GuiButton(55, this.width / 2 - 40, this.height / 2 - 0, 80, 20, ChatColor.RESET + I18n.format("classe.Illusionist"));

		buttons[5] = new GuiButton(84, this.width / 2 - 40, this.height / 2 + 22, 80, 20, ChatColor.RESET + I18n.format("classe.Sage"));

		buttons[6] = new GuiButton(85, this.width / 2 - 40, this.height / 2 + 44, 80, 20, ChatColor.RESET + I18n.format("classe.Alchemist"));

		buttons[7] = new GuiButton(86, this.width / 2 - 40, this.height / 2 + 66, 80, 20, ChatColor.RESET + I18n.format("classe.Arcanist"));
		
		buttons[8] = new GuiButton(87, this.width / 2 - 40, this.height / 2 + 88, 80, 20, ChatColor.RESET + I18n.format("classe.Scholar"));

		
		
		
		
		
		
		
		
		
		
		
		
		
	
		for (GuiButton b : buttons)
			this.buttonList.add(b);
			
	}

    /**
     * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
     */
    protected void keyTyped(char c, int i)
    {
    	super.keyTyped(c, i);
    }
    
    
    /**
     * Draws the screen and all the components in it.
     */
    @Override
    public void drawScreen(int x, int y, float dunno)
    {
    	int x1 = this.width / 4 - 26;
    	int y1 = this.height / 4;
    	int a = 0;
    	int b = 0;

    	this.drawDefaultBackground();
    	this.drawCenteredString(this.fontRendererObj, I18n.format("Choose a Class"), this.width / 2, 14, Integer.MAX_VALUE / 2);
        this.mc.getTextureManager().bindTexture(CLASSES);
         
        for (int i = 0; i < 6; i++)
        {
        	GuiUtils.drawTexturedModalRect(x1, y1, a, b, 52, 52, 0);
        	x1 += this.width / 4;
        	a += 52;
        	if (i == 2)
        	{
        		a = 0;
        		b += 52;
        		x1 = this.width / 4 - 26;
        		y1 = this.height / 4 * 3 - 26;
        	}
        }
        
    	super.drawScreen(x, y, dunno);
    	
    }
    
    /**
     * Called from the main game loop to update the screen.
     */
    @Override
    public void updateScreen() 
    {
    	super.updateScreen();
    }
    
    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }
    
    @Override
    protected void actionPerformed(GuiButton b)
    {
		GuiClasseInformation gui;
		String classe;
		String description[];
		String advices[];
    	 if (b.id == 49)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Blackmage.slogan");
    		description[0] = I18n.format("classe.Blackmage.line1");
    		//description[1] = I18n.format("classe.Blackmage.line2");
    		//description[2] = I18n.format("classe.Blackmage.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 0, 2, Integer.MAX_VALUE, 8);
    		this.mc.displayGuiScreen(gui);
    	}
    	
    	else if (b.id == 83)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Beastmaster.slogan");
    		description[0] = I18n.format("classe.Beastmaster.line1");
    		//description[1] = I18n.format("classe.Beastmaster.line2");
    		//description[2] = I18n.format("classe.Beastmaster.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 42);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 84)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Sage.slogan");
    		description[0] = I18n.format("classe.Sage.line1");
    		//description[1] = I18n.format("classe.Sage.line2");
    		//description[2] = I18n.format("classe.Sage.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 43);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 85)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Alchemist.slogan");
    		description[0] = I18n.format("classe.Alchemist.line1");
    		//description[1] = I18n.format("classe.Alchemist.line2");
    		//description[2] = I18n.format("classe.Alchemist.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 44);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 86)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Arcanist.slogan");
    		description[0] = I18n.format("classe.Arcanist.line1");
    		//description[1] = I18n.format("classe.Arcanist.line2");
    		//description[2] = I18n.format("classe.Arcanist.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 45);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 87)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Scholar.slogan");
    		description[0] = I18n.format("classe.Scholar.line1");
    		//description[1] = I18n.format("classe.Scholar.line2");
    		//description[2] = I18n.format("classe.Scholar.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 46);
    		this.mc.displayGuiScreen(gui);
    	}
    	
    	 	else if (b.id == 102)
        	{
        	description = new String[1];
        	advices = new String[4];
        	classe = ChatColor.WHITE + I18n.format("classe.Whitemage.slogan");
        	description[0] = I18n.format("classe.Whitemage.line1");
        	//description[1] = I18n.format("classe.Whitemage.line2");
        	//description[2] = I18n.format("classe.Whitemage.line3");
        	//description[3] = I18n.format("classe.Whitemage.line4");
        	advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
        	advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
        	advices[2] = ChatColor.GREEN + "+ " + I18n.format("stats.mana_regen");
        	advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
        	gui = new GuiClasseInformation(classe, description, advices, 1, 1, Integer.MAX_VALUE, 61);
        	this.mc.displayGuiScreen(gui);
        		
        	}
    	 	else if (b.id == 63)
        	{
        		description = new String[1];
        		advices = new String[4];
        		classe = ChatColor.WHITE + I18n.format("classe.TimeMage.slogan");
        		description[0] = I18n.format("classe.TimeMage.line1");
        		//description[1] = I18n.format("classe.TimeMage.line2");
        		//description[2] = I18n.format("classe.TimeMage.line3");
        		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
        		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
        		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
        		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
        		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 22);
        		this.mc.displayGuiScreen(gui);
        	}
    	 	else if (b.id == 55)
        	{
        		description = new String[1];
        		advices = new String[4];
        		classe = ChatColor.WHITE + I18n.format("classe.Illusionist.slogan");
        		description[0] = I18n.format("classe.Illusionist.line1");
        		//description[1] = I18n.format("classe.Illusionist.line2");
        		//description[2] = I18n.format("classe.Illusionist.line3");
        		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
        		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
        		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
        		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
        		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 14);
        		this.mc.displayGuiScreen(gui);
        	}
        	}
    	}
    
