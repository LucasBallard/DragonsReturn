package com.drb.dragonsreturn.tabs;

import com.drb.dragonsreturn.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabToolsDragons extends CreativeTabs {

	public TabToolsDragons(String label) {
		
		super("tabtoolsdragons");
		this.setBackgroundImageName("dragons.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.PICKAXE_GIRON);
	}
	
}
