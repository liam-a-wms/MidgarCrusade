package fr.toss.FF7.projectiles.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

//===========================================================================
// EntityThrowingAxe class
//===========================================================================
/**
 * A throwing-axe projectile.
 * 
 * @version vymdt.01.2014.09.21.0000
 * @author Ryan F. Mercer -Open source.
 */
public class EntityJavelin extends EntityThrowable {

/** Item entity represents. */
protected ItemStack item;

//===========================================================================
/**
 * Calls parent constructor.
 * 
 * @param world  Current world.
 */
public EntityJavelin(World world) {
  
  super(world);
}
//===========================================================================
/**
 * Calls parent constructor.
 * 
 * @param world             Current world.
 * @param entityLivingBase  Thrower of entity.
 */
public EntityJavelin(World world, EntityLivingBase entityLivingBase) {
  
  super(world, entityLivingBase);
}
//===========================================================================
/**
 * Calls parent constructor.
 * 
 * @param world  Current world.
 * @param x      X-axis coordinate of entity.
 * @param y      Y-axis coordinate of entity.
 * @param z      Z-axis coordinate of entity.
 */
public EntityJavelin(World world, double x, double y, double z) {
  
  super(world, x, y, z);
}
//===========================================================================
/**
 * Calls parent constructor.
 * 
 * @param world             Current world.
 * @param entityLivingBase  Thrower of entity.
 * @param stack             Item entity represents.
 */
public EntityJavelin(World world, EntityLivingBase entityLivingBase
    , ItemStack stack) {
  
  super(world, entityLivingBase);
  item = stack;
}
//===========================================================================
/**
 * Called when hits block or entity.
 * 
 * @param mop  Impact data.
 */
/*@Override
protected void onImpact(MovingObjectPosition mop) {
  
  //server.
  if(!worldObj.isRemote) {
    
    //entity hit.
    if(mop.typeOfHit == MovingObjectType.ENTITY) {
      mop.entityHit.attackEntityFrom
          ( DamageSource.causeThrownDamage(this, getThrower())
          , Javelin.throwingDamageVsEntity //damage amount.
          );
    }
    //block hit.
    else if(mop.typeOfHit == MovingObjectType.BLOCKGrass) {
      CustomEventHandler.damageBlock
          ( worldObj, mop.blockX, mop.blockY, mop.blockZ
          /*damage multiplier adjusts for delay between throws to simulate
            normal continuous break rate.*/
         // , (EntityPlayer)getThrower(), item, 10.0F //damage multiplier.
         // );
 //   }
 // }
  //remove entity.
// setDead();
@Override
protected void onImpact(MovingObjectPosition p_70184_1_) {
	// TODO Auto-generated method stub
	
}
}
//===========================================================================
//}//END class
//===========================================================================