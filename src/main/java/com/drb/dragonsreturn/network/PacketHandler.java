package com.drb.dragonsreturn.network;

import com.drb.dragonsreturn.util.Reference;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler {
	public static SimpleNetworkWrapper net;

	public static void initPackets() {
		net = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID.toUpperCase());
		registerMessage(MesageExtendedReachAttack.Handler.class, MesageExtendedReachAttack.class);
	}
	
	private static int nextPacketId = 0;

	private static void registerMessage(Class packet, Class message) {
		net.registerMessage(packet, message, nextPacketId, Side.CLIENT);
		net.registerMessage(packet, message, nextPacketId, Side.SERVER);
		nextPacketId++;
	}
}