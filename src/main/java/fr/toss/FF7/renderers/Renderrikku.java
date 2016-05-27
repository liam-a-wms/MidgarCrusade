package fr.toss.FF7.renderers;
 
 import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import fr.toss.FF7.ItemRegistry1;
import fr.toss.FF7Weapons.Charbow;
 
 public class Renderrikku implements IItemRenderer
 {
   private IModelCustom CharbowModel;
   private ResourceLocation CharbowTexture;
   
   public Renderrikku()
   {
/* 23 */     this.CharbowModel = AdvancedModelLoader.loadModel(new ResourceLocation("FF7:models/rikku.obj"));
/* 24 */     this.CharbowTexture = new ResourceLocation("FF7:models/rikku.png");
   }
   
   public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type)
   {
/* 29 */     return true;
   }
   
   public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper)
   {
/* 34 */     return false;
   }
   
   public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data)
   {
/* 39 */     if ((type == IItemRenderer.ItemRenderType.EQUIPPED) || (type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON)) {
/* 40 */       if (item.getItem() == ItemRegistry1.Charbow) {
/* 41 */         Charbow i = (Charbow)item.getItem();
/* 42 */         if (i.idle) {
/* 43 */           GL11.glPushMatrix();
/* 44 */           GL11.glScalef(1.3F, 1.3F, 1.3F);
/* 45 */           GL11.glTranslatef(0.6F, 0.2F, 0.0F);
/* 46 */           GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 47 */           GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/* 48 */           GL11.glRotatef(-240.0F, 1.0F, 0.0F, 0.0F);
/* 49 */           Minecraft.getMinecraft().renderEngine.bindTexture(this.CharbowTexture);
/* 50 */           this.CharbowModel.renderAll();
/* 51 */           GL11.glPopMatrix();
         } else {
/* 53 */           GL11.glPushMatrix();
/* 54 */           GL11.glScalef(1.3F, 1.3F, 1.3F);
/* 55 */           GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 56 */           GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/* 57 */           GL11.glRotatef(-40.0F, 1.0F, 0.0F, 0.0F);
/* 58 */           GL11.glTranslatef(0.0F, -0.55F, -0.2F);
/* 59 */           Minecraft.getMinecraft().renderEngine.bindTexture(this.CharbowTexture);
/* 60 */           this.CharbowModel.renderAll();
/* 61 */           GL11.glPopMatrix();
         }
       }
     }
/* 65 */     else if (type == IItemRenderer.ItemRenderType.ENTITY) {
/* 66 */       GL11.glPushMatrix();
/* 67 */       GL11.glScalef(3.0F, 3.0F, 3.0F);
/* 68 */       GL11.glTranslatef(0.0F, 1.3F, 0.0F);
/* 69 */       GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 70 */       Minecraft.getMinecraft().renderEngine.bindTexture(this.CharbowTexture);
/* 71 */       this.CharbowModel.renderAll();
/* 72 */       GL11.glPopMatrix();
/* 73 */     } else if (type == IItemRenderer.ItemRenderType.INVENTORY) {
/* 74 */       GL11.glPushMatrix();
/* 75 */       GL11.glRotatef(-60.0F, -1.0F, 1.0F, 0.0F);
/* 76 */       GL11.glTranslatef(27.0F, 27.0F, 0.0F);
/* 77 */       GL11.glScalef(14.0F, 14.0F, 14.0F);
/* 78 */       Minecraft.getMinecraft().renderEngine.bindTexture(this.CharbowTexture);
/* 79 */       this.CharbowModel.renderAll();
/* 80 */       GL11.glPopMatrix();
     } else {
/* 82 */       GL11.glPushMatrix();
/* 83 */       GL11.glRotatef(-60.0F, -1.0F, 1.0F, 0.0F);
/* 84 */       GL11.glTranslatef(20.0F, 20.0F, 0.0F);
/* 85 */       GL11.glScalef(14.0F, 14.0F, 14.0F);
/* 86 */       Minecraft.getMinecraft().renderEngine.bindTexture(this.CharbowTexture);
/* 87 */       this.CharbowModel.renderAll();
/* 88 */       GL11.glPopMatrix();
     }
   }
 }


