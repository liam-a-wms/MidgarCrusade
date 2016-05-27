package fr.toss.FF7.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.BlockRegistry1;
import fr.toss.common.Main;

public class mazelightoff extends Block {
	
    private final boolean field_150171_a;
	private IIcon frontIcon;
    private static final String __OBFID = "CL_00000297";

    public mazelightoff(boolean redstonelight)
    {
        super(Material.redstoneLight);
        this.field_150171_a = redstonelight;
        setBlockTextureName(Main.MODID + ":" + "mazelightoff");
        
        if (redstonelight)
        {
        	  	
            this.setLightLevel(1.0F);
        }
        
        	  
    }

  
   
    
    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    
    public void onBlockAdded(World world, int x, int y, int z,EntityLivingBase entity)
    {
    	
    	 
    	
		
    
    	if (!world.isRemote)
         	
           	
        {
            if (this.field_150171_a && !world.isBlockIndirectlyGettingPowered(x, y, z))
            {
            	world.scheduleBlockUpdate(x, y, z, this, 4);
            }
            else if (!this.field_150171_a && world.isBlockIndirectlyGettingPowered(x, y, z))
            {
            	world.setBlock(x, y, z, BlockRegistry1.mazelighton, 0, 2);
            
        }
    	
        }
    }
    	
    	
    

    

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        if (!p_149695_1_.isRemote)
        {
            if (this.field_150171_a && !p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
            {
                p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, 4);
            }
            else if (!this.field_150171_a && p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
            {
                p_149695_1_.setBlock(p_149695_2_, p_149695_3_, p_149695_4_, BlockRegistry1.mazelighton, 0, 2);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote && this.field_150171_a && !p_149674_1_.isBlockIndirectlyGettingPowered(p_149674_2_, p_149674_3_, p_149674_4_))
        {
            p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, BlockRegistry1.mazelightoff, 0, 2);
        }
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(BlockRegistry1.mazelightoff);
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return Item.getItemFromBlock(BlockRegistry1.mazelightoff);
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int p_149644_1_)
    {
        return new ItemStack(BlockRegistry1.mazelightoff);
    }
    
    
    
}