package com.drb.dragonsreturn.proxy;

import com.drb.dragonsreturn.init.ModEventHandler;
import com.drb.dragonsreturn.network.PacketHandler;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		PacketHandler.initPackets();
		MinecraftForge.EVENT_BUS.register(new ModEventHandler());
		
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {}
		
}
