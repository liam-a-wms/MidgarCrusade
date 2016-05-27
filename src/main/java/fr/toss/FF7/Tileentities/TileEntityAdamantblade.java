package fr.toss.FF7.Tileentities;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBrewingStand;

public class TileEntityAdamantblade extends TileEntity {

    /* Rotation */
    public float rotation = 0;
   /* Scale */
   public float scale = 0;

   @Override
   public void updateEntity(){
       /* Increments 0.5  This can be changed */
       if (worldObj.isRemote) rotation += 0.5;
       /* Whatever you want your scale to be */
      if (worldObj.isRemote) rotation = (float) 0.5;
   }
}
	

