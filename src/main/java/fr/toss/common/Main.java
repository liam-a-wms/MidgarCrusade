package fr.toss.common;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import api.player.client.IClientPlayerAPI;
import api.player.server.IServerPlayerAPI;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ArmorRegistry;
import fr.toss.FF7.BlockRegistry1;
import fr.toss.FF7.Command;
import fr.toss.FF7.ForgeEventHooksHandler;
import fr.toss.FF7.ItemRegistry;
import fr.toss.FF7.ItemRegistry1;
import fr.toss.FF7.Potioneventhandlers;
import fr.toss.FF7.reciperegister;
import fr.toss.FF7.inits.PotionYourmod;
import fr.toss.FF7.items.*;
import fr.toss.FF7.projectiles.entities.*;
import fr.toss.common.command.CommandLoader;
import fr.toss.common.game.ServerMagic;
import fr.toss.common.packet.Packets;
import fr.toss.common.player.ClientPlayerBaseMagic;
import fr.toss.common.player.ServerPlayerBaseMagic;
import fr.toss.common.world.dungeon.Dungeon;

@Mod(modid=Main.MODID, name=Main.MODNAME, version=Main.MODVER)  //Tell forge "Oh hey, there's a new mod here to load."

public class Main
{

	  //Set the ID of the mod (Should be lower case).
    public static final String MODID = "ff7";
    //Set the "Name" of the mod.
    public static final String MODNAME = "ff7";
    //Set the version of the mod.
    public static final String MODVER = "0.0.0";

    public static DamageSource Earth = new DamageSource("Earth");
    public static DamageSource Shadow = new DamageSource("Shadow");
    public static DamageSource Lightning = new DamageSource("Lightning");
    public static DamageSource Fire = new DamageSource("Fire");
    public static DamageSource Ice = new DamageSource("Ice");
    public static DamageSource Wind = new DamageSource("Wind");
    public static DamageSource Water = new DamageSource("Water");
    public static DamageSource Holy = new DamageSource("Holy");
	
	
	
	
	
	private static Main 		instance;
	public static ServerMagic 	server;
	public static int 			DIM_ID;
	public static List<Dungeon> DUNGEONS;

	@SidedProxy(clientSide="fr.toss.client.ClientProxy", serverSide="fr.toss.common.CommonProxy")
	public static CommonProxy 	proxy;
	

	 private static int BrewingstandID;
	    public static Block Brewingstand;
	    private static int FFanvilID;
	    public static Block FFanvil;
	    private static int Bush1ID;
	    public static Block Bush1;
	    private static int BookcaseID;
	    public static Block Bookcase;
	    private static int CauldronID;
	    public static Block Cauldron;
	    private static int  Chest1ID;
	    public static Block  Chest1;
	    private static int  Chest2ID;
	    public static Block  Chest2;
	    private static int  Chest3ID;
	    public static Block  Chest3;
	    private static int  Chest4ID;
	    public static Block  Chest4;
	    private static int  Chest5ID;
	    public static Block  Chest5;
	    private static int  Chest6ID;
	    public static Block  Chest6;
	    private static int  Chest7ID;
	    public static Block  Chest7;
	    private static int  Chest8ID;
	    public static Block  Chest8;
	    private static int HelicopterID;
	    public static Block Helicopter;
	    private static int  rustycrateID;
	    public static Block  rustycrate;
	    
	    
	    
