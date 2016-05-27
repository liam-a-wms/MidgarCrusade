package fr.toss.FF7;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;

/**
 * ArrowLooseEvent is fired when a player stops using a bow.<br>
 * This event is fired whenever a player stops using a bow in
 * ItemBow#onPlayerStoppedUsing(ItemStack, World, EntityPlayer, int).<br>
 * <br>
 * {@link #bow} contains the ItemBow ItemStack that was used in this event.<br>
 * {@link #charge} contains the value for how much the player had charged before stopping the shot.<br>
 * <br>
 * This event is {@link Cancelable}.<br>
 * If this event is canceled, the player does not stop using the bow.<br>
 * <br>
 * This event does not have a result. {@link HasResult}<br>
 * <br>
 * This event is fired on the {@link MinecraftForge#EVENT_BUS}.
 **/
@cpw.mods.fml.common.eventhandler.Cancelable
public class BulletLooseEvent extends PlayerEvent
{
    public final ItemStack gun;
    public int charge;
    
    public BulletLooseEvent(EntityPlayer player, ItemStack gun, int charge)
    {
        super(player);
        this.gun = gun;
        this.charge = charge;
    }
}