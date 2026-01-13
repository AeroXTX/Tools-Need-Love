package net.mcreator.toolsneedlove.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.toolsneedlove.init.ToolsNeedLoveModItems;
import net.mcreator.toolsneedlove.init.ToolsNeedLoveModFluids;
import net.mcreator.toolsneedlove.init.ToolsNeedLoveModFluidTypes;
import net.mcreator.toolsneedlove.init.ToolsNeedLoveModBlocks;

public abstract class OilfluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ToolsNeedLoveModFluidTypes.OILFLUID_TYPE.get(), () -> ToolsNeedLoveModFluids.OILFLUID.get(), () -> ToolsNeedLoveModFluids.FLOWING_OILFLUID.get())
			.explosionResistance(100f).tickRate(40).bucket(() -> ToolsNeedLoveModItems.OILFLUID_BUCKET.get()).block(() -> (LiquidBlock) ToolsNeedLoveModBlocks.OILFLUID.get());

	private OilfluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilfluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilfluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}