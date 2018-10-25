package com.drb.dragonsreturn.items.tools;

import com.drb.dragonsreturn.Main;
import com.drb.dragonsreturn.init.ModItems;
import com.drb.dragonsreturn.util.IHasModel;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{

	public ToolAxe(String name, ToolMaterial material) { 
		
		super(material, 6.0F, -3.2F);// material, damage value, speed value
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabtoolsdragons);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
