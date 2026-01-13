package net.mcreator.toolsneedlove.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class RefinerItem extends Item {
	public RefinerItem() {
		super(new Item.Properties().durability(10).setNoRepair());
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}
}