package fr.toss.FF7.renderers;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import fr.toss.FF7.Tileentities.TileEntityBrewstand;
import fr.toss.common.Main;

public class RenderTileEntityBrewingstand extends TileEntitySpecialRenderer {

	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderTileEntityBrewingstand(){
        texture = new ResourceLocation(Main.MODID, "models/brewstand.png");
        objModelLocation = new ResourceLocation(Main.MODID, "models/brewstand.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
}
	
	@Override
    public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
TileEntityBrewstand te2 = (TileEntityBrewstand) te;





bindTexture(texture);

GL11.glPushMatrix();
GL11.glTranslated(posX + 0.5, posY + 0,  posZ + 0.5);
model.renderAll();
GL11.glPopMatrix();
}


}
