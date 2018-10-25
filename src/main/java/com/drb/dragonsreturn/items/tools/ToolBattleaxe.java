package com.drb.dragonsreturn.items.tools;

import com.drb.dragonsreturn.Main;
import com.drb.dragonsreturn.init.ModItems;
import com.drb.dragonsreturn.util.IHasModel;

import net.minecraft.item.ItemSword;

public class ToolBattleaxe extends ItemSword implements IHasModel{
	
	public ToolBattleaxe(String name, ToolMaterial material) { 
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabcombatdragons);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
