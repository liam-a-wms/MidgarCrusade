package fr.toss.FF7;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;

/**
 * ArrowNockEvent is fired when a player begins using a bow.<br>
 * This event is fired whenever a player begins using a bow in
 * ItemBow#onItemRightClick(ItemStack, World, EntityPlayer).<br>
 * <br>
 * {@link #result} contains the resulting ItemStack due to the use of the bow. <br>
 * <br>
 * This event is {@link Cancelable}.<br>
 * If this event is canceled, the player does not begin using the bow.<br>
 * <br>
 * This event does not have a result. {@link HasResult}<br>
 * <br>
 * This event is fired on the {@link MinecraftForge#EVENT_BUS}.
 **/
@cpw.mods.fml.common.eventhandler.Cancelable
public class BulletChamberEvent extends PlayerEvent
{
    public ItemStack result;
    
    public BulletChamberEvent(EntityPlayer player, ItemStack result)
    {
        super(player);
        this.result = result;
    }
}