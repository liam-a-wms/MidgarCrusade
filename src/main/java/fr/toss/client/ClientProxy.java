package fr.toss.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import api.player.client.ClientPlayerAPI;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.toss.FF7.ItemRegistry1;
import fr.toss.FF7.Tileentities.*;
import fr.toss.FF7.projectiles.entities.*;
import fr.toss.FF7.renderers.*;
import fr.toss.client.event.GuiIngameOverlay;
import fr.toss.client.event.SoundEventM;
import fr.toss.client.registry.RenderRegistry;
import fr.toss.common.CommonProxy;
import fr.toss.common.player.ClientPlayerBaseMagic;

public class ClientProxy extends CommonProxy 
{
	public static Minecraft minecraft = Minecraft.getMinecraft();
	public static final int				CURRENT_VERSION = 4;
	public static int					LAST_VERSION;
	
	public void load()
	{
		super.load();
		ClientPlayerAPI.register("Magic Crusade", ClientPlayerBaseMagic.class);

		RenderRegistry.load();
		
		FMLCommonHandler.instance().bus().register(new KeyInputHandler());
		KeyBindings.load();
		
		GuiIngameOverlay events = new GuiIngameOverlay(minecraft);
    	FMLCommonHandler.instance().bus().register(events);
    	MinecraftForge.EVENT_BUS.register(events);
    	
		SoundEventM soundHandler = new SoundEventM();
    	FMLCommonHandler.instance().bus().register(soundHandler);
    	MinecraftForge.EVENT_BUS.register(soundHandler);
	}
    	public void registerRenderers()
    	{
    	GameRegistry.registerTileEntity(TileEntityBush1.class, "Bush1");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBush1.class, new RenderTileEntityBush1());
        
