package com.drb.dragonsreturn.items.food;

import com.drb.dragonsreturn.Main;
import com.drb.dragonsreturn.init.ModItems;
import com.drb.dragonsreturn.util.IHasModel;

import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood implements IHasModel {

	public ItemCustomFood(String name, int amount, boolean isWolfFood) {
		
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabfooddragons);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
