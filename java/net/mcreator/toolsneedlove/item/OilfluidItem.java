package net.mcreator.toolsneedlove.item;

import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.toolsneedlove.init.ToolsNeedLoveModFluids;

import javax.annotation.Nullable;

public class OilfluidItem extends BucketItem {
	public OilfluidItem() {
		super(ToolsNeedLoveModFluids.OILFLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}

	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) {
		return new FluidBucketWrapper(stack);
	}
}