/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toolsneedlove.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.toolsneedlove.fluid.types.OilfluidFluidType;
import net.mcreator.toolsneedlove.ToolsNeedLoveMod;

public class ToolsNeedLoveModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ToolsNeedLoveMod.MODID);
	public static final RegistryObject<FluidType> OILFLUID_TYPE = REGISTRY.register("oilfluid", () -> new OilfluidFluidType());
}