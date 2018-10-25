package com.drb.dragonsreturn.init;

import java.util.ArrayList;
import java.util.List;

import com.drb.dragonsreturn.blocks.BlockBase;
import com.drb.dragonsreturn.blocks.BlockGiron;
import com.drb.dragonsreturn.blocks.BlockOreCopper;
import com.drb.dragonsreturn.blocks.BlockOreTin;
import com.drb.dragonsreturn.blocks.BlockPlantDragonNip;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//METAL BLOCKS
	public static final Block BLOCK_GIRON = new BlockGiron("block_giron", Material.IRON);
	
	//ORES
	public static final Block BLOCK_ORE_COPPER = new BlockOreCopper("block_ore_copper", Material.ROCK);
	public static final Block BLOCK_ORE_TIN = new BlockOreTin("block_ore_tin", Material.ROCK);
	
	//TREE BLOCKS
//	public static final Block LOKI_LOG_BLOCK = new BlockBase("loki_log_block", Material.WOOD);
	
	//LARGE PLANKS
	public static final Block BLOCK_PLANKS_LARGE_ACACIA = new BlockBase("block_planks_large_acacia", Material.WOOD);
	public static final Block BLOCK_PLANKS_LARGE_BIG_OAK = new BlockBase("block_planks_large_big_oak", Material.WOOD);
	public static final Block BLOCK_PLANKS_LARGE_BIRCH= new BlockBase("block_planks_large_birch", Material.WOOD);
	public static final Block BLOCK_PLANKS_LARGE_JUNGLE = new BlockBase("block_planks_large_jungle", Material.WOOD);
	public static final Block BLOCK_PLANKS_LARGE_OAK = new BlockBase("block_planks_large_oak", Material.WOOD);
	public static final Block BLOCK_PLANKS_LARGE_SPRUCE = new BlockBase("block_planks_large_spruce", Material.WOOD);
	
	//ROOF TILES
	public static final Block BLOCK_TILES = new BlockBase("block_tiles", Material.ROCK);
	
	
	//CROPS
	public static final Block BLOCK_PLANT_DRAGON_NIP = new BlockPlantDragonNip("block_plant_dragon_nip");
		
}
