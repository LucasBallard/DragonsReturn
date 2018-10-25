package com.drb.dragonsreturn.tabs;

import com.drb.dragonsreturn.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabBlocksDragons extends CreativeTabs {

	public TabBlocksDragons(String label) {
		
		super("tabblocksdragons");
		this.setBackgroundImageName("dragons.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModBlocks.BLOCK_GIRON);
	}
	
}
