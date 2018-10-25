package com.drb.dragonsreturn.tabs;

import com.drb.dragonsreturn.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabCombatDragons extends CreativeTabs {

	public TabCombatDragons(String label) {
		
		super("tabcombatdragons");
		this.setBackgroundImageName("dragons.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.SWORD_GIRON);
	}
	
}
