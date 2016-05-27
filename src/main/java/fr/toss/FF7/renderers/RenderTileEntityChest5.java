package fr.toss.FF7.renderers;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import fr.toss.FF7.Tileentities.TileEntityChest5;
import fr.toss.common.Main;

public class RenderTileEntityChest5 extends TileEntitySpecialRenderer {

	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderTileEntityChest5(){
        texture = new ResourceLocation(Main.MODID, "models/chest5.png");
        objModelLocation = new ResourceLocation(Main.MODID, "models/chest5.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
}
	
	@Override
    public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
TileEntityChest5 te2 = (TileEntityChest5) te;





bindTexture(texture);

GL11.glPushMatrix();
GL11.glTranslated(posX + 0.5, posY + 0.0,  posZ + 0.5);
model.renderAll();
GL11.glPopMatrix();
}


}
