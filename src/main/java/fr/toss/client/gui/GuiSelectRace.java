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
		
		buttons[0] = new GuiButton(42, this.width / 2 - 40, this.height / 2 - 88, 80, 20, ChatColor.RESET + I18n.format("Hume"));
		
		buttons[1] = new GuiButton(43, this.width / 2 - 40, this.height / 2 - 66, 80, 20, ChatColor.RESET + I18n.format("Moogle"));
		  
		buttons[2] = new GuiButton(44, this.width / 2 - 40, this.height / 2 - 22, 80, 20, ChatColor.RESET + I18n.format("Viera"));
		  
		buttons[3] = new GuiButton(45, this.width / 2 - 40, this.height / 2 - 44, 80, 20, ChatColor.RESET + I18n.format("Bangaa"));
		  
		buttons[4] = new GuiButton(46, this.width / 2 - 40, this.height / 2 - 0, 80, 20, ChatColor.RESET + I18n.format("Nu Mou"));

		buttons[5] = new GuiButton(47, this.width / 2 - 40, this.height / 2 + 22, 80, 20, ChatColor.RESET + I18n.format("Seeq"));

		buttons[6] = new GuiButton(48, this.width / 2 - 40, this.height / 2 + 44, 80, 20, ChatColor.RESET + I18n.format("Gria"));
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
    	
    	GuiGriaRaceInformation gui9;
    	GuiSeeqRaceInformation gui8;
    	GuiNuMouRaceInformation gui7;
    	GuiBangaaRaceInformation gui6;
    	GuiVieraRaceInformation gui5;
    	GuiMoogleRaceInformation gui4;
		GuiHumeRaceInformation gui3;
		GuiRaceInformation gui2;
		String race;
		String description[];
		String advices[];
    	if (b.id == 42)
    	{    		
    		   		
    		description = new String[4];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("Hume");
    		description[0] = I18n.format("The most populous race in Ivalice");
    		description[1] = I18n.format("there are a few places where humes have not made their mark");
    		description[2] = I18n.format("A well-rounded race");
    		description[3] = I18n.format("Humes are equally suited to swordplay and magery.");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.hp");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.strength");
    		advices[2] = ChatColor.GREEN + "+ " + I18n.format("stats.armor");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.mana");
    		gui3 = new GuiHumeRaceInformation(race, description, advices, 0, 0, 190000000, 1);
    		this.mc.displayGuiScreen(gui3);
    	}
    	else if (b.id == 43)
    	{
    		description = new String[4];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("Moogle");
    		description[0] = I18n.format("A fluffy pom-pom and bat-like wings set this race apart");
    		description[1] = I18n.format("Their small stature lends itself to leaping out and surprising people, ");
    		description[2] = I18n.format("in which they take great delight.");
    		description[3] = I18n.format("With tiny and nimble hands, Moogles excel at a number of unusual Jobs.");
    		
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.hp");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.agility");
    		advices[2] = ChatColor.RED + "- " + I18n.format("stats.mana");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.clarity");
    		gui4 = new GuiMoogleRaceInformation(race, description, advices, 1, 0, 180000000, 6);
    		this.mc.displayGuiScreen(gui4);
    	}
    	else if (b.id == 44)
    	{
    		description = new String[3];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("Viera");
    		description[0] = I18n.format("Members of this tall race with hair of spun silver are often called People of the Wood or Wood People.");
    		description[1] = I18n.format("Viera are lithe of limb and tremendously quick");
    		description[2] = I18n.format("Their slender bodies grant superior strength and skill.");
    		
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.agility");
    		gui5 = new GuiVieraRaceInformation(race, description, advices, 2, 0, -100000000, 4);
    		this.mc.displayGuiScreen(gui5);
    	}
    	else if (b.id == 45)
    	{
    		description = new String[3];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("Bangaa");
    		description[0] = I18n.format("Scales cover the bodies of this reptilian race.");
    		description[1] = I18n.format("Muscled and powerful, Bangaa are physically imposing.");
    		description[2] = I18n.format("Their rough, bellicose temperament leads them to pursue mainly warrior-like Jobs.");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.agility");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.strength");
    		advices[2] = ChatColor.RED + "- " + I18n.format("stats.mana");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.clarity");
    		gui6 = new GuiBangaaRaceInformation(race, description, advices, 0, 1, 180000000, 2);
    		this.mc.displayGuiScreen(gui6);
    	}
    	else if (b.id == 46)
    	{
    		description = new String[3];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("Nu Mou");
    		description[0] = I18n.format("With a dog-like face and ears that drag along the ground, there is no mistaking a Nu Mou.");
    		description[1] = I18n.format("Extremely intelligent, they make for powerful mages, but their frail bodies are ill suited for physical combat.");
    		description[2] = I18n.format("Due to their high intelligence, they are suited to magic-related Jobs");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+ " + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui7 = new GuiNuMouRaceInformation(race, description, advices, 1, 1, Integer.MAX_VALUE, 5);
    		this.mc.displayGuiScreen(gui7);
    	}
    	else if (b.id == 47)
    	{
    		description = new String[4];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("Seeq");
    		description[0] = I18n.format("A portly, porcine race with stubby legs");
    		description[1] = I18n.format("one would not expect a Seeq to be quick,");
    		description[2] = I18n.format("yet few can match their speed");
    		description[3] = I18n.format("Though dim-witted and unscrupulous, their knowledge of battle is formidable.");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui8 = new GuiSeeqRaceInformation(race, description, advices, 2, 1, Integer.MAX_VALUE, 3);
    		this.mc.displayGuiScreen(gui8);
    	}
    	else if (b.id == 48)
    	{
    		description = new String[1];
    		advices = new String[4];
    		race = ChatColor.WHITE + I18n.format("Gria");
    		description[0] = I18n.format("Wings of a dragon and powerful tail distinguish this unique race.");
    		description[1] = I18n.format("Outwardly small, some may even say cute, Gria make vicious foes in battle.");
    		description[2] = I18n.format("They have a fierce and competitive spirit.");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui9 = new GuiGriaRaceInformation(race, description, advices, 3, 0, Integer.MAX_VALUE, 7);
    		this.mc.displayGuiScreen(gui9);
    	}
    	
        	}
    	}