package fr.toss.FF7.items;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import fr.toss.FF7.Tileentities.TileEntityBookcase;



public class Bookcase extends BlockContainer{

    public Bookcase(int par1)  {
        super(Material.wood);
        setCreativeTab(CreativeTabs.tabDecorations);
        this.setBlockName("Bookcase");
        this.setBlockBounds(0, 0, 0, 2, 3.5f, 1);
     
    }
    
 



@Override
    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
    	 this.setBlockBounds(0, 0, 0, 2, 3.5f, 1);
    	
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    
    
   
    }
public void setBlockBoundsBasedOnState (IBlockAccess p_149719_1_, int meta , int p_149719_3_, int p_149719_4_){
    //System.out.println("Block bounds meta="+Meta);
    //                     x  y  z   x    y    z
    //this.setBlockBounds(0F,0F,0F,1.0F,1.0F,1.0F); //full block
    if (meta==2){this.setBlockBounds(0F,0F,0F, 1.0F,0.5F,1.0F);}
    if (meta==3){this.setBlockBounds(0F,0.5F,0F, 1.0F,1.0F,1.0F);}
    
    if (meta==4){this.setBlockBounds(0F,0F,0.5F, 1.0F,1.0F,1.0F);}
    if (meta==5){this.setBlockBounds(0F,0F,0F, 1.0F,1.0F,0.5F);}}
  
  
    @Override
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 2f, 3.5f, 1);
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
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack itemStack)
    {
        int facing = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        int newFacing = 0;
        if (facing == 0)
        {
        	newFacing = 2;
        }
        if (facing == 1)
        {
        	newFacing = 5;
        }
        if (facing == 2)
        {
        	newFacing = 3;
        }
        if (facing == 3)
        {
        	newFacing = 4;
        }
        TileEntity te = world.getTileEntity(i, j, k);
        if (te != null && te instanceof TileEntityBookcase)
        {
        	TileEntityBookcase tet = (TileEntityBookcase) te;
            tet.setFacingDirection(newFacing);
            world.markBlockForUpdate(i, j, k);
        }
    }

    
    public void onBlockAdded(World world, int x, int y, int z){
    	if(!world.isRemote){
    //	world.setBlock(x, y + 2, z, SecretRooms.solidAir);
    	//world.setBlock(x+1, y , z , SecretRooms.solidAir);
    //	world.setBlock(x+1, y + 1, z, SecretRooms.solidAir);
    //	world.setBlock(x+1, y + 2, z , SecretRooms.solidAir);
    	
    	
    }
    }
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityBookcase();
        
        
        
    }
}
