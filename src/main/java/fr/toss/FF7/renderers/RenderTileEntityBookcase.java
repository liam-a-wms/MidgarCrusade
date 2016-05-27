package fr.toss.FF7.renderers;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import fr.toss.FF7.Tileentities.TileEntityBookcase;
import fr.toss.common.Main;

public class RenderTileEntityBookcase extends TileEntitySpecialRenderer {

	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderTileEntityBookcase(){
        texture = new ResourceLocation(Main.MODID, "models/Bookcase.png");
        objModelLocation = new ResourceLocation(Main.MODID, "models/Bookcase.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
}
	
	 public void render(TileEntityBookcase te, double x, double y, double z, float scale)
	    {
	    	GL11.glPushMatrix(); 	
	        GL11.glTranslatef((float) x + 0.25F, (float) y + 0F, (float) z + 0.5F);
	        this.bindTexture(texture);
	        //Rotates model, as for some reason it is initially upside (180 = angle, 1.0F at end = about z axis)
	        GL11.glRotatef(0, 0.0F, 0.0F, 1.0F);
	        int facing = te.getFacingDirection();
	        int k = 0;
	        //South
	        if (facing == 2) {
	            k = 0;
	        }
	        //North
	        if (facing == 3) {
	            k = 180;
	        }
	        //East
	        if (facing == 4) {
	            k = -90;
	        }
	        //West
	        if (facing == 5) {
	            k = 90;
	        }
	        //Rotates model on the spot, depending on direction, making the front always to player) (k = angle, 1.0F in middle = about y axis)
	        GL11.glRotatef(k, 0.0F, 0.5F, 0.0F);
	        GL11.glDisable(GL11.GL_CULL_FACE);
	        GL11.glEnable(GL11.GL_ALPHA_TEST);
	        model.renderAll();
	        GL11.glPopMatrix();
		}

	    
	    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_)
	    {
	    	this.render((TileEntityBookcase)p_147500_1_, p_147500_2_, p_147500_4_, p_147500_6_, p_147500_8_);
	    }
	}