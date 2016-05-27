package fr.toss.FF7.renderers;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import fr.toss.FF7.Tileentities.TileEntityChest6;
import fr.toss.common.Main;

public class RenderTileEntityChest6 extends TileEntitySpecialRenderer {

	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderTileEntityChest6(){
        texture = new ResourceLocation(Main.MODID, "models/chest6.png");
        objModelLocation = new ResourceLocation(Main.MODID, "models/chest6.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
}
	
	@Override
    public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
TileEntityChest6 te2 = (TileEntityChest6) te;





bindTexture(texture);

GL11.glPushMatrix();
GL11.glTranslated(posX + 0.5, posY + 0.0,  posZ + 0.5);
model.renderAll();
GL11.glPopMatrix();
}


}
