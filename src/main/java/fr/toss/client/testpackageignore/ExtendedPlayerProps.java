package fr.toss.client.testpackageignore;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayerProps
  implements IExtendedEntityProperties
{
  public static final String identifier = "resurrection_properties";
  public static boolean isGhost;
  
  public void saveNBTData(NBTTagCompound compound)
  {
    compound.setBoolean("isGhost", isGhost);
  }
  
  public void loadNBTData(NBTTagCompound compound)
  {
    isGhost = compound.getBoolean("isGhost");
  }
  
  public void init(Entity entity, World world)
  {
    isGhost = false;
  }
  
  public static boolean getGhostMode()
  {
    return isGhost;
  }
  
  public static void setGhostMode(boolean b)
  {
    isGhost = b;
  }
}
