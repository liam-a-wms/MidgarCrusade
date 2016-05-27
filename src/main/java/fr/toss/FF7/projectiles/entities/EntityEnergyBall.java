package fr.toss.FF7.projectiles.entities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityEnergyBall extends EntityThrowable{

	 public EntityEnergyBall(World par1World)
	  {
	    super(par1World);
	  }

	   public EntityEnergyBall(World par2World, EntityPlayer par3EntityPlayer) {
	       super(par2World, par3EntityPlayer);
	   }
	   
	   @Override
	   protected void entityInit() {

	   }

	   @Override
	   public void readEntityFromNBT(NBTTagCompound nbttagcompound) {

	   }

	   @Override
	   public void writeEntityToNBT(NBTTagCompound nbttagcompound) {

	   }

	   @Override
	   protected void onImpact(MovingObjectPosition movingobjectposition) {
	       this.setDead();
	       
	   }
}