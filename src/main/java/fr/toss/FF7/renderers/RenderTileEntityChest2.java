package fr.toss.FF7.renderers;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import fr.toss.FF7.Tileentities.TileEntityChest2;
import fr.toss.common.Main;

public class RenderTileEntityChest2 extends TileEntitySpecialRenderer {

	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderTileEntityChest2(){
        texture = new ResourceLocation(Main.MODID, "models/chest2.png");
        objModelLocation = new ResourceLocation(Main.MODID, "models/chest2.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
}
	
	@Override
    public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
TileEntityChest2 te2 = (TileEntityChest2) te;





bindTexture(texture);

GL11.glPushMatrix();
GL11.glTranslated(posX + 0.5, posY + 0.0,  posZ + 0.5);
model.renderAll();
GL11.glPopMatrix();
}


}
