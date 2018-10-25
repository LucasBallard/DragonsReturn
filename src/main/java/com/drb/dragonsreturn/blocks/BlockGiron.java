package com.drb.dragonsreturn.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGiron extends BlockBase {

	public BlockGiron(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);//Same as Iron Block
		setResistance(20.0F);//10 less than Iron Block due to any higher acting as unbreakable
		setHarvestLevel("pickaxe", 2);//only requires iron pick to harvest
	}

}
