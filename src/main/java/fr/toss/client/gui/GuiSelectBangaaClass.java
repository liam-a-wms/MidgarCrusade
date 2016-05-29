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

public class GuiSelectBangaaClass extends GuiScreen {
	
	public static final ResourceLocation CLASSES = new ResourceLocation("magiccrusade:textures/gui/classes.png");

	@Override
	public void initGui()
	{
		GuiButton buttons[];
		
		buttons = new GuiButton[2];
		
		buttons[0] = new GuiButton(73, this.width / 2 - 40, this.height / 2 + 110, 80, 20, ChatColor.RESET + I18n.format("classe.Warrior"));

		buttons[1] = new GuiButton(74, this.width / 2 - 40, this.height / 2 + 88, 80, 20, ChatColor.RESET + I18n.format("classe.WhiteMonk"));

		
		
		
		
		
		
		
		
		
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
		if (b.id == 73)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Warrior.slogan");
    		description[0] = I18n.format("classe.Warrior.line1");
    		//description[1] = I18n.format("classe.Warrior.line2");
    		//description[2] = I18n.format("classe.Warrior.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 32);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 74)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.WhiteMonk.slogan");
    		description[0] = I18n.format("classe.WhiteMonk.line1");
    		//description[1] = I18n.format("classe.WhiteMonk.line2");
    		//description[2] = I18n.format("classe.WhiteMonk.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 33);
    		this.mc.displayGuiScreen(gui);
    	}
    	
    }
}