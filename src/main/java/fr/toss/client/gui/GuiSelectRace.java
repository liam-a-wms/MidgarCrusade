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

public class GuiSelectRace extends GuiScreen {
	
	public static final ResourceLocation CLASSES = new ResourceLocation("magiccrusade:textures/gui/classes.png");

	@Override
	public void initGui()
	{
		GuiButton buttons[];
		
		buttons = new GuiButton[7];
		
		buttons[0] = new GuiButton(42, this.width / 2 - 40, this.height / 4 - 4, 80, 20, ChatColor.RESET + I18n.format("Hume"));
		
		buttons[1] = new GuiButton(43, this.width / 2 - 40, this.height / 4 - 26, 80, 20, ChatColor.RESET + I18n.format("Moogle"));
		  
		buttons[2] = new GuiButton(44, this.width / 2 - 40, this.height / 2 - 22, 80, 20, ChatColor.RESET + I18n.format("Viera"));
		  
		buttons[3] = new GuiButton(45, this.width / 2 - 40, this.height / 2 - 44, 80, 20, ChatColor.RESET + I18n.format("Bangaa"));
		  
		buttons[4] = new GuiButton(46, this.width / 2 - 40, this.height / 2 - 0, 80, 20, ChatColor.RESET + I18n.format("Nu Mou"));

		buttons[5] = new GuiButton(47, this.width / 2 - 40, this.height + 0 + 1 - 102, 80, 20, ChatColor.RESET + I18n.format("Seeq"));

		buttons[6] = new GuiButton(48, this.width / 2 - 40, this.height +  0 + 1 - 80, 80, 20, ChatColor.RESET + I18n.format("Gria"));
	    /*
		buttons[7] = new GuiButton(49, this.width / 2 - 40, this.height +  0 + 1 - 132,80, 20, ChatColor.RESET + I18n.format("Hurdy"));

		buttons[8] = new GuiButton(50, this.width / 2 - 40, this.height +  0 + 1 - 110, 80, 20, ChatColor.RESET + I18n.format("Vaan"));

		buttons[9] = new GuiButton(51, this.width / 2 - 40, this.height +  0 + 1 - 88 , 80, 20, ChatColor.RESET + I18n.format("Penelo"));
		
		buttons[10] = new GuiButton(52, this.width / 2 - 40, this.height + 0 + 1 - 66, 80, 20, ChatColor.RESET + I18n.format("Adelle"));
		
		buttons[11] = new GuiButton(53, this.width / 2 - 40, this.height + 0 + 1 - 44, 80, 20, ChatColor.RESET + I18n.format("Al-Cid Margrace"));
        */
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
    	this.drawCenteredString(this.fontRendererObj, I18n.format("race.choose"), this.width / 2, 14, Integer.MAX_VALUE / 2);
        this.mc.getTextureManager().bindTexture(CLASSES);
        
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
		GuiHumeRaceInformation gui3;
		GuiRaceInformation gui2;
		String race;
		String description[];
		String advices[];
    	if (b.id == 42)
    	{    		
    		description = new String[4];
    		advices = new String[4];
    		race = ChatColor.RED + I18n.format("race.hume.slogan");
    		description[0] = I18n.format("race.hume.line1");
    		description[1] = I18n.format("race.hume.line2");
    		description[2] = I18n.format("race.hume.line3");
    		description[3] = I18n.format("race.hume.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.hp");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.strength");
    		advices[2] = ChatColor.GREEN + "+ " + I18n.format("stats.armor");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.mana");
    		gui3 = new GuiHumeRaceInformation(race, description, advices, 0, 0, 190000000, 1);
    		this.mc.displayGuiScreen(gui3);
    	}
    	else if (b.id == 43)
    	{
    		description = new String[5];
    		advices = new String[4];
    		race = ChatColor.YELLOW + I18n.format("race.rogue.slogan");
    		description[0] = I18n.format("race.rogue.line1");
    		description[1] = I18n.format("race.rogue.line2");
    		description[2] = I18n.format("race.rogue.line3");
    		description[3] = I18n.format("race.rogue.line4");
    		description[4] = I18n.format("race.rogue.line5");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.hp");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.agility");
    		advices[2] = ChatColor.RED + "- " + I18n.format("stats.mana");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.clarity");
    		gui2 = new GuiRaceInformation(race, description, advices, 1, 0, 180000000, 6);
    		this.mc.displayGuiScreen(gui2);
    	}
    	else if (b.id == 44)
    	{
    		description = new String[4];
    		advices = new String[4];
    		race = ChatColor.DARK_PURPLE + I18n.format("race.necromancer.slogan");
    		description[0] = I18n.format("race.necromancer.line1");
    		description[1] = I18n.format("race.necromancer.line2");
    		description[2] = I18n.format("race.necromancer.line3");
    		description[3] = I18n.format("race.necromancer.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.agility");
    		gui2 = new GuiRaceInformation(race, description, advices, 2, 0, -100000000, 4);
    		this.mc.displayGuiScreen(gui2);
    	}
    	else if (b.id == 45)
    	{
    		description = new String[4];
    		advices = new String[4];
    		race = ChatColor.GOLD + I18n.format("race.Dragonslayer.slogan");
    		description[0] = I18n.format("race.Dragonslayer.line1");
    		description[1] = I18n.format("race.Dragonslayer.line2");
    		description[2] = I18n.format("race.Dragonslayer.line3");
    		description[3] = I18n.format("race.Dragonslayer.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.agility");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.strength");
    		advices[2] = ChatColor.RED + "- " + I18n.format("stats.mana");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.clarity");
    		gui2 = new GuiRaceInformation(race, description, advices, 0, 1, 180000000, 2);
    		this.mc.displayGuiScreen(gui2);
    	}
    	else if (b.id == 46)
    	{
    		description = new String[4];
    		advices = new String[4];
    		race = ChatColor.AQUA + I18n.format("race.mage.slogan");
    		description[0] = I18n.format("race.mage.line1");
    		description[1] = I18n.format("race.mage.line2");
    		description[2] = I18n.format("race.mage.line3");
    		description[3] = I18n.format("race.mage.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+ " + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui2 = new GuiRaceInformation(race, description, advices, 1, 1, Integer.MAX_VALUE, 5);
    		this.mc.displayGuiScreen(gui2);
    	}
    	else if (b.id == 47)
    	{
    		description = new String[3];
    		advices = new String[4];
    		race = ChatColor.GRAY + I18n.format("race.Priest.slogan");
    		description[0] = I18n.format("race.Priest.line1");
    		description[1] = I18n.format("race.Priest.line2");
    		description[2] = I18n.format("race.Priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui2 = new GuiRaceInformation(race, description, advices, 2, 1, Integer.MAX_VALUE, 3);
    		this.mc.displayGuiScreen(gui2);
    	}
    	else if (b.id == 48)
    	{
    		description = new String[1];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("race.Thief.slogan");
    		description[0] = I18n.format("race.Thief.line1");
    		//description[1] = I18n.format("race.Thief.line2");
    		//description[2] = I18n.format("race.Thief.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui2 = new GuiRaceInformation(race, description, advices, 3, 0, Integer.MAX_VALUE, 7);
    		this.mc.displayGuiScreen(gui2);
    	}
    	else if (b.id == 49)
    	{
    		description = new String[1];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("race.Blackmage.slogan");
    		description[0] = I18n.format("race.Blackmage.line1");
    		//description[1] = I18n.format("race.Blackmage.line2");
    		//description[2] = I18n.format("race.Blackmage.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui2 = new GuiRaceInformation(race, description, advices, 0, 2, Integer.MAX_VALUE, 8);
    		this.mc.displayGuiScreen(gui2);
    	}
    	else if (b.id == 50)
    	{
    		description = new String[1];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("race.Archer.slogan");
    		description[0] = I18n.format("race.Archer.line1");
    		//description[1] = I18n.format("race.Archer.line2");
    		//description[2] = I18n.format("race.Archer.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui2 = new GuiRaceInformation(race, description, advices, 2, 1, Integer.MAX_VALUE, 9);
    		this.mc.displayGuiScreen(gui2);
    	}
    	else if (b.id == 51)
    	{
    		description = new String[1];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("race.Paladin.slogan");
    		description[0] = I18n.format("race.Paladin.line1");
    		//description[1] = I18n.format("race.Paladin.line2");
    		//description[2] = I18n.format("race.Paladin.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui2 = new GuiRaceInformation(race, description, advices, 2, 1, Integer.MAX_VALUE, 10);
    		this.mc.displayGuiScreen(gui2);
    	}
    	else if (b.id == 52)
    	{
    		description = new String[1];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("race.Fighter.slogan");
    		description[0] = I18n.format("race.Fighter.line1");
    		//description[1] = I18n.format("race.Fighter.line2");
    		//description[2] = I18n.format("race.Fighter.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui2 = new GuiRaceInformation(race, description, advices, 2, 1, Integer.MAX_VALUE, 11);
    		this.mc.displayGuiScreen(gui2);
    	}
        	}
    	}