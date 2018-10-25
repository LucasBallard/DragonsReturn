package com.drb.dragonsreturn.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class BlockOreTin extends BlockBase {
	
	public BlockOreTin(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	
//	Use for ores like diamond
//	@Override
//	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
//		return ModItems.COPPER_INGOT;
//	}

//	Use for number of item dropped. Just return #; if you want exactly that number
//	@Override
//	public int quantityDropped(Random rand) {
//		int max = 4;
//		int min = 1;
//		
//		return rand.nextInt(max) + min;
//		
//	}
	
}
