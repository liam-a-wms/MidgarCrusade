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

public class GuiSelectClass extends GuiScreen {
	
	public static final ResourceLocation CLASSES = new ResourceLocation("magiccrusade:textures/gui/classes.png");

	@Override
	public void initGui()
	{
		GuiButton buttons[];
		
		buttons = new GuiButton[60];
		
		buttons[0] = new GuiButton(42, this.width / 4 - 200, this.height / 4 - 100, 80, 20, ChatColor.RESET + I18n.format("classe.champion"));
		
		buttons[1] = new GuiButton(43, this.width / 4 - 200, this.height / 4 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.rogue"));
		
		buttons[2] = new GuiButton(44, this.width / 4 - 200, this.height / 4 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.necromancer"));
		
		buttons[3] = new GuiButton(45, this.width / 4 - 200, this.height /  4 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Dragonslayer"));
		
		buttons[4] = new GuiButton(46, this.width / 4 - 200, this.height /  4 - 12, 80, 20, ChatColor.RESET + I18n.format("classe.mage"));

		buttons[5] = new GuiButton(47, this.width / 4 - 200, this.height /  2 - 100, 80, 20, ChatColor.RESET + I18n.format("classe.Priest"));

		buttons[6] = new GuiButton(48, this.width / 4 - 200, this.height /  2 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.Thief"));
		
		buttons[7] = new GuiButton(49, this.width / 4 - 200, this.height /  2 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.BlackMage"));

		buttons[8] = new GuiButton(50, this.width / 4 - 200, this.height /  2 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Archer"));

		buttons[9] = new GuiButton(51, this.width / 4 - 200, this.height /  2 - 12, 80, 20, ChatColor.RESET + I18n.format("classe.Paladin"));
		
		buttons[10] = new GuiButton(52, this.width / 4 - 200, this.height + 0 + 1 - 230, 80, 20, ChatColor.RESET + I18n.format("classe.Fighter"));
		
		buttons[11] = new GuiButton(53, this.width / 4 - 200, this.height + 0 + 1 - 208, 80, 20, ChatColor.RESET + I18n.format("classe.Samurai"));

		buttons[12] = new GuiButton(54, this.width / 4 - 200, this.height + 0 + 1 - 188, 80, 20, ChatColor.RESET + I18n.format("classe.Bluemage"));

		buttons[13] = new GuiButton(55, this.width / 4 - 200, this.height + 0 + 1 - 166, 80, 20, ChatColor.RESET + I18n.format("classe.Illusionist"));

		buttons[14] = new GuiButton(56, this.width / 4 - 200, this.height + 0 + 1 - 144, 80, 20, ChatColor.RESET + I18n.format("classe.Seer"));
		
		buttons[15] = new GuiButton(57, this.width / 2 - 200, this.height / 4 - 100, 80, 20, ChatColor.RESET + I18n.format("classe.Ninja"));

		buttons[16] = new GuiButton(58, this.width / 2 - 200, this.height / 4 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.Animist"));

		buttons[17] = new GuiButton(59, this.width / 2 - 200, this.height / 4 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.MoogleKnight"));

		buttons[18] = new GuiButton(60, this.width / 2 - 200, this.height / 4 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Fusilier"));

		buttons[19] = new GuiButton(61, this.width / 2 - 200, this.height / 4 - 12, 80, 20, ChatColor.RESET + I18n.format("classe.Juggler"));

		buttons[20] = new GuiButton(62, this.width / 2 - 200, this.height / 2 - 100, 80, 20, ChatColor.RESET + I18n.format("classe.Tinker"));

		buttons[21] = new GuiButton(63, this.width / 2 - 200, this.height / 2 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.TimeMage"));

		buttons[22] = new GuiButton(64, this.width / 2 - 200, this.height / 2 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.ChocoboKnight"));

		buttons[23] = new GuiButton(65, this.width / 2 - 200, this.height / 2 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Flintlock"));

		buttons[24] = new GuiButton(66, this.width / 2 - 200, this.height / 2 - 12, 80, 20, ChatColor.RESET + I18n.format("classe.Fencer"));

		buttons[25] = new GuiButton(67, this.width / 2 - 200, this.height + 0 + 1 - 230, 80, 20, ChatColor.RESET + I18n.format("classe.Assassin"));

		buttons[26] = new GuiButton(68, this.width / 2 - 200, this.height + 0 + 1 - 208, 80, 20, ChatColor.RESET + I18n.format("classe.Summoner"));

		buttons[27] = new GuiButton(69, this.width / 2 - 200, this.height + 0 + 1 - 188, 80, 20, ChatColor.RESET + I18n.format("classe.Sniper"));

		buttons[28] = new GuiButton(70, this.width / 2 - 200, this.height + 0 + 1 - 166, 80, 20, ChatColor.RESET + I18n.format("classe.Elementalist"));

		buttons[29] = new GuiButton(71, this.width / 2 - 200, this.height + 0 + 1 - 144, 80, 20, ChatColor.RESET + I18n.format("classe.RedMage"));
		
		buttons[30] = new GuiButton(72, this.width / 1 - 400, this.height / 4 - 100, 80, 20, ChatColor.RESET + I18n.format("classe.GreenMage"));
		
		buttons[31] = new GuiButton(73, this.width / 1 - 400, this.height / 4 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.Warrior"));

		buttons[32] = new GuiButton(74, this.width / 1 - 400, this.height / 4 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.WhiteMonk"));

		buttons[33] = new GuiButton(75, this.width / 1 - 400, this.height / 4 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Dragoon"));

		buttons[34] = new GuiButton(76, this.width / 1 - 400, this.height / 4 - 12, 80, 20, ChatColor.RESET + I18n.format("classe.Defender"));

		buttons[35] = new GuiButton(77, this.width / 1 - 400, this.height / 2 - 100, 80, 20, ChatColor.RESET + I18n.format("classe.Bishop"));

		buttons[36] = new GuiButton(78, this.width / 1 - 400, this.height / 2 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.Gladiator"));

		buttons[37] = new GuiButton(79, this.width / 1 - 400, this.height / 2 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.Templar"));

		buttons[38] = new GuiButton(80, this.width / 1 - 400, this.height / 2 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Cannoneer"));

		buttons[39] = new GuiButton(81, this.width / 1 - 400, this.height / 2 - 12, 80, 20, ChatColor.RESET + I18n.format("classe.MasterMonk"));

		buttons[40] = new GuiButton(82, this.width / 1 - 400, this.height + 0 + 1 - 230, 80, 20, ChatColor.RESET + I18n.format("classe.Trickster"));

		buttons[41] = new GuiButton(83, this.width / 1 - 400, this.height + 0 + 1 - 208, 80, 20, ChatColor.RESET + I18n.format("classe.Beastmaster"));

		buttons[42] = new GuiButton(84, this.width / 1 - 400, this.height + 0 + 1 - 188, 80, 20, ChatColor.RESET + I18n.format("classe.Sage"));

		buttons[43] = new GuiButton(85, this.width / 1 - 400, this.height + 0 + 1 - 166, 80, 20, ChatColor.RESET + I18n.format("classe.Alchemist"));

		buttons[44] = new GuiButton(86, this.width / 1 - 400, this.height + 0 + 1 - 144, 80, 20, ChatColor.RESET + I18n.format("classe.Arcanist"));
		
		buttons[45] = new GuiButton(87, this.width / 1 - 100, this.height / 4 - 100, 80, 20, ChatColor.RESET + I18n.format("classe.Scholar"));

		buttons[46] = new GuiButton(88, this.width /  1 - 100, this.height / 4 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.Ranger"));

		buttons[47] = new GuiButton(89, this.width / 1 - 100, this.height / 4 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.Berserker"));

		buttons[48] = new GuiButton(90, this.width / 1 - 100, this.height / 4 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Lanista"));

		buttons[49] = new GuiButton(91, this.width / 1 - 100, this.height / 4 - 12, 80, 20, ChatColor.RESET + I18n.format("classe.Viking"));

		buttons[50] = new GuiButton(92, this.width / 1 - 100, this.height / 2 - 100, 80, 20, ChatColor.RESET + I18n.format("classe.Raptor"));

		buttons[51] = new GuiButton(93, this.width / 1 - 100, this.height / 2 - 78, 80, 20, ChatColor.RESET + I18n.format("classe.Hunter"));

		buttons[52] = new GuiButton(94, this.width / 1 - 100, this.height / 2 - 56, 80, 20, ChatColor.RESET + I18n.format("classe.Ravager"));

		buttons[53] = new GuiButton(95, this.width / 1 - 100, this.height / 2 - 34, 80, 20, ChatColor.RESET + I18n.format("classe.Geomancer"));

		buttons[54] = new GuiButton(96, this.width / 1 - 100, this.height / 2 - 12, 80, 20, ChatColor.RESET + I18n.format("classe.Agent"));

		buttons[55] = new GuiButton(97, this.width / 1 - 100, this.height + 0 + 1 - 230, 80, 20, ChatColor.RESET + I18n.format("classe.Heritor"));

		buttons[56] = new GuiButton(98, this.width / 1 - 100, this.height + 0 + 1 - 208, 80, 20, ChatColor.RESET + I18n.format("classe.Dancer"));

		buttons[57] = new GuiButton(99, this.width / 1 - 100, this.height + 0 + 1 - 188, 80, 20, ChatColor.RESET + I18n.format("classe.skypirate"));

		buttons[58] = new GuiButton(100, this.width / 1 - 100, this.height + 0 + 1 - 166, 80, 20, ChatColor.RESET + I18n.format("classe.Bard"));

		buttons[59] = new GuiButton(101, this.width / 1 - 100, this.height + 0 + 1 - 144, 80, 20, ChatColor.RESET + I18n.format("classe.Soldier"));

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
    	if (b.id == 42)
    	{    		
    		description = new String[4];
    		advices = new String[4];
    		classe = ChatColor.RED + I18n.format("classe.champion.slogan");
    		description[0] = I18n.format("classe.champion.line1");
    		description[1] = I18n.format("classe.champion.line2");
    		description[2] = I18n.format("classe.champion.line3");
    		description[3] = I18n.format("classe.champion.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.hp");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.strength");
    		advices[2] = ChatColor.GREEN + "+ " + I18n.format("stats.armor");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.mana");
    		gui = new GuiClasseInformation(classe, description, advices, 0, 0, 190000000, 1);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 43)
    	{
    		description = new String[5];
    		advices = new String[4];
    		classe = ChatColor.YELLOW + I18n.format("classe.rogue.slogan");
    		description[0] = I18n.format("classe.rogue.line1");
    		description[1] = I18n.format("classe.rogue.line2");
    		description[2] = I18n.format("classe.rogue.line3");
    		description[3] = I18n.format("classe.rogue.line4");
    		description[4] = I18n.format("classe.rogue.line5");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.hp");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.agility");
    		advices[2] = ChatColor.RED + "- " + I18n.format("stats.mana");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.clarity");
    		gui = new GuiClasseInformation(classe, description, advices, 1, 0, 180000000, 6);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 44)
    	{
    		description = new String[4];
    		advices = new String[4];
    		classe = ChatColor.DARK_PURPLE + I18n.format("classe.necromancer.slogan");
    		description[0] = I18n.format("classe.necromancer.line1");
    		description[1] = I18n.format("classe.necromancer.line2");
    		description[2] = I18n.format("classe.necromancer.line3");
    		description[3] = I18n.format("classe.necromancer.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.agility");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 0, -100000000, 4);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 45)
    	{
    		description = new String[4];
    		advices = new String[4];
    		classe = ChatColor.GOLD + I18n.format("classe.ranger.slogan");
    		description[0] = I18n.format("classe.ranger.line1");
    		description[1] = I18n.format("classe.ranger.line2");
    		description[2] = I18n.format("classe.ranger.line3");
    		description[3] = I18n.format("classe.ranger.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.agility");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.strength");
    		advices[2] = ChatColor.RED + "- " + I18n.format("stats.mana");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.clarity");
    		gui = new GuiClasseInformation(classe, description, advices, 0, 1, 180000000, 2);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 46)
    	{
    		description = new String[4];
    		advices = new String[4];
    		classe = ChatColor.AQUA + I18n.format("classe.mage.slogan");
    		description[0] = I18n.format("classe.mage.line1");
    		description[1] = I18n.format("classe.mage.line2");
    		description[2] = I18n.format("classe.mage.line3");
    		description[3] = I18n.format("classe.mage.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+ " + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 1, 1, Integer.MAX_VALUE, 5);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 47)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.priest.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 5);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 48)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.thief.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 7);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 49)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.blackmage.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 8);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 50)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.archer.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 9);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 51)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.paladin.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 10);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 52)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.fighter.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 11);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 53)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.samurai.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 12);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 54)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.bluemage.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 13);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 55)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.Illusionist.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 14);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 56)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.seer.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 15);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 57)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.Ninja.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 16);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 58)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.animist.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 17);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 59)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.moogleknight.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 18);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 60)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.Fusilier.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 19);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 61)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.juggler.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 20);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 62)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.tinker.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 21);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 63)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.timemage.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 22);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 64)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.chocoboknight.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 23);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 65)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.Flintlock.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 24);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 66)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.fencer.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 25);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 67)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.assassin.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 26);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 68)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.summoner.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 27);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 69)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.sniper.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 28);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 70)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.elementalist.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 29);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 71)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.redmage.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 30);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 72)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.greenmage.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 31);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 73)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.warrior.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 32);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 74)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.whitemonk.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 33);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 75)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.dragoon.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 34);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 76)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.defender.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 35);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 77)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.bishop.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 36);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 78)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.gladiator.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 37);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 79)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.templar.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 38);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 80)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.cannoneer.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 39);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 81)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.mastermonk.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 40);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 82)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.trickster.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 41);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 83)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.beastmaster.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 42);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 84)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.sage.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 43);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 85)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.alchemist.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 44);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 86)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.arcanist.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 45);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 87)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.scholar.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 46);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 88)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.ranger.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 47);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 89)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.berserker.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 48);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 90)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.lanista.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 49);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 91)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.viking.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 50);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 92)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.raptor.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 51);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 93)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.hunter.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 52);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 94)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.ravager.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 53);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 95)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.geomancer.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 54);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 96)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.agent.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 55);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 97)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.heritor.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 56);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 98)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.dancer.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 57);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 99)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.skypirate.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 58);
    		this.mc.displayGuiScreen(gui);
    	}
    	else if (b.id == 100)
    	{
    		description = new String[3];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.bard.slogan");
    		description[0] = I18n.format("classe.priest.line1");
    		description[1] = I18n.format("classe.priest.line2");
    		description[2] = I18n.format("classe.priest.line3");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+" + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 2, 1, Integer.MAX_VALUE, 59);
    		this.mc.displayGuiScreen(gui);
    	}
    	 	else if (b.id == 101)
    	{
    		description = new String[4];
    		advices = new String[4];
    		classe = ChatColor.GRAY + I18n.format("classe.Soldier.slogan");
    		description[0] = I18n.format("classe.Soldier.line1");
    		description[1] = I18n.format("classe.Soldier.line2");
    		description[2] = I18n.format("classe.Soldier.line3");
    		description[3] = I18n.format("classe.Soldier.line4");
    		advices[0] = ChatColor.GREEN + "+ " + I18n.format("stats.mana");
    		advices[1] = ChatColor.GREEN + "+ " + I18n.format("stats.clarity");
    		advices[2] = ChatColor.GREEN + "+ " + I18n.format("stats.mana_regen");
    		advices[3] = ChatColor.RED + "- " + I18n.format("stats.strength");
    		gui = new GuiClasseInformation(classe, description, advices, 1, 1, Integer.MAX_VALUE, 60);
    		this.mc.displayGuiScreen(gui);
    		
    	}
    }
}
