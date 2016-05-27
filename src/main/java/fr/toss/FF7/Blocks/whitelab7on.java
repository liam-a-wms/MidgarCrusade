package fr.toss.FF7.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import fr.toss.common.Main;

public class whitelab7on extends Block
{
    private final boolean field_150171_a;
    private static final String __OBFID = "CL_00000297";

    public whitelab7on(boolean p_i45421_1_)
    {
        super(Material.redstoneLight);
        this.field_150171_a = p_i45421_1_;
        setBlockTextureName(Main.MODID + ":" + "whitelab7on");	
       
    }
}