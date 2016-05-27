package fr.toss.FF7.Blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.common.Main;

public class chiseledquartz extends FF7block {




	public  chiseledquartz(Material mat) {
		super(mat.rock);
		setBlockTextureName(Main.MODID + ":" + "chiseledquartz");
		
		
	}

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random){
		float f1 = (float)x + 0.5f;
	    float f2 = (float)y + 1.1f;
	    float f3 = (float)z + 0.5f;
	    float f4 = random.nextFloat() * 0.6f -0.3f;
	    float f5 = random.nextFloat() * -0.6f - -0.3f;
	    float f6 = (float)y + 2.1f;
	    
	    world.spawnParticle("snow", (double)(f1+f4), (double)f2 , (double)(f3+f5), 0.0D, 0.0D, 0.0D);
	   
	}
	
	
	
	
	
	
	
	
	
	void setTexture(String string) {
		// TODO Auto-generated method stub
		
	}	
}
