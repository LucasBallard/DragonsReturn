package com.drb.dragonsreturn.init;

import java.util.ArrayList;
import java.util.List;

import com.drb.dragonsreturn.items.ItemBase;
import com.drb.dragonsreturn.items.ItemMiscBase;
import com.drb.dragonsreturn.items.armor.ArmorBase;
import com.drb.dragonsreturn.items.food.ItemCustomFood;
import com.drb.dragonsreturn.items.food.ItemSeedDragonNip;
import com.drb.dragonsreturn.items.tools.ToolAxe;
import com.drb.dragonsreturn.items.tools.ToolBattleaxe;
import com.drb.dragonsreturn.items.tools.ToolDagger;
import com.drb.dragonsreturn.items.tools.ToolHoe;
import com.drb.dragonsreturn.items.tools.ToolMace;
import com.drb.dragonsreturn.items.tools.ToolPickaxe;
import com.drb.dragonsreturn.items.tools.ToolSpade;
import com.drb.dragonsreturn.items.tools.WeaponSpear;
import com.drb.dragonsreturn.items.tools.WeaponSword;
import com.drb.dragonsreturn.items.tools.WeaponWarHammer;
import com.drb.dragonsreturn.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//MATERIALS BRONZE
	//name, harvestlevel, maxUses, efficiency, damage, enchantability (ctrl + click ToolMaterial to see more)
	public static final ToolMaterial MATERIAL_BRONZE = EnumHelper.addToolMaterial("material_bronze", 2, 175, 5.0F, 1.5F, 10);// between iron and stone
	public static final ToolMaterial MATERIAL_BATTLEAXE_BRONZE = EnumHelper.addToolMaterial("material_battleaxe_bronze", 2, 200, 5.0F, 2.0F, 10);//.5 more dmg than sword
	public static final ToolMaterial MATERIAL_DAGGER_BRONZE = EnumHelper.addToolMaterial("material_dagger_bronze", 2, 125, 5.0F, 1.0F, 10);//.5 less dmg than sword
	public static final ToolMaterial MATERIAL_MACE_BRONZE = EnumHelper.addToolMaterial("material_mace_bronze", 2, 350, 5.0F, 2.5F, 10);// 1 more dmg than sword
	public static final ToolMaterial MATERIAL_SPEAR_BRONZE = EnumHelper.addToolMaterial("material_spear_bronze", 2, 125, 5.0F, 1.25F, 10);//.25 less dmg than sword
	public static final ToolMaterial MATERIAL_WARHAMMER_BRONZE = EnumHelper.addToolMaterial("material_warhammer_bronze", 2, 400, 5.0F, 2.5F, 10);//1 more dmg than sword
	
	//MATERIALS BRONZE
		//name, harvestlevel, maxUses, efficiency, damage, enchantability (ctrl + click ToolMaterial to see more)
	public static final ToolMaterial MATERIAL_GIRON = EnumHelper.addToolMaterial("material_giron", 2, 175, 5.0F, 1.5F, 10);// between iron and stone
	public static final ToolMaterial MATERIAL_BATTLEAXE_GIRON = EnumHelper.addToolMaterial("material_battleaxe_giron", 2, 200, 5.0F, 2.0F, 10);//.5 more dmg than sword		
	public static final ToolMaterial MATERIAL_DAGGER_GIRON = EnumHelper.addToolMaterial("material_dagger_giron", 2, 125, 5.0F, 1.0F, 10);//.5 less dmg than sword
	public static final ToolMaterial MATERIAL_MACE_GIRON = EnumHelper.addToolMaterial("material_mace_giron", 2, 350, 5.0F, 2.5F, 10);// 1 more dmg than sword
	public static final ToolMaterial MATERIAL_SPEAR_GIRON = EnumHelper.addToolMaterial("material_spear_giron", 2, 125, 5.0F, 1.25F, 10);//.25 less dmg than sword
	public static final ToolMaterial MATERIAL_WARHAMMER_GIRON = EnumHelper.addToolMaterial("material_warhammer_giron", 2, 400, 5.0F, 2.5F, 10);//1 more dmg than sword	
	
	//TOOLS BRONZE
	public static final ItemSpade SHOVEL_BRONZE	= new ToolSpade	("shovel_bronze", MATERIAL_BRONZE);
	public static final ItemPickaxe PICKAXE_BRONZE = new ToolPickaxe("pickaxe_bronze", MATERIAL_BRONZE);
	public static final ItemAxe AXE_BRONZE = new ToolAxe("axe_bronze", MATERIAL_BRONZE);
	public static final ItemHoe HOE_BRONZE = new ToolHoe("hoe_bronze", MATERIAL_BRONZE);
	
	//TOOLS GIRON
	public static final ItemSpade SHOVEL_GIRON	= new ToolSpade	("shovel_giron", MATERIAL_GIRON);
	public static final ItemPickaxe PICKAXE_GIRON = new ToolPickaxe("pickaxe_giron", MATERIAL_GIRON);
	public static final ItemAxe AXE_GIRON = new ToolAxe("axe_giron", MATERIAL_GIRON);
	public static final ItemHoe HOE_GIRON = new ToolHoe("hoe_giron", MATERIAL_GIRON);
	
	//WEAPONS BRONZE
	public static final ItemSword SWORD_BRONZE = new WeaponSword("sword_bronze", MATERIAL_BRONZE);
	public static final ItemSword BATTLEAXE_BRONZE = new ToolBattleaxe("battleaxe_bronze", MATERIAL_BATTLEAXE_BRONZE);
	public static final ItemSword DAGGER_BRONZE = new ToolDagger("dagger_bronze", MATERIAL_DAGGER_BRONZE);
	public static final ItemSword MACE_BRONZE = new ToolMace("mace_bronze", MATERIAL_MACE_BRONZE);
	public static final ItemSword SPEAR_BRONZE = new WeaponSpear("spear_bronze", MATERIAL_SPEAR_BRONZE);
	public static final ItemSword WARHAMMER_BRONZE = new WeaponWarHammer("warhammer_bronze", MATERIAL_WARHAMMER_BRONZE);
	public static final ItemSword SHIELD_BRONZE= new WeaponSword("shield_bronze", MATERIAL_BRONZE);
	
	//WEAPONS GIRON
	public static final ItemSword SWORD_GIRON = new WeaponSword("sword_giron", MATERIAL_GIRON);
	public static final ItemSword BATTLEAXE_GIRON = new ToolBattleaxe("battleaxe_giron", MATERIAL_BATTLEAXE_GIRON);
	public static final ItemSword DAGGER_GIRON = new ToolDagger("dagger_giron", MATERIAL_DAGGER_GIRON);
	public static final ItemSword MACE_GIRON = new ToolMace("mace_giron", MATERIAL_MACE_GIRON);
	public static final ItemSword SPEAR_GIRON = new WeaponSpear("spear_giron", MATERIAL_SPEAR_GIRON);
	public static final ItemSword WARHAMMER_GIRON = new WeaponWarHammer("warhammer_giron", MATERIAL_WARHAMMER_GIRON);
	
	
	//MATERIALS NADDER
	public static final ToolMaterial MATERIAL_NADDER = EnumHelper.addToolMaterial("material_nadder", 2, 175, 5.0F, 1.5F, 10);// between iron and stone
	public static final ToolMaterial MATERIAL_DAGGER_NADDER = EnumHelper.addToolMaterial("material_dagger_giron", 2, 125, 5.0F, 1.0F, 10);//.5 less dmg than sword
	public static final ToolMaterial MATERIAL_SPEAR_NADDER = EnumHelper.addToolMaterial("material_spear_nadder", 2, 125, 5.0F, 1.25F, 10);//.25 less dmg than sword

	
	//WEAPONS DRAGONS
	public static final ItemSword DAGGER_NADDER = new ToolDagger("dagger_nadder", MATERIAL_DAGGER_NADDER);
	public static final ItemSword SPEAR_NADDER = new WeaponSpear("spear_nadder", MATERIAL_SPEAR_NADDER);

	
	//MATERIALS ARMOR
	public static final ArmorMaterial ARMOR_MATERIAL_BRONZE = EnumHelper.addArmorMaterial("armor_material_bronze", Reference.MODID + ":bronze", 14, 
																				new int[] {1, 5, 4, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//ARMOR
	// 														name, 			materialIn, 	renderIndexIn, 	equipmentSlotIn
	public static final Item BRONZE_HELMET = new ArmorBase("bronze_helmet", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRONZE_CHESTPLATE = new ArmorBase("bronze_chestplate", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRONZE_LEGGINGS = new ArmorBase("bronze_leggings", ARMOR_MATERIAL_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRONZE_BOOTS = new ArmorBase("bronze_boots", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.FEET);
	
	//INGOTS
	public static final Item INGOT_BRONZE = new ItemBase("ingot_bronze");
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item INGOT_GIRON = new ItemBase("ingot_giron");
	public static final Item INGOT_OUTCAST_IRON = new ItemBase("ingot_outcast_iron");
	public static final Item INGOT_TIN = new ItemBase("ingot_tin");
	
	
	//FOOD
	public static final Item DRUMSTICK = new ItemCustomFood("drumstick", 8, true);
	public static final Item COOKED_MUTTON = new ItemCustomFood("cooked_mutton", 8, true);
	public static final Item RAW_MUTTON = new ItemCustomFood("raw_mutton", 4, true);
	public static final Item DRAGON_NIP = new ItemCustomFood("dragon_nip", 0, false);
	public static final Item SEED_DRAGON_NIP = new ItemSeedDragonNip("seeds_dragon_nip", 0, false);
	
	
	//MISC
	public static final Item EGG_TERRIBLE_TERROR = new ItemMiscBase("egg_terrible_terror");
	public static final Item EGG_ZIPPLEBACK = new ItemMiscBase("egg_zippleback");
	public static final Item FUR = new ItemMiscBase("fur");
	public static final Item NADDER_SPINES = new ItemMiscBase("nadder_spines");
	public static final Item STICK_LOKI = new ItemMiscBase("stick_loki");
	
	
	
}