        GameRegistry.registerTileEntity(TileEntityChest1.class, "Chest1");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest1.class, new RenderTileEntityChest1());
        
        GameRegistry.registerTileEntity(TileEntityChest2.class, "Chest2");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest2.class, new RenderTileEntityChest2());
        
        GameRegistry.registerTileEntity(TileEntityChest3.class, "Chest3");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest3.class, new RenderTileEntityChest3());
        
        GameRegistry.registerTileEntity(TileEntityChest4.class, "Chest4");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest4.class, new RenderTileEntityChest4());
        
        GameRegistry.registerTileEntity(TileEntityChest5.class, "Chest5");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest5.class, new RenderTileEntityChest5());
        
        GameRegistry.registerTileEntity(TileEntityChest6.class, "Chest6");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest6.class, new RenderTileEntityChest6());
        
        GameRegistry.registerTileEntity(TileEntityChest7.class, "Chest7");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest7.class, new RenderTileEntityChest7());
        
        GameRegistry.registerTileEntity(TileEntityChest8.class, "Chest8");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest8.class, new RenderTileEntityChest8());
        
        GameRegistry.registerTileEntity(TileEntityhelicopter.class, "helicopter");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityhelicopter.class, new Renderhelicopter());
        
        
        //RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, new RenderTutorialPlayer());
        
        GameRegistry.registerTileEntity(TileEntityCauldron.class, "FFCauldron");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCauldron.class, new RenderTileEntityCauldron());
        
        GameRegistry.registerTileEntity(TileEntityBookcase.class, "Bookcase");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBookcase.class, new RenderTileEntityBookcase());
		
		GameRegistry.registerTileEntity(TileEntityBrewstand.class, "Brew stand");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBrewstand.class, new RenderTileEntityBrewingstand());
        GameRegistry.registerTileEntity(TileEntityAnvil.class, "anvil");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAnvil.class, new RenderTileEntityAnvil());
        
        GameRegistry.registerTileEntity(TileEntityventshaft1.class, "ventshaft1");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityventshaft1.class, new RenderTileEntityventshaft1());
        
        GameRegistry.registerTileEntity(TileEntityrustycrate.class, "rustycrate");
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityrustycrate.class, new RenderTileEntityrustycrate());
        
        
      
        
        
        
        
         RenderingRegistry.registerEntityRenderingHandler(EntityEnergyBall.class, new RenderSnowball(ItemRegistry1.plasma));  
		 RenderingRegistry.registerEntityRenderingHandler(EntityJavelin.class, new RenderSnowball(ItemRegistry1.Javelin));   
		 RenderingRegistry.registerEntityRenderingHandler(Entityairrender.class, new RenderSnowball(ItemRegistry1.airrender));  
		 
		  
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Adamantblade, new RenderRedscythe());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Adazakura, new Renderdarkknight());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Airblade, new Rendermachinarapier());
		 
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Aceofspades, new Renderacecard());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Amanomurakumo, new RenderBrotherhood());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Ancientsword, new RenderCaladbolg());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Aiotgun, new Rendercatergun());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Apocalypse, new Rendercinquesmace());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Aquasaber, new Rendercloudcomplete());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Arbalest, new Rendercloudhk1buster());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Archsword, new Rendercloudhk2complete());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Ashura, new Rendercloudultima());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Atomosblade, new Renderdeucesflute());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Ayvuirblue, new Rendereldorado());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Ayvuirred, new Renderenchantedrod());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Barong, new Rendergunblade());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Battlebamboo, new Renderhyperion());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Battlefolio, new Renderjacksgun());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Battlemace, new Renderjackskatana());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Battlerapier, new Renderjechtssword());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Beastsword, new Renderkurasumesword());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Blackquena, new Rendermalleablestaff());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Blueleafflute, new Rendernineslance());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Bloodsword, new Rendermasamune());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Bluesaber, new Rendernirvana());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Bombarm, new Rendernoctisblade1());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Brevis, new Rendernoctisblade2());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Brillianttheorbo, new Rendernpcsword1());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Broadaxe, new Rendernpcsword2());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Broadsword, new Renderpaine());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Burglarsword, new Renderqatorssword());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Bustersword, new Renderqatorswordsheathed());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Catclaws, new Renderqueenslongsword());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Chaosrifle, new Renderremsdagger());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Charbow, new Renderrikku());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Cheerstaff, new Renderrustysword());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Chillrod, new Rendersamuraiblade());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Chirijiraden, new Rendersamuraisword());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Cinquedea, new Rendershuriken());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Claymore, new Rendershuyinsword());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Cleansingstaff, new Rendersicesscythe());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Colichemarde, new Renderspikedrod());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Compositebow, new Rendersquallgunblade());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Conchshell, new Renderstaff());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Cranequinbow, new Rendersword1());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Crescentbow, new Rendersword2());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Crownscepter, new Rendertisword1());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Cypresspole, new Rendertisword2());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Dagger, new Rendertisword3());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Dagriohm, new Rendertisword4());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Deathclaws, new RenderTisword5());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Defender, new Rendertreyslongbow());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Demonbell, new Renderyuna());
		 MinecraftForgeClient.registerItemRenderer(ItemRegistry1.Diabolique, new Renderzacksword());
		// MinecraftForgeClient.registerItemRenderer(ItemRegistry1.classcard1, new Rendercard());
		 
    	
    	
    	
    	
    	
    	
    	
	}
	
   /* static void handle_version()
    {
        URL 			url;
        BufferedReader 	in;

        try {
            url = new URL("http://grillecube.fr/MagicCrusade/version.txt");
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            LAST_VERSION = Integer.valueOf(in.readLine());
			in.close();
		} catch (IOException e) {
        	Main.log("[ERROR] Telechargement de la version");
			e.printStackTrace();
		}
        
        if (LAST_VERSION != CURRENT_VERSION)
        {
        	GuiIngameOverlay.INFO.add(ChatColor.RED + I18n.format("message.outdated") + ChatColor.RESET);
        	GuiIngameOverlay.DELAY_INFO = 20000;
        	Main.log("Le mod n'est pas à jour");
        }
	*/}
