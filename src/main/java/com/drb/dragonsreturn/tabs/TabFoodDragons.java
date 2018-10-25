package com.drb.dragonsreturn.tabs;

import com.drb.dragonsreturn.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabFoodDragons extends CreativeTabs {

	public TabFoodDragons(String label) {
		
		super("tabfooddragons");
		this.setBackgroundImageName("dragons.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.DRAGON_NIP);
	}
	
}
