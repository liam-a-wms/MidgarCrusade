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

public class GuiSelectHumeClass extends GuiScreen {
	
	public static final ResourceLocation CLASSES = new ResourceLocation("magiccrusade:textures/gui/classes.png");

	@Override
	public void initGui()
	{
		GuiButton buttons[];
		
		buttons = new GuiButton[2];
		
		
		/*buttons[0] = new GuiButton(48, this.width / 2 - 40, this.height / 2 + 132,80, 20, ChatColor.RESET + I18n.format("classe.Thief"));
		
		buttons[1] = new GuiButton(49, this.width / 2 - 40, this.height / 2 + 110, 80, 20, ChatColor.RESET + I18n.format("classe.Blackmage"));

		buttons[2] = new GuiButton(50, this.width / 2 - 40, this.height / 2 + 88, 80, 20, ChatColor.RESET + I18n.format("classe.Archer"));

		buttons[3] = new GuiButton(51, this.width / 2 - 40, this.height / 2 + 66, 80, 20, ChatColor.RESET + I18n.format("classe.Paladin"));
		
		buttons[4] = new GuiButton(52, this.width / 2 - 40, this.height/ 2 + 44, 80, 20, ChatColor.RESET + I18n.format("classe.Fighter"));
		
		buttons[5] = new GuiButton(53, this.width / 2 - 40, this.height / 2 + 22, 80, 20, ChatColor.RESET + I18n.format("classe.Samurai"));

		buttons[6] = new GuiButton(54, this.width / 2 - 40, this.height / 2 - 0, 80, 20, ChatColor.RESET + I18n.format("classe.Bluemage"));

		buttons[7] = new GuiButton(55, this.width / 2 - 40, this.height / 2 - 22, 80, 20, ChatColor.RESET + I18n.format("classe.Illusionist"));

		buttons[8] = new GuiButton(56, this.width / 2 - 40, this.height / 2 - 44, 80, 20, ChatColor.RESET + I18n.format("classe.Seer"));
		
		buttons[9] = new GuiButton(57, this.width / 2 - 40, this.height / 2 - 66,80, 20, ChatColor.RESET + I18n.format("classe.Ninja"));
*/
		buttons[0] = new GuiButton(101, this.width / 2 - 40, this.height / 2 - 88, 80, 20, ChatColor.RESET + I18n.format("classe.Soldier"));

		buttons[1] = new GuiButton(102, this.width / 2 - 40, this.height / 2 - 110, 80, 20, ChatColor.RESET + I18n.format("classe.Whitemage"));

		
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
    	this.drawCenteredString(this.fontRendererObj, I18n.format("classe.choose"), this.width / 2, 14, Integer.MAX_VALUE / 2);
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
    
    	 	if (b.id == 101)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Soldier.slogan");
    		description[0] = I18n.format("classe.Soldier.line1");
    		//description[1] = I18n.format("classe.Soldier.line2");
    		//description[2] = I18n.format("classe.Soldier.line3");
    		//description[3] = I18n.format("classe.Soldier.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+ " + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 1, 2, Integer.MAX_VALUE, 60);
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
        	gui = new GuiClasseInformation(classe, description, advices, 1, 1, Integer.MAX_VALUE, 63);
        	this.mc.displayGuiScreen(gui);
        		
        	}
    	 	
        		
        	}
    	}
    
