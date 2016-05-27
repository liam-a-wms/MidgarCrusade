package fr.toss.FF7.items;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import fr.toss.FF7.Tileentities.TileEntityAnvil;



public class FFanvil extends BlockContainer   {

    public FFanvil(int par1)  {
        super(Material.anvil);
        setCreativeTab(CreativeTabs.tabDecorations);
        this.setBlockName("Anvil");
       
        
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
        return new TileEntityAnvil();
   }
   
   public boolean onplayerrightclick(World World, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer EntityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
   {
       if (World.isRemote)
       {
         
       EntityPlayer.openGui(Blocks.anvil, p_149727_6_, World, p_149727_2_, p_149727_3_, p_149727_4_);
           return true;
       }
	return false ;
   
   
   }
   
   
}
