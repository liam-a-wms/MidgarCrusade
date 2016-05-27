package fr.toss.FF7.renderers;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import fr.toss.FF7.Tileentities.TileEntityrustycrate;
import fr.toss.common.Main;

public class RenderTileEntityrustycrate extends TileEntitySpecialRenderer {

	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderTileEntityrustycrate(){
        texture = new ResourceLocation(Main.MODID, "models/rustycrate.png");
        objModelLocation = new ResourceLocation(Main.MODID, "models/rustycrate.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
	}
	
	@Override
    public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
		TileEntityrustycrate te2 = (TileEntityrustycrate) te;





bindTexture(texture);

GL11.glPushMatrix();
GL11.glTranslated(posX + 0.5, posY + 0,  posZ + 0.5);
model.renderAll();
GL11.glPopMatrix();
}


}