	    private static int PhoenixFeatherID;
	    public static Item PhoenixFeather;
	    public static boolean allowPFeather;
	
	
	
	
	
	
	
	
    @EventHandler
    public void 		preInit(FMLPreInitializationEvent event)
    {
    	
    	 Configuration config = new Configuration(event.getSuggestedConfigurationFile());
 	    System.out.println("Loaded config from " + event.getSuggestedConfigurationFile().getAbsolutePath());
 	    
 	    config.load();
 	
 	    allowPFeather = config.get("toggles", "PhoenixFeatherAllowed", true).getBoolean(true);
 	  

 	    config.save();
 	
 	    ItemRegistry1.customPotion = (new PotionYourmod(31, false, 0)).setIconIndex(0, 0).setPotionName("potion.customPotion1");
 	   ItemRegistry1.customPotion2 = (new PotionYourmod(31, false, 0)).setIconIndex(0, 0).setPotionName("potion.customPotion2");
 	  ItemRegistry1.customPotion3 = (new PotionYourmod(31, false, 0)).setIconIndex(0, 0).setPotionName("potion.customPotion3");
 	 ItemRegistry1.customPotion4 = (new PotionYourmod(31, false, 0)).setIconIndex(0, 0).setPotionName("potion.customPotion4");
	  
 	    //------------------------------------------register items here -----------------------------------------------//
 	    
 	    if (allowPFeather)
	        {
	    	
 	    	PhoenixFeather = new PhoenixFeather(PhoenixFeatherID);
 	         GameRegistry.registerItem(PhoenixFeather, "PhoenixFeather");
 	    
 	    
 	   
 	    
	        }
 	    //--------------------------------------------------------------------------------------------------------------//
 	    
 	    Potion[] potionTypes = null;

     	for (Field f : Potion.class.getDeclaredFields()) {
     	f.setAccessible(true);
     	try {
     	if (f.getName().equals("potionTypes") || f.getName().equals("p_i1573_1_.")) {
     	Field modfield = Field.class.getDeclaredField("modifiers");
     	modfield.setAccessible(true);
     	modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);

     	potionTypes = (Potion[])f.get(null);
     	final Potion[] newPotionTypes = new Potion[256];
     	System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
     	f.set(null, newPotionTypes);
     	}
     	}
     	catch (Exception e) {
     	System.err.println("Severe error, please report this to the mod author:");
     	System.err.println(e);
     	}
     	}

     	MinecraftForge.EVENT_BUS.register(new Potioneventhandlers());
     	
 	    //------------------------------------------register bones here ------------------------------------------------//
 	    
     	/*   item= new item(item);
 	    GameRegistry.registerItem(item, "item"); */
     	
 	    //-----------------------------------------------------------------------------------------------------------------------------//
 	    
 	    
 	 
 	   
 	    
 	    Brewingstand = new fr.toss.FF7.items.Brewingstand(BrewingstandID);
  	    GameRegistry.registerBlock(Brewingstand, "Brewingstand");
  	    FFanvil = new fr.toss.FF7.items.FFanvil(FFanvilID);
 	    GameRegistry.registerBlock(FFanvil, "FFanvil");
 	    Bush1 = new fr.toss.FF7.items.Bush1(Bush1ID);
 	    GameRegistry.registerBlock(Bush1, "Bush1");
 	    Bookcase = new fr.toss.FF7.items.Bookcase(BookcaseID);
  	    GameRegistry.registerBlock(Bookcase, "Bookcase");
  	    Cauldron = new fr.toss.FF7.items. Cauldron( CauldronID);
 	    GameRegistry.registerBlock( Cauldron, " Cauldron");
  	    
 	    Chest1 = new fr.toss.FF7.items.Chest1( Chest1ID);
 	    GameRegistry.registerBlock( Chest1, " Chest1");
 	    Chest2 = new fr.toss.FF7.items.Chest2( Chest2ID);
 	    GameRegistry.registerBlock( Chest2, " Chest2");
 	    Chest3 = new fr.toss.FF7.items.Chest3( Chest3ID);
 	    GameRegistry.registerBlock( Chest3, " Chest3");
 	    Chest4 = new fr.toss.FF7.items.Chest4( Chest4ID);
 	    GameRegistry.registerBlock( Chest4, " Chest4");
 	    Chest5 = new fr.toss.FF7.items.Chest5( Chest5ID);
 	    GameRegistry.registerBlock( Chest5, " Chest5");
 	    Chest6 = new fr.toss.FF7.items.Chest6( Chest6ID);
 	    GameRegistry.registerBlock( Chest6, " Chest6");
 	    Chest7 = new fr.toss.FF7.items.Chest7( Chest7ID);
 	    GameRegistry.registerBlock( Chest7, " Chest7");
 	    Chest8 = new fr.toss.FF7.items.Chest8( Chest8ID);
 	    GameRegistry.registerBlock( Chest8, " Chest8");
 	    
