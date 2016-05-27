package fr.toss.FF7;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class BlockRegistry1 {

	
	
	
	
	public static List<Block> blocks = new ArrayList<Block>();
	
	    public static Block mazelightoff;
	    public static Block mazelighton = new fr.toss.FF7.Blocks.mazelightoff(true).setBlockTextureName("FF7" + "mazelighton");
	    public static Block subwaytile1;
	    public static Block subwaytile2;
	    public static Block subwaytile3;
	    public static Block subwaytile4;
	    public static Block subwaytile5;
	    public static Block subwaytile6;
	    public static Block cautionblock;
	    public static Block subwaybrickmossy;
	    public static Block subwaybrickcarved;
	    public static Block subwaybrickcracked;
	    public static Block subwaybrick;
	    public static Block ventshaft1;
	    public static Block subwayvent;
	    public static Block subwaylampon  = new fr.toss.FF7.Blocks.subwaylampoff(true).setBlockTextureName("MODID" + "subway lamp on");
	    public static Block subwaylampoff;
	    public static Block subwaywalltile1;
	    public static Block subwaywalltile2;
	    public static Block subwaywalltile3;
	    public static Block subwaywalltile4;
	    public static Block subwaywalltile5;
	    public static Block subwaywalltile6;
	    public static Block darklab1;
	    public static Block darklab2;
	    public static Block darklab3;
	    public static Block darklab4;
	    public static Block darklab5;
	    public static Block darklab6;
	    public static Block darklab7;
	    public static Block darklab8;
	    public static Block darklab9;
	    public static Block darklab10;
	    public static Block darklab11;
	    public static Block darklab12;
	    public static Block darklab13;
	    public static Block darklab14;
	    public static Block darklab15;
	    public static Block darklab16;
	    public static Block darklab17;
	    public static Block darklab18;
	    public static Block darklab19;
	    public static Block darklab20;
	    public static Block darklab21;
	    public static Block darklab22;
	    public static Block darklab22on  = new fr.toss.FF7.Blocks.darklab22(true).setBlockTextureName("FF7" + "darklab22on");
	    public static Block darklab23;
	    public static Block darklab24;
	    public static Block darklab25;
	    public static Block darklab26;
	    public static Block darklab27;
	    public static Block darklab28;
	    public static Block darklab29;
	    public static Block darklab30;
	    public static Block darklab31;
	    public static Block darklab32;
	    public static Block darklab33;
	    public static Block darklab34;
	    public static Block whitelab1;
	    public static Block whitelab2;
	    public static Block whitelab3;
	    public static Block whitelab4;
	    public static Block whitelab5;
	    public static Block whitelab6;
	    public static Block whitelab7;
	    public static Block whitelab7on  = new fr.toss.FF7.Blocks.whitelab7(true).setBlockTextureName("FF7" + "whitelab7on");
	    public static Block whitelab8;
	    public static Block whitelab9;
	    public static Block whitelab10;
	    public static Block whitelab11;
	    public static Block whitelab12;
	    public static Block random1;
	    public static Block random2;
	    public static Block random3;
	    public static Block random4;
	    public static Block random5;
	    public static Block random6;
	    public static Block random7;
	    public static Block random8;
	    public static Block random9;
	    public static Block random10;
	    public static Block random11;
	    public static Block random12;
	    public static Block random13;
	    public static Block random14;
	    public static Block random15;
	    public static Block random16;
	    public static Block random17;
	    public static Block random18;
	    public static Block random19;
	    public static Block random20;
	    public static Block random21;
	    public static Block random22;
	    public static Block random23;
	    public static Block random24;
	    public static Block random25;
	    public static Block random26;
	    public static Block random27;
	    public static Block random28;
	    public static Block random29;
	    public static Block random30;
	    public static Block random31;
	    public static Block random32;
	    public static Block random33;
	    public static Block random34;
	    public static Block random35;
	    public static Block random36;
	    public static Block random37;
	    public static Block chiseledquartz;

	public static void init() {
		
	subwaytile1 = new fr.toss.FF7.Blocks.subwaytile1(Material.rock).setBlockName("subwaytile1");
 	subwaytile2 = new fr.toss.FF7.Blocks.subwaytile2(Material.rock).setBlockName("subwaytile2");
 	subwaytile3 = new fr.toss.FF7.Blocks.subwaytile3(Material.rock).setBlockName("subwaytile3"); 
 	subwaytile4 = new fr.toss.FF7.Blocks.subwaytile4(Material.rock).setBlockName("subwaytile4");
 	cautionblock = new fr.toss.FF7.Blocks.cautionblock(Material.rock).setBlockName("cautionblock");
 	subwaybrick = new fr.toss.FF7.Blocks.subwaybrick(Material.rock).setBlockName("subwaybrick");
 	subwaybrickcarved = new fr.toss.FF7.Blocks.subwaybrickcarved(Material.rock).setBlockName("subwaybrickcarved");
 	subwaybrickcracked = new fr.toss.FF7.Blocks.subwaybrickcracked(Material.rock).setBlockName("subwaybrickcracked"); 
 	subwaybrickmossy = new fr.toss.FF7.Blocks.subwaybrickmossy(Material.rock).setBlockName("subwaybrickmossy");
 	subwaylampoff  = new fr.toss.FF7.Blocks.subwaylampoff(false).setCreativeTab(ItemRegistry1.FF7Blocks).setBlockName("subway lamp off");
 	subwaylampon  = new fr.toss.FF7.Blocks.subwaylampoff(true).setCreativeTab(ItemRegistry1.FF7Blocks).setBlockName("subway lamp on");
 	subwaywalltile1 = new fr.toss.FF7.Blocks.subwaywalltile1(Material.rock).setBlockName("subwaywalltile1");
 	subwaywalltile2 = new fr.toss.FF7.Blocks.subwaywalltile2(Material.rock).setBlockName("subwaywalltile2");
 	subwaywalltile3 = new fr.toss.FF7.Blocks.subwaywalltile3(Material.rock).setBlockName("subwaywalltile3");
 	subwaywalltile4 = new fr.toss.FF7.Blocks.subwaywalltile4(Material.rock).setBlockName("subwaywalltile4");
 	subwaywalltile5 = new fr.toss.FF7.Blocks.subwaywalltile5(Material.rock).setBlockName("subwaywalltile5");
 	subwaywalltile6 = new fr.toss.FF7.Blocks.subwaywalltile6(Material.rock).setBlockName("subwaywalltile6");
 	
 	ventshaft1 = new fr.toss.FF7.Blocks.ventshaft1(Material.iron).setBlockName("ventshaft1");
 	subwayvent = new fr.toss.FF7.Blocks.subwayvent(Material.rock).setBlockName("subwayvent");
 	
 	darklab1 = new fr.toss.FF7.Blocks.darklab1(Material.rock).setBlockName("darklab1");
 	darklab2 = new fr.toss.FF7.Blocks.darklab2(Material.rock).setBlockName("darklab2");
 	darklab3 = new fr.toss.FF7.Blocks.darklab3(Material.rock).setBlockName("darklab3");
 	darklab4 = new fr.toss.FF7.Blocks.darklab4(Material.rock).setBlockName("darklab4");
 	darklab5 = new fr.toss.FF7.Blocks.darklab5(Material.rock).setBlockName("darklab5");
 	darklab6 = new fr.toss.FF7.Blocks.darklab6(Material.rock).setBlockName("darklab6");
 	darklab7 = new fr.toss.FF7.Blocks.darklab7(Material.rock).setBlockName("darklab7");
    darklab8 = new fr.toss.FF7.Blocks.darklab8(Material.rock).setBlockName("darklab8");
 	darklab9 = new fr.toss.FF7.Blocks.darklab9(Material.rock).setBlockName("darklab9");
 	darklab10 = new fr.toss.FF7.Blocks.darklab10(Material.rock).setBlockName("darklab10");
 	darklab11 = new fr.toss.FF7.Blocks.darklab11(Material.rock).setBlockName("darklab11");
 	darklab12 = new fr.toss.FF7.Blocks.darklab12(Material.rock).setBlockName("darklab12");
 	darklab13 = new fr.toss.FF7.Blocks.darklab13(Material.rock).setBlockName("darklab13");
 	darklab14 = new fr.toss.FF7.Blocks.darklab14(Material.rock).setBlockName("darklab14");
 	darklab15 = new fr.toss.FF7.Blocks.darklab15(Material.rock).setBlockName("darklab15");
 	darklab16 = new fr.toss.FF7.Blocks.darklab16(Material.rock).setBlockName("darklab16");
 	darklab17 = new fr.toss.FF7.Blocks.darklab17(Material.rock).setBlockName("darklab17");
 	darklab18 = new fr.toss.FF7.Blocks.darklab18(Material.rock).setBlockName("darklab18");
 	darklab19 = new fr.toss.FF7.Blocks.darklab19(Material.rock).setBlockName("darklab19");
 	darklab20 = new fr.toss.FF7.Blocks.darklab20(Material.rock).setBlockName("darklab20");
 	darklab21 = new fr.toss.FF7.Blocks.darklab21(Material.rock).setBlockName("darklab21");
 	darklab22  = new fr.toss.FF7.Blocks.darklab22(false).setCreativeTab(ItemRegistry1.FF7Blocks).setBlockName("darklab22");
 	darklab22on  = new fr.toss.FF7.Blocks.darklab22(true).setCreativeTab(ItemRegistry1.FF7Blocks).setBlockName("darklab22on");
 	darklab23 = new fr.toss.FF7.Blocks.darklab23(Material.rock).setBlockName("darklab23");
 	darklab24 = new fr.toss.FF7.Blocks.darklab24(Material.rock).setBlockName("darklab24");
 	darklab25 = new fr.toss.FF7.Blocks.darklab25(Material.rock).setBlockName("darklab25");
 	darklab26 = new fr.toss.FF7.Blocks.darklab26(Material.rock).setBlockName("darklab26");
 	darklab27 = new fr.toss.FF7.Blocks.darklab27(Material.rock).setBlockName("darklab27");
 	darklab28 = new fr.toss.FF7.Blocks.darklab28(Material.rock).setBlockName("darklab28");
 	 darklab29 = new fr.toss.FF7.Blocks.darklab29(Material.rock).setBlockName("darklab29");
 	darklab30 = new fr.toss.FF7.Blocks.darklab30(Material.rock).setBlockName("darklab30");
 	darklab31 = new fr.toss.FF7.Blocks.darklab31(Material.rock).setBlockName("darklab31");
 	darklab32 = new fr.toss.FF7.Blocks.darklab32(Material.rock).setBlockName("darklab32");
 	darklab33 = new fr.toss.FF7.Blocks.darklab33(Material.rock).setBlockName("darklab33");
 	darklab34 = new fr.toss.FF7.Blocks.darklab34(Material.rock).setBlockName("darklab34");
	    
 	whitelab1 = new fr.toss.FF7.Blocks.whitelab1(Material.rock).setBlockName("whitelab1");
 	whitelab2 = new fr.toss.FF7.Blocks.whitelab2(Material.rock).setBlockName("whitelab2");
 	whitelab3 = new fr.toss.FF7.Blocks.whitelab3(Material.rock).setBlockName("whitelab3");
 	whitelab4 = new fr.toss.FF7.Blocks.whitelab4(Material.rock).setBlockName("whitelab4");
 	whitelab5 = new fr.toss.FF7.Blocks.whitelab5(Material.rock).setBlockName("whitelab5");
 	whitelab6 = new fr.toss.FF7.Blocks.whitelab6(Material.rock).setBlockName("whitelab6");
 	whitelab7  = new fr.toss.FF7.Blocks.whitelab7(false).setCreativeTab(ItemRegistry1.FF7Blocks).setBlockName("whitelab7");
 	whitelab7on  = new fr.toss.FF7.Blocks.whitelab7(true).setCreativeTab(ItemRegistry1.FF7Blocks).setBlockName("whitelab7on");
 	whitelab8 = new fr.toss.FF7.Blocks.whitelab8(Material.rock).setBlockName("whitelab8");
 	whitelab9 = new fr.toss.FF7.Blocks.whitelab9(Material.rock).setBlockName("whitelab9");
 	whitelab10 = new fr.toss.FF7.Blocks.whitelab10(Material.rock).setBlockName("whitelab10");
 	whitelab11 = new fr.toss.FF7.Blocks.whitelab11(Material.rock).setBlockName("whitelab11");
 	whitelab12 = new fr.toss.FF7.Blocks.whitelab12(Material.rock).setBlockName("whitelab12");
	        
 	random1 = new fr.toss.FF7.Blocks.random1(Material.rock).setBlockName("random1");
 	random2 = new fr.toss.FF7.Blocks.random2(Material.rock).setBlockName("random2");
 	random3 = new fr.toss.FF7.Blocks.random3(Material.rock).setBlockName("random3");
	random4 = new fr.toss.FF7.Blocks.random4(Material.rock).setBlockName("random4");
	random5 = new fr.toss.FF7.Blocks.random5(Material.rock).setBlockName("random5");
	random6 = new fr.toss.FF7.Blocks.random6(Material.rock).setBlockName("random6");
	random7 = new fr.toss.FF7.Blocks.random7(Material.rock).setBlockName("random7");
	random8 = new fr.toss.FF7.Blocks.random8(Material.rock).setBlockName("random8");
	random9 = new fr.toss.FF7.Blocks.random9(Material.rock).setBlockName("random9");
	random10 = new fr.toss.FF7.Blocks.random10(Material.rock).setBlockName("random10");
	random11 = new fr.toss.FF7.Blocks.random11(Material.rock).setBlockName("random11");
	random12 = new fr.toss.FF7.Blocks.random12(Material.rock).setBlockName("random12");
	random13 = new fr.toss.FF7.Blocks.random13(Material.rock).setBlockName("random13");
	random14 = new fr.toss.FF7.Blocks.random14(Material.rock).setBlockName("random14");
	random15 = new fr.toss.FF7.Blocks.random15(Material.rock).setBlockName("random15");
	random16 = new fr.toss.FF7.Blocks.random16(Material.rock).setBlockName("random16");
	random17 = new fr.toss.FF7.Blocks.random17(Material.rock).setBlockName("random17");
	random18 = new fr.toss.FF7.Blocks.random18(Material.rock).setBlockName("random18");
	random19 = new fr.toss.FF7.Blocks.random19(Material.rock).setBlockName("random19");
	random20 = new fr.toss.FF7.Blocks.random20(Material.rock).setBlockName("random20");
	random21 = new fr.toss.FF7.Blocks.random21(Material.rock).setBlockName("random21");
	random22 = new fr.toss.FF7.Blocks.random22(Material.rock).setBlockName("random22");
	random23 = new fr.toss.FF7.Blocks.random23(Material.rock).setBlockName("random23");
	random24 = new fr.toss.FF7.Blocks.random24(Material.rock).setBlockName("random24");
	 random25 = new fr.toss.FF7.Blocks.random25(Material.rock).setBlockName("random25");
	 random26 = new fr.toss.FF7.Blocks.random26(Material.rock).setBlockName("random26");
	 random27 = new fr.toss.FF7.Blocks.random27(Material.rock).setBlockName("random27");
	 random28 = new fr.toss.FF7.Blocks.random28(Material.rock).setBlockName("random28");
	 random29 = new fr.toss.FF7.Blocks.random29(Material.rock).setBlockName("random29");
	 random30 = new fr.toss.FF7.Blocks.random30(Material.rock).setBlockName("random30");
	 random31 = new fr.toss.FF7.Blocks.random31(Material.rock).setBlockName("random31");
	 random32 = new fr.toss.FF7.Blocks.random32(Material.rock).setBlockName("random32");
	 random33 = new fr.toss.FF7.Blocks.random33(Material.rock).setBlockName("random33");
	 random34 = new fr.toss.FF7.Blocks.random34(Material.rock).setBlockName("random34");
	 random35 = new fr.toss.FF7.Blocks.random35(Material.rock).setBlockName("random35");
	 random36 = new fr.toss.FF7.Blocks.random36(Material.rock).setBlockName("random36");
	 random37 = new fr.toss.FF7.Blocks.random37(Material.rock).setBlockName("random37");
	    
	 chiseledquartz = new fr.toss.FF7.Blocks.chiseledquartz(Material.rock).setBlockName("chiseledquartz");
 	    
	 mazelightoff  = new fr.toss.FF7.Blocks.mazelightoff(false).setCreativeTab(ItemRegistry1.FF7Blocks).setBlockName("mazelightoff");
	 mazelighton  = new fr.toss.FF7.Blocks.mazelightoff(true).setCreativeTab(ItemRegistry1.FF7Blocks).setBlockName("mazelighton");
	 	
	
	 		
	 
	
	 
	 
	 GameRegistry.registerBlock(chiseledquartz, "chiseledquartz");
	 
	    GameRegistry.registerBlock(mazelightoff, "mazelightoff");
	    GameRegistry.registerBlock(mazelighton, "mazelighton");
 	  
 	    GameRegistry.registerBlock(subwaytile1, "subwaytile1");
 	    GameRegistry.registerBlock(subwaytile2, "subwaytile2");
 	    GameRegistry.registerBlock(subwaytile3, "subwaytile3");
	    GameRegistry.registerBlock(subwaytile4, "subwaytile4");
	    GameRegistry.registerBlock(cautionblock, "cautionblock");
	    GameRegistry.registerBlock(subwaybrick, "subwaybrick");
	    GameRegistry.registerBlock(subwaybrickcarved, "subwaybrickcarved");
	    GameRegistry.registerBlock(subwaybrickcracked, "subwaybrickcracked");
	    GameRegistry.registerBlock(subwaybrickmossy, "subwaybrickmossy");
	    GameRegistry.registerBlock(subwaylampoff, "subway lamp off");
	    GameRegistry.registerBlock(subwaylampon, "subway lamp on");
	    GameRegistry.registerBlock(subwaywalltile1, "subwaywalltile1");
	    GameRegistry.registerBlock(subwaywalltile2, "subwaywalltile2");
	    GameRegistry.registerBlock(subwaywalltile3, "subwaywalltile3");
	    GameRegistry.registerBlock(subwaywalltile4, "subwaywalltile4");
	    GameRegistry.registerBlock(subwaywalltile5, "subwaywalltile5");
	    GameRegistry.registerBlock(subwaywalltile6, "subwaywalltile6");
	    
	    GameRegistry.registerBlock(ventshaft1, "ventshaft1");
	    GameRegistry.registerBlock(subwayvent, "subwayvent");
	    
	    GameRegistry.registerBlock(darklab1, "darklab1");
	    GameRegistry.registerBlock(darklab2, "darklab2");
	    GameRegistry.registerBlock(darklab3, "darklab3");
	    GameRegistry.registerBlock(darklab4, "darklab4");
	    GameRegistry.registerBlock(darklab5, "darklab5");
	    GameRegistry.registerBlock(darklab6, "darklab6");
	    GameRegistry.registerBlock(darklab7, "darklab7");
	    GameRegistry.registerBlock(darklab8, "darklab8");
	    GameRegistry.registerBlock(darklab9, "darklab9");
	    GameRegistry.registerBlock(darklab10, "darklab10");
	    GameRegistry.registerBlock(darklab11, "darklab11");
	    GameRegistry.registerBlock(darklab12, "darklab12");
	    GameRegistry.registerBlock(darklab13, "darklab13");
	    GameRegistry.registerBlock(darklab14, "darklab14");
	    GameRegistry.registerBlock(darklab15, "darklab15");
	    GameRegistry.registerBlock(darklab16, "darklab16");
	    GameRegistry.registerBlock(darklab17, "darklab17");
	    GameRegistry.registerBlock(darklab18, "darklab18");
	    GameRegistry.registerBlock(darklab19, "darklab19");
	    GameRegistry.registerBlock(darklab20, "darklab20");
	    GameRegistry.registerBlock(darklab21, "darklab21");
	    GameRegistry.registerBlock(darklab22, "darklab22");
	    GameRegistry.registerBlock(darklab22on, "darklab22on");
	    GameRegistry.registerBlock(darklab23, "darklab23");
	    GameRegistry.registerBlock(darklab24, "darklab24");
	    GameRegistry.registerBlock(darklab25, "darklab25");
	    GameRegistry.registerBlock(darklab26, "darklab26");
	    GameRegistry.registerBlock(darklab27, "darklab27");
	    GameRegistry.registerBlock(darklab28, "darklab28");
	    GameRegistry.registerBlock(darklab29, "darklab29");
	    GameRegistry.registerBlock(darklab30, "darklab30");
	    GameRegistry.registerBlock(darklab31, "darklab31");
	    GameRegistry.registerBlock(darklab32, "darklab32");
	    GameRegistry.registerBlock(darklab33, "darklab33");
	    GameRegistry.registerBlock(darklab34, "darklab34");
	    
	    GameRegistry.registerBlock(whitelab1, "whitelab1");
 	    GameRegistry.registerBlock(whitelab2, "whitelab2");
 	    GameRegistry.registerBlock(whitelab3, "whitelab3");
 	    GameRegistry.registerBlock(whitelab4, "whitelab4");
 	    GameRegistry.registerBlock(whitelab5, "whitelab5");
 	    GameRegistry.registerBlock(whitelab6, "whitelab6");
 	    GameRegistry.registerBlock(whitelab7, "whitelab7");
 	    GameRegistry.registerBlock(whitelab7on, "whitelab7on");
 	    GameRegistry.registerBlock(whitelab8, "whitelab8");
 	    GameRegistry.registerBlock(whitelab9, "whitelab9");
 	    GameRegistry.registerBlock(whitelab10, "whitelab10");
 	    GameRegistry.registerBlock(whitelab11, "whitelab11");
 	    GameRegistry.registerBlock(whitelab12, "whitelab12");
 	    
 	   GameRegistry.registerBlock(random1, "random1");
	    GameRegistry.registerBlock(random2, "random2");
	    GameRegistry.registerBlock(random3, "random3");
	    GameRegistry.registerBlock(random4, "random4");
	    GameRegistry.registerBlock(random5, "random5");
	    GameRegistry.registerBlock(random6, "random6");
	    GameRegistry.registerBlock(random7, "random7");
	    GameRegistry.registerBlock(random8, "random8");
	    GameRegistry.registerBlock(random9, "random9");
	    GameRegistry.registerBlock(random10, "random10");
	    GameRegistry.registerBlock(random11, "random11");
	    GameRegistry.registerBlock(random12, "random12");
	    GameRegistry.registerBlock(random13, "random13");
	    GameRegistry.registerBlock(random14, "random14");
	    GameRegistry.registerBlock(random15, "random15");
	    GameRegistry.registerBlock(random16, "random16");
	    GameRegistry.registerBlock(random17, "random17");
	    GameRegistry.registerBlock(random18, "random18");
	    GameRegistry.registerBlock(random19, "random19");
	    GameRegistry.registerBlock(random20, "random20");
	    GameRegistry.registerBlock(random21, "random21");
	    GameRegistry.registerBlock(random22, "random22");
	    GameRegistry.registerBlock(random23, "random23");
	    GameRegistry.registerBlock(random24, "random24");
	    GameRegistry.registerBlock(random25, "random25");
	    GameRegistry.registerBlock(random26, "random26");
	    GameRegistry.registerBlock(random27, "random27");
	    GameRegistry.registerBlock(random28, "random28");
	    GameRegistry.registerBlock(random29, "random29");
	    GameRegistry.registerBlock(random30, "random30");
	    GameRegistry.registerBlock(random31, "random31");
	    GameRegistry.registerBlock(random32, "random32");
	    GameRegistry.registerBlock(random33, "random33");
	    GameRegistry.registerBlock(random34, "random34");
	    GameRegistry.registerBlock(random35, "random35");
	    GameRegistry.registerBlock(random36, "random36");
	    GameRegistry.registerBlock(random37, "random37");
		}

	}


