/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toolsneedlove.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.toolsneedlove.client.gui.StorageCrateGUIScreen;
import net.mcreator.toolsneedlove.client.gui.RefiningStationGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ToolsNeedLoveModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ToolsNeedLoveModMenus.REFINING_STATION_GUI.get(), RefiningStationGUIScreen::new);
			MenuScreens.register(ToolsNeedLoveModMenus.STORAGE_CRATE_GUI.get(), StorageCrateGUIScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}