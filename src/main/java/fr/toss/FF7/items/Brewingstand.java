package fr.toss.FF7.items;

import java.util.List;

import net.minecraft.block.BlockBrewingStand;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import fr.toss.FF7.Tileentities.TileEntityBrewstand;



public class Brewingstand extends BlockBrewingStand {

    public Brewingstand(int par1)  {
        super();
        setCreativeTab(CreativeTabs.tabDecorations);
        this.setBlockName("Brewingstand");
       
        
    }
    @Override
    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
    	 this.setBlockBounds(0, 0, 0, 1, 1, 1);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    }
 
    
    @Override
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1F, 1.0F);
    }
    
    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    
   
    
    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityBrewstand();
    }
}
