package net.mcreator.toolsneedlove.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.toolsneedlove.init.ToolsNeedLoveModItems;

public class WornPickaxeItem extends PickaxeItem {
	public WornPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 3.5f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ToolsNeedLoveModItems.REFINER.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}