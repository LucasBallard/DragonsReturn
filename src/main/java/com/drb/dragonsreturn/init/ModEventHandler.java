package com.drb.dragonsreturn.init;

import java.util.List;

import com.drb.dragonsreturn.items.IExtendedReach;
import com.drb.dragonsreturn.network.MesageExtendedReachAttack;
import com.drb.dragonsreturn.network.PacketHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEventHandler {

	/**
	 * Based off
	 * http://jabelarminecraft.blogspot.com/p/minecraft-modding-extending-reach-of.html
	 * @author SoggyMustache
	 */
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onEvent(MouseEvent event) {
		if (event.getButton() == 0 && event.isButtonstate()) {
			Minecraft mc = Minecraft.getMinecraft();
			EntityPlayer thePlayer = mc.player;
			if (thePlayer != null) {
				ItemStack itemstack = thePlayer.getHeldItemMainhand();
				IExtendedReach ieri;
				if (itemstack != null) {
					if (itemstack.getItem() instanceof IExtendedReach) {
						ieri = (IExtendedReach) itemstack.getItem();
					} else {
						ieri = null;
					}

					if (ieri != null) {
						float reach = ieri.getReach();
						RayTraceResult mov = getMouseOverExtended(reach);

						if (mov != null)
							if (mov.entityHit != null && mov.entityHit.hurtResistantTime == 0)
								if (mov.entityHit != thePlayer)
									PacketHandler.net
											.sendToServer(new MesageExtendedReachAttack(mov.entityHit.getEntityId()));
					}
				}
			}
		}
	}

	public static AxisAlignedBB addCoord(AxisAlignedBB a, double x, double y, double z) {
		double d3 = a.minX;
		double d4 = a.minY;
		double d5 = a.minZ;
		double d6 = a.maxX;
		double d7 = a.maxY;
		double d8 = a.maxZ;

		if (x < 0.0D) {
			d3 += x;
		} else if (x > 0.0D) {
			d6 += x;
		}

		if (y < 0.0D) {
			d4 += y;
		} else if (y > 0.0D) {
			d7 += y;
		}

		if (z < 0.0D) {
			d5 += z;
		} else if (z > 0.0D) {
			d8 += z;
		}

		return new AxisAlignedBB(d3, d4, d5, d6, d7, d8);
	}

	/**
	 * Based off
	 * http://jabelarminecraft.blogspot.com/p/minecraft-modding-extending-reach-of.html
	 * Comment from jabler "This is mostly copied from the EntityRenderer#getMouseOver() method"
	 * @author SoggyMustache
	 */
	public static RayTraceResult getMouseOverExtended(float dist) {
		Minecraft mc = FMLClientHandler.instance().getClient();
		Entity theRenderViewEntity = mc.getRenderViewEntity();
		AxisAlignedBB theViewBoundingBox = new AxisAlignedBB(theRenderViewEntity.posX - 0.5D,
				theRenderViewEntity.posY - 0.0D, theRenderViewEntity.posZ - 0.5D, theRenderViewEntity.posX + 0.5D,
				theRenderViewEntity.posY + 1.5D, theRenderViewEntity.posZ + 0.5D);
		RayTraceResult returnMOP = null;
		if (mc.world != null) {
			double var2 = dist;
			returnMOP = theRenderViewEntity.rayTrace(var2, 0);
			double calcdist = var2;
			Vec3d pos = theRenderViewEntity.getPositionEyes(0);
			var2 = calcdist;
			if (returnMOP != null) {
				calcdist = returnMOP.hitVec.distanceTo(pos);
			}

			Vec3d lookvec = theRenderViewEntity.getLook(0);
			Vec3d var8 = pos.addVector(lookvec.x * var2, lookvec.y * var2, lookvec.z * var2);
			Entity pointedEntity = null;
			float var9 = 1.0F;
			List<Entity> list = mc.world.getEntitiesWithinAABBExcludingEntity(theRenderViewEntity,
					addCoord(theViewBoundingBox, lookvec.x * var2, lookvec.y * var2, lookvec.z * var2).expand(var9,
							var9, var9));
			double d = calcdist;

			for (Entity entity : list) {
				if (entity.canBeCollidedWith()) {
					float bordersize = entity.getCollisionBorderSize();
					AxisAlignedBB aabb = new AxisAlignedBB(entity.posX - entity.width / 2, entity.posY,
							entity.posZ - entity.width / 2, entity.posX + entity.width / 2, entity.posY + entity.height,
							entity.posZ + entity.width / 2);
					aabb.expand(bordersize, bordersize, bordersize);
					RayTraceResult mop0 = aabb.calculateIntercept(pos, var8);

					if (aabb.contains(pos)) {
						if (0.0D < d || d == 0.0D) {
							pointedEntity = entity;
							d = 0.0D;
						}
					} else if (mop0 != null) {
						double d1 = pos.distanceTo(mop0.hitVec);

						if (d1 < d || d == 0.0D) {
							pointedEntity = entity;
							d = d1;
						}
					}
				}
			}

			if (pointedEntity != null && (d < calcdist || returnMOP == null)) {
				returnMOP = new RayTraceResult(pointedEntity);
			}
		}
		return returnMOP;
	}

}
