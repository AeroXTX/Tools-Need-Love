package net.mcreator.toolsneedlove.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.toolsneedlove.init.ToolsNeedLoveModItems;

public class RustyPickaxeItem extends PickaxeItem {
	public RustyPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ToolsNeedLoveModItems.WORN_PICKAXE.get()));
			}
		}, 1, -1f, new Item.Properties());
	}
}