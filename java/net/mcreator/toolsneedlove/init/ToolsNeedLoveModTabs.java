/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toolsneedlove.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.toolsneedlove.ToolsNeedLoveMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ToolsNeedLoveModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ToolsNeedLoveMod.MODID);
	public static final RegistryObject<CreativeModeTab> TOOLS_NEED_LOVE = REGISTRY.register("tools_need_love",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tools_need_love.tools_need_love")).icon(() -> new ItemStack(ToolsNeedLoveModItems.WORN_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ToolsNeedLoveModItems.REFINER.get());
				tabData.accept(ToolsNeedLoveModItems.OIL.get());
				tabData.accept(ToolsNeedLoveModItems.WORN_PICKAXE.get());
				tabData.accept(ToolsNeedLoveModItems.WORN_AXE.get());
				tabData.accept(ToolsNeedLoveModItems.WORN_SWORD.get());
				tabData.accept(ToolsNeedLoveModItems.WORN_SHOVEL.get());
				tabData.accept(ToolsNeedLoveModItems.WORN_HOE.get());
				tabData.accept(ToolsNeedLoveModItems.RUSTY_PICKAXE.get());
				tabData.accept(ToolsNeedLoveModItems.RUSTY_AXE.get());
				tabData.accept(ToolsNeedLoveModItems.RUSTY_SWORD.get());
				tabData.accept(ToolsNeedLoveModItems.RUSTY_SHOVEL.get());
				tabData.accept(ToolsNeedLoveModItems.RUSTY_HOE.get());
				tabData.accept(ToolsNeedLoveModItems.WORN_ARMOR_HELMET.get());
				tabData.accept(ToolsNeedLoveModItems.WORN_ARMOR_CHESTPLATE.get());
				tabData.accept(ToolsNeedLoveModItems.WORN_ARMOR_LEGGINGS.get());
				tabData.accept(ToolsNeedLoveModItems.WORN_ARMOR_BOOTS.get());
				tabData.accept(ToolsNeedLoveModBlocks.CRATE_OF_OIL.get().asItem());
				tabData.accept(ToolsNeedLoveModBlocks.REFINING_STATION.get().asItem());
				tabData.accept(ToolsNeedLoveModItems.OILFLUID_BUCKET.get());
				tabData.accept(ToolsNeedLoveModBlocks.STORAGE_CRATE.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ToolsNeedLoveModItems.REFINER.get());
			tabData.accept(ToolsNeedLoveModItems.OIL.get());
			tabData.accept(ToolsNeedLoveModBlocks.CRATE_OF_OIL.get().asItem());
			tabData.accept(ToolsNeedLoveModItems.OILFLUID_BUCKET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ToolsNeedLoveModItems.WORN_PICKAXE.get());
			tabData.accept(ToolsNeedLoveModItems.WORN_AXE.get());
			tabData.accept(ToolsNeedLoveModItems.WORN_SHOVEL.get());
			tabData.accept(ToolsNeedLoveModItems.WORN_HOE.get());
			tabData.accept(ToolsNeedLoveModItems.RUSTY_PICKAXE.get());
			tabData.accept(ToolsNeedLoveModItems.RUSTY_AXE.get());
			tabData.accept(ToolsNeedLoveModItems.RUSTY_SHOVEL.get());
			tabData.accept(ToolsNeedLoveModItems.RUSTY_HOE.get());
			tabData.accept(ToolsNeedLoveModItems.IRONPICKAXE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ToolsNeedLoveModItems.WORN_SWORD.get());
			tabData.accept(ToolsNeedLoveModItems.RUSTY_SWORD.get());
			tabData.accept(ToolsNeedLoveModItems.WORN_ARMOR_HELMET.get());
			tabData.accept(ToolsNeedLoveModItems.WORN_ARMOR_CHESTPLATE.get());
			tabData.accept(ToolsNeedLoveModItems.WORN_ARMOR_LEGGINGS.get());
			tabData.accept(ToolsNeedLoveModItems.WORN_ARMOR_BOOTS.get());
			tabData.accept(ToolsNeedLoveModItems.RUSTY_IRON_ARMOR_HELMET.get());
			tabData.accept(ToolsNeedLoveModItems.RUSTY_IRON_ARMOR_CHESTPLATE.get());
			tabData.accept(ToolsNeedLoveModItems.RUSTY_IRON_ARMOR_LEGGINGS.get());
			tabData.accept(ToolsNeedLoveModItems.RUSTY_IRON_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ToolsNeedLoveModBlocks.CRATE_OF_OIL.get().asItem());
			tabData.accept(ToolsNeedLoveModBlocks.REFINING_STATION.get().asItem());
			tabData.accept(ToolsNeedLoveModBlocks.STORAGE_CRATE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(ToolsNeedLoveModBlocks.REFINING_STATION.get().asItem());
			tabData.accept(ToolsNeedLoveModBlocks.STORAGE_CRATE.get().asItem());
		}
	}
}