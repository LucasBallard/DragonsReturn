package com.drb.dragonsreturn.tabs;

import com.drb.dragonsreturn.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabItemsDragons extends CreativeTabs {

	public TabItemsDragons(String label) {
		
		super("tabitemsdragons");
		this.setBackgroundImageName("dragons.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.INGOT_GIRON);
	}
	
}