 	    Helicopter = new Helicopter(HelicopterID);
 	    GameRegistry.registerBlock(Helicopter, "Helicopter");
  	   
 	    
 	    rustycrate = new fr.toss.FF7.items.rustycrate(rustycrateID);
  	    GameRegistry.registerBlock(rustycrate, "rustycrate");
  	    
 	   
 	    int modEntityID = 0;
 	   
 	   EntityRegistry.registerModEntity(EntityEnergyBall.class, "Energyball", ++modEntityID, this, 64, 10, false);
 	   EntityRegistry.registerModEntity(Entityairrender.class, "airrender", ++modEntityID, this, 64, 10, false);

 	   
 	    
 	    
 	    
 	    ItemRegistry.init();
 		
 		   BlockRegistry1.init();
 		   ArmorRegistry.init();
 		   ItemRegistry1.init();
 	    	 reciperegister.init();
 	    	 proxy.registerRenderers();

    	
    	
    	Packets.initialize();
    }
       
    @EventHandler
    public void 		init(FMLInitializationEvent event)
    {
    	instance = this;
    	Dungeon.init();
    	proxy.load();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    	
    	
    	List<IRecipe> recipies = CraftingManager.getInstance().getRecipeList();
    	
		Iterator<IRecipe> remover = recipies.iterator();
		
		while (remover.hasNext())
		{
			ItemStack itemstack = remover.next().getRecipeOutput();
			
			if(itemstack != null && itemstack.getItem() == Items.brewing_stand)
			{
				remover.remove();
			}
		}
			
			
		}
    
    
    
	@EventHandler
    public void 		serverLoad(FMLServerStartingEvent event)
    {
		  event.registerServerCommand(new Command());
		    MinecraftForge.EVENT_BUS.register(new ForgeEventHooksHandler());
    	CommandLoader.load(event);
    }
   
    
    /** Retournes le joueur coté Client */
    @SideOnly(Side.CLIENT)
    public static ClientPlayerBaseMagic getPlayerClient()
    {
    	EntityPlayer player;
    	
    	player = Minecraft.getMinecraft().thePlayer;
    	if (player instanceof EntityPlayerSP)
    		return (ClientPlayerBaseMagic) (((IClientPlayerAPI)player).getClientPlayerBase("Magic Crusade"));
    	return (null);
    }
    
    
    /** Retournes le joueur coté Server */
    public static ServerPlayerBaseMagic getPlayerServer(EntityPlayer player)
    {
    	if (player instanceof EntityPlayerMP)
    		return (ServerPlayerBaseMagic) (((IServerPlayerAPI)player).getServerPlayerBase("Magic Crusade"));
    	return (null);
    }
    
    /** Retournes l'instance du mod */
    public static Main 		instance() 
	{
		return instance;
	}

    /** Retournes vrai si le mod est chargé */
	public static boolean 	isModLoadded(String mod)
	{
	    return (Loader.isModLoaded(mod));
	}
	
	/** retournes le donjon correspondant à l'id*/
	public static Dungeon	get_dungeon(int id)
	{
		for (Dungeon d : DUNGEONS)
		{
			if (id == d.DIM_ID)
				return (d);
		}
		return (null);
	}
	
	public static void		log(String str)
	{
		java.util.Date date;
		
		date = new java.util.Date();
		System.out.println("[" + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() + "]" + " [Magic Crusade]: " + str);
	}
}
