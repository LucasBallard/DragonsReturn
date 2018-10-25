package com.drb.dragonsreturn.tabs;

import com.drb.dragonsreturn.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMiscDragons extends CreativeTabs {

	public TabMiscDragons(String label) {
		
		super("tabmiscdragons");
		this.setBackgroundImageName("dragons.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.FUR);
	}
	
}
