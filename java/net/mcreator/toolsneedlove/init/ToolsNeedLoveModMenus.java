/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toolsneedlove.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.toolsneedlove.world.inventory.StorageCrateGUIMenu;
import net.mcreator.toolsneedlove.world.inventory.RefiningStationGUIMenu;
import net.mcreator.toolsneedlove.network.MenuStateUpdateMessage;
import net.mcreator.toolsneedlove.ToolsNeedLoveMod;

import java.util.Map;

public class ToolsNeedLoveModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ToolsNeedLoveMod.MODID);
	public static final RegistryObject<MenuType<RefiningStationGUIMenu>> REFINING_STATION_GUI = REGISTRY.register("refining_station_gui", () -> IForgeMenuType.create(RefiningStationGUIMenu::new));
	public static final RegistryObject<MenuType<StorageCrateGUIMenu>> STORAGE_CRATE_GUI = REGISTRY.register("storage_crate_gui", () -> IForgeMenuType.create(StorageCrateGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				ToolsNeedLoveMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof ToolsNeedLoveModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ToolsNeedLoveMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}