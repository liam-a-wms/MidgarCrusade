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

public class GuiSelectMoogleClass extends GuiScreen {
	
	public static final ResourceLocation CLASSES = new ResourceLocation("magiccrusade:textures/gui/classes.png");

	@Override
	public void initGui()
	{
		GuiButton buttons[];
		
		buttons = new GuiButton[10];
		
		buttons[0] = new GuiButton(58, this.width / 2 - 200, this.height / 4 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.Animist"));

		buttons[1] = new GuiButton(48, this.width / 4 - 200, this.height /  2 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.Thief"));
		
		buttons[2] = new GuiButton(49, this.width / 4 - 200, this.height /  2 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.Blackmage"));
		
		buttons[3] = new GuiButton(59, this.width / 2 - 200, this.height / 4 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.MoogleKnight"));
		
		buttons[4] = new GuiButton(60, this.width / 2 - 200, this.height / 4 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Fusilier"));

		buttons[5] = new GuiButton(61, this.width / 2 - 200, this.height / 4 - 12, 80, 20, ChatColor.RESET + I18n.format("classe.Juggler"));

		buttons[6] = new GuiButton(62, this.width / 2 - 200, this.height / 2 - 100, 80, 20, ChatColor.RESET + I18n.format("classe.Tinker"));

		buttons[7] = new GuiButton(63, this.width / 2 - 200, this.height / 2 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.TimeMage"));

		buttons[8] = new GuiButton(64, this.width / 2 - 200, this.height / 2 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.ChocoboKnight"));

		buttons[9] = new GuiButton(65, this.width / 2 - 200, this.height / 2 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Flintlock"));
		

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
    	if (b.id == 48)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Thief.slogan");
    		description[0] = I18n.format("classe.Thief.line1");
    		//description[1] = I18n.format("classe.Thief.line2");
    		//description[2] = I18n.format("classe.Thief.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 3, 0, Integer.MAX_VALUE, 7);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 49)
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
    	
    	else if (b.id == 58)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Animist.slogan");
    		description[0] = I18n.format("classe.Animist.line1");
    		//description[1] = I18n.format("classe.Animist.line2");
    		//description[2] = I18n.format("classe.Animist.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 17);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 59)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Moogleknight.slogan");
    		description[0] = I18n.format("classe.Moogleknight.line1");
    		//description[1] = I18n.format("classe.Moogleknight.line2");
    		//description[2] = I18n.format("classe.Moogleknight.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 18);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 60)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Fusilier.slogan");
    		description[0] = I18n.format("classe.Fusilier.line1");
    		//description[1] = I18n.format("classe.Fusilier.line2");
    		//description[2] = I18n.format("classe.Fusilier.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 19);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 61)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Juggler.slogan");
    		description[0] = I18n.format("classe.Juggler.line1");
    		//description[1] = I18n.format("classe.Juggler.line2");
    		//description[2] = I18n.format("classe.Juggler.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.energy");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 20);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 62)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.Tinker.slogan");
    		description[0] = I18n.format("classe.Tinker.line1");
    		//description[1] = I18n.format("classe.Tinker.line2");
    		//description[2] = I18n.format("classe.Tinker.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 21);
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
    	else if (b.id == 64)
    	{
    		description = new String[1];
    		advices = new String[4];
    		classe = ChatColor.WHITE + I18n.format("classe.ChocoboKnight.slogan");
    		description[0] = I18n.format("classe.ChocoboKnight.line1");
    		//description[1] = I18n.format("classe.ChocoboKnight.line2");
    		//description[2] = I18n.format("classe.ChocoboKnight.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 23);
    		this.mc.displayGuiScreen(gui);
    	}
    }
}