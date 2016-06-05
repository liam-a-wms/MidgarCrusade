package fr.toss.common.packet;

import fr.toss.FF7.ItemRegistry1;
import fr.toss.common.Main;
import fr.toss.common.player.ServerPlayerBaseMagic;
import fr.toss.common.player.spells.ServerSpellHandler;
import fr.toss.common.player.spells.rogue.Speed_2;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketSpellToServer implements IMessage {
   
	public int spell_id;
	public int data;
	public float data2;

    public PacketSpellToServer()
    {
    	this(0, 0, 0);
    }
    
    public PacketSpellToServer(int a, int b)
    {
    	this(a, b, 0);
    }
    
    public PacketSpellToServer(int a, int b, float c)
    {
    	this.spell_id = a;
    	this.data = b;
    	this.data2 = c;
    }

	public PacketSpellToServer(int a)
	{
		this(a, 0, 0);
	}

	@Override
    public void fromBytes(ByteBuf buf)
    {
    	this.spell_id = buf.readInt();
    	this.data = buf.readInt();
    	this.data2 = buf.readFloat();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
    	buf.writeInt(this.spell_id);
    	buf.writeInt(this.data);
    	buf.writeFloat(this.data2);
    }

    public static class Handler implements IMessageHandler<PacketSpellToServer, IMessage> 
    {
		@Override
		public IMessage onMessage(PacketSpellToServer message, MessageContext ctx)
		{
			EntityPlayerMP sender;
			ServerPlayerBaseMagic pm;
			World world;
			
			sender = ctx.getServerHandler().playerEntity;
			pm = Main.getPlayerServer(sender);
			world = sender.worldObj;

			if (message.spell_id == 11)
				ServerSpellHandler.handle_shockwave(message, world, sender);
			else if (message.spell_id == 12)
				sender.addPotionEffect(new PotionEffect(Potion.resistance.id, 200, 2));
			else if (message.spell_id == 14)
				sender.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 40, 9));
			else if (message.spell_id == 13)
				ServerSpellHandler.handle_grab(message, world, sender);
			else if (message.spell_id == 15)
				ServerSpellHandler.handle_arena(message, world, sender);
			
			else if (message.spell_id == 0)
				ServerSpellHandler.handle_purification(message, world);
			else if (message.spell_id == 1)
				ServerSpellHandler.handle_heal(message, world);
			else if (message.spell_id == 2)
				ServerSpellHandler.handle_heal_zone(message, world);
			else if (message.spell_id == 3)
				ServerSpellHandler.handle_buff(message, world);
			else if (message.spell_id == 4)
				ServerSpellHandler.handle_invincible(message, world);
			else if (message.spell_id == 5)
				ServerSpellHandler.handle_holyshield(message, world);
			else if (message.spell_id == 6)
				ServerSpellHandler.handle_holyexplosion(message, world, sender);
			
			else if (message.spell_id == 30)
				ServerSpellHandler.handle_shotpoison(world, sender);
			else if (message.spell_id == 31)
				ServerSpellHandler.handle_magicshot(world, sender);
			else if (message.spell_id == 32)
				ServerSpellHandler.handle_explodeshot(world, sender);
			else if (message.spell_id == 33)
				ServerSpellHandler.handle_refinement(world, sender);
			else if (message.spell_id == 34)
				ServerSpellHandler.handle_wolfsummon(world, sender);
			else if (message.spell_id == 35)
				ServerSpellHandler.handle_frozenshot(world, sender);
			
			else if (message.spell_id == 20)
				ServerSpellHandler.handle_drain(message, world, sender);
			else if (message.spell_id == 21)
				ServerSpellHandler.handle_fireland(message, world, sender);
			else if (message.spell_id == 22)
				ServerSpellHandler.handle_witherskull(message, world, sender);
			else if (message.spell_id == 23)
				ServerSpellHandler.handle_zombiesummon(world, sender, message.data2);
			else if (message.spell_id == 24)
				ServerSpellHandler.handle_corruption(world, sender, message.data, message.data2);
			else if (message.spell_id == 25)
				ServerSpellHandler.handle_necromancy(message, world, sender);
			
			else if (message.spell_id == 40)
				ServerSpellHandler.handle_conefeu(message, world, sender);
			else if (message.spell_id == 41)
				ServerSpellHandler.handle_frozencube(message, world, sender);
			else if (message.spell_id == 42)
				ServerSpellHandler.handle_teleport(message, world, sender);
			else if (message.spell_id == 43)
				ServerSpellHandler.handle_field_destruction(message, world, sender);
			else if (message.spell_id == 44)
				ServerSpellHandler.handle_arcane_pillow(message, world, sender);
			else if (message.spell_id == 45)
				ServerSpellHandler.handle_fireball(world, sender);
			
			else if(message.spell_id == 51)
				ServerSpellHandler.handle_speed_rogue(sender);
			else if(message.spell_id == 52)
				ServerSpellHandler.handle_invisible(sender);
			else if(message.spell_id == 53)
				pm.is_poisonned = true;
			else if(message.spell_id == 54)
				ServerSpellHandler.handle_vision(sender);
			else if(message.spell_id == 55)
				ServerSpellHandler.handle_boots(sender);
			else if (message.spell_id == 56)
				ServerSpellHandler.handle_drainspeed(message, world, sender);
			else if (message.spell_id == 57)
				ServerSpellHandler.handle_berserk_zone(message, world);
			else if (message.spell_id == 58)
				ServerSpellHandler.handle_drainattack(message, world);
			else if (message.spell_id == 59)
				ServerSpellHandler.handle_selfheal(message, world);
			else if (message.spell_id == 60)
				ServerSpellHandler.handle_Cure(message, world);
			else if (message.spell_id == 61)
				ServerSpellHandler.handle_Cura(message, world);
			else if (message.spell_id == 62)
				ServerSpellHandler.handle_Curaga(message, world);
			else if (message.spell_id == 63)
				ServerSpellHandler.handle_cleanse(message, world);
			else if (message.spell_id == 64)
				ServerSpellHandler.handle_shotroot(world, sender);
			else if (message.spell_id == 65)
				ServerSpellHandler.handle_attackboost(message, world);
			else if (message.spell_id == 66)
				ServerSpellHandler.handle_shotblind(world, sender);
			else if (message.spell_id == 67)
				ServerSpellHandler.handle_lifebond(message, world, sender);
			else if (message.spell_id == 68)
				ServerSpellHandler.handle_rush(message, world, sender);
			else if (message.spell_id == 69)
				ServerSpellHandler.handle_wildswing(message, world, sender);
			else if (message.spell_id == 70)
				ServerSpellHandler.handle_airrender(world, sender);
			else if (message.spell_id == 71)
				ServerSpellHandler.handle_auroblast(world, sender);
			else if (message.spell_id == 72)
				ServerSpellHandler.handle_backdraft(world, sender);
			else if (message.spell_id == 73)
				ServerSpellHandler.handle_swordroot(world, sender);
			else if (message.spell_id == 74)
				ServerSpellHandler.handle_swordconfuse(world, sender);
			else if (message.spell_id == 75)
				ServerSpellHandler.handle_windslash(world, sender);
			else if (message.spell_id == 76)
				ServerSpellHandler.handle_swordslow(world, sender);
			else if (message.spell_id == 77)
				ServerSpellHandler.handle_swordberserk(world, sender);
			else if (message.spell_id == 78)
				ServerSpellHandler.handle_unburdensoul(message, world, sender);
			else if (message.spell_id == 79)
				ServerSpellHandler.handle_blizzard(message, world, sender);
			else if (message.spell_id == 80)
				ServerSpellHandler.handle_blizzara(message, world, sender);
			else if (message.spell_id == 81)
				ServerSpellHandler.handle_blizzaga(message, world, sender);
			else if (message.spell_id == 82)
				ServerSpellHandler.handle_thunder(message, world, sender);
			else if (message.spell_id == 83)
				ServerSpellHandler.handle_thundara(message, world, sender);
			else if (message.spell_id == 84)
				ServerSpellHandler.handle_thundaga(message, world, sender);
			else if (message.spell_id == 85)
				ServerSpellHandler.handle_fire(world, sender);
			else if (message.spell_id == 86)
				ServerSpellHandler.handle_fira(world, sender);
			else if (message.spell_id == 87)
				ServerSpellHandler.handle_firaga(world, sender);
			else if (message.spell_id == 88)
				ServerSpellHandler.handle_swordpoison(world, sender);
			else if (message.spell_id == 89)
				ServerSpellHandler.handle_swordblind(world, sender);
			else if (message.spell_id == 90)
				ServerSpellHandler.handle_quickenbuff(message, world);
			else if (message.spell_id == 91)
				ServerSpellHandler.	handle_ballconfuse(world, sender);
			else if (message.spell_id == 91)
				ServerSpellHandler.	handle_molotov(world, sender);
			else if (message.spell_id == 92)
				ServerSpellHandler.	handle_ringtoss(world, sender);
			else if (message.spell_id == 92)
				ServerSpellHandler.	handle_weapontoss(world, sender);
			else if (message.spell_id == 93)
				ServerSpellHandler.handle_nurse(message, world);
			else if (message.spell_id == 94)
				ServerSpellHandler.handle_defender(message, world);
			else if (message.spell_id == 95)
				ServerSpellHandler.handle_saintcross(message, world, sender);
			else if (message.spell_id == 96)
				ServerSpellHandler.handle_holyblade(world, sender);
			else if (message.spell_id == 97)
				ServerSpellHandler.handle_gigaflare(message, world, sender);
			else if (message.spell_id == 98)
				ServerSpellHandler.handle_bio(message, world, sender);
			else if (message.spell_id == 99)
				ServerSpellHandler.handle_scream(message, world);			
			else if (message.spell_id == 100)
				ServerSpellHandler.	handle_furore(message, world, sender);			
			else if (message.spell_id == 101)
				ServerSpellHandler.	handle_smiteofrage(message, world, sender, null);			
			else if (message.spell_id == 102)
				ServerSpellHandler.handle_chakra(message, world);
			else if (message.spell_id == 103)
				ServerSpellHandler.handle_holysign(message, world);		
			else if (message.spell_id == 104)
				sender.addPotionEffect(new PotionEffect(ItemRegistry1.customPotion.id, 200, 1000));	
			
			
			
			
			
			return (null);
		}
    }
}
