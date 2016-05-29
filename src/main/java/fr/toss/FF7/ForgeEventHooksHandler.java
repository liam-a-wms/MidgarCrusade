package fr.toss.FF7;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.toss.common.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingDeathEvent;


public class ForgeEventHooksHandler {

	@SubscribeEvent
	public void phoenixEffect(LivingDeathEvent lde)
	  {
	    if ((Main.allowPFeather) && ((lde.entityLiving instanceof EntityPlayer)))
	    {
	      EntityPlayer ep = (EntityPlayer)lde.entityLiving;
	      if (ep. inventory.hasItem(Main.PhoenixFeather))
	      {
	        if (!ep.worldObj.isRemote)
	        {
	          ep.inventory.consumeInventoryItem(Main.PhoenixFeather);
	          ep.setHealth(1);
	          ep.hurtResistantTime = 65;
	          ep.addPotionEffect(new PotionEffect(Potion.regeneration.id, 28, 6));
	          ep.addPotionEffect(new PotionEffect(Potion.resistance.id, 65, 4));
	          ep.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 65, 1));
	          ep.removePotionEffect(Potion.poison.id);
	          ep.removePotionEffect(Potion.wither.id);
	          ep.setFire(3);
	          ep.worldObj.playSoundAtEntity(ep, "fireworks.launch", 5.0F, 1.0F);
	          ep.worldObj.playSoundAtEntity(ep, "assets.speedboost", 0.4F, 0.3F);
	        }
	        System.out.println("Potion types capacity: " + Potion.potionTypes.length);
	        lde.setCanceled(true);
	      }
	    }
	  }
}