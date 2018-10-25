package com.drb.dragonsreturn.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.BLOCK_GIRON, new ItemStack(ModItems.INGOT_GIRON, 9), 1.5F);
		GameRegistry.addSmelting(ModBlocks.BLOCK_ORE_COPPER, new ItemStack(ModItems.INGOT_COPPER, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.BLOCK_ORE_TIN, new ItemStack(ModItems.INGOT_TIN, 1), 1.5F);
	}
	
}
