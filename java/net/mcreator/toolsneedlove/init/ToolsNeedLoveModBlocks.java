/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toolsneedlove.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.toolsneedlove.block.StorageCrateBlock;
import net.mcreator.toolsneedlove.block.RefiningStationBlock;
import net.mcreator.toolsneedlove.block.OilfluidBlock;
import net.mcreator.toolsneedlove.block.CrateOfOilBlock;
import net.mcreator.toolsneedlove.ToolsNeedLoveMod;

public class ToolsNeedLoveModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ToolsNeedLoveMod.MODID);
	public static final RegistryObject<Block> CRATE_OF_OIL;
	public static final RegistryObject<Block> REFINING_STATION;
	public static final RegistryObject<Block> OILFLUID;
	public static final RegistryObject<Block> STORAGE_CRATE;
	static {
		CRATE_OF_OIL = REGISTRY.register("crate_of_oil", CrateOfOilBlock::new);
		REFINING_STATION = REGISTRY.register("refining_station", RefiningStationBlock::new);
		OILFLUID = REGISTRY.register("oilfluid", OilfluidBlock::new);
		STORAGE_CRATE = REGISTRY.register("storage_crate", StorageCrateBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}