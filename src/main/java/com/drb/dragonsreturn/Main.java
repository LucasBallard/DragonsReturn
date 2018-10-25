package com.drb.dragonsreturn;

import com.drb.dragonsreturn.init.ModRecipes;
import com.drb.dragonsreturn.proxy.CommonProxy;
import com.drb.dragonsreturn.tabs.TabBlocksDragons;
import com.drb.dragonsreturn.tabs.TabCombatDragons;
import com.drb.dragonsreturn.tabs.TabFoodDragons;
import com.drb.dragonsreturn.tabs.TabItemsDragons;
import com.drb.dragonsreturn.tabs.TabMiscDragons;
import com.drb.dragonsreturn.tabs.TabToolsDragons;
import com.drb.dragonsreturn.util.Reference;
import com.drb.dragonsreturn.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs tabblocksdragons = new TabBlocksDragons("tabblocksdragons");
	public static final CreativeTabs tabitemsdragons = new TabItemsDragons("tabitemsdragons");
	public static final CreativeTabs tabcombatdragons = new TabCombatDragons("tabcombatdragons");
	public static final CreativeTabs tabtoolsdragons = new TabToolsDragons("tabtoolsdragons");
	public static final CreativeTabs tabfooddragons = new TabFoodDragons("tabfooddragons");
	public static final CreativeTabs tabmiscdragons = new TabMiscDragons("tabmiscdragons");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.MODID + ":preInit");
		proxy.preInit(event);
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {
		System.out.println(Reference.MODID + ":init");
		
		ModRecipes.init();
	}
	
	@Mod.EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		System.out.println(Reference.MODID + ":postInit");
	}
	
}
