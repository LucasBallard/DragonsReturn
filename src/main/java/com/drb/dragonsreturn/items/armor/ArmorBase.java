package com.drb.dragonsreturn.items.armor;

import com.drb.dragonsreturn.Main;
import com.drb.dragonsreturn.init.ModItems;
import com.drb.dragonsreturn.util.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
