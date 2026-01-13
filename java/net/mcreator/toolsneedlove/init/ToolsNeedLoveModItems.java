/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toolsneedlove.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.toolsneedlove.item.*;
import net.mcreator.toolsneedlove.ToolsNeedLoveMod;

public class ToolsNeedLoveModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ToolsNeedLoveMod.MODID);
	public static final RegistryObject<Item> REFINER;
	public static final RegistryObject<Item> OIL;
	public static final RegistryObject<Item> WORN_PICKAXE;
	public static final RegistryObject<Item> WORN_AXE;
	public static final RegistryObject<Item> WORN_SWORD;
	public static final RegistryObject<Item> WORN_SHOVEL;
	public static final RegistryObject<Item> WORN_HOE;
	public static final RegistryObject<Item> RUSTY_PICKAXE;
	public static final RegistryObject<Item> RUSTY_AXE;
	public static final RegistryObject<Item> RUSTY_SWORD;
	public static final RegistryObject<Item> RUSTY_SHOVEL;
	public static final RegistryObject<Item> RUSTY_HOE;
	public static final RegistryObject<Item> WORN_ARMOR_HELMET;
	public static final RegistryObject<Item> WORN_ARMOR_CHESTPLATE;
	public static final RegistryObject<Item> WORN_ARMOR_LEGGINGS;
	public static final RegistryObject<Item> WORN_ARMOR_BOOTS;
	public static final RegistryObject<Item> RUSTY_IRON_ARMOR_HELMET;
	public static final RegistryObject<Item> RUSTY_IRON_ARMOR_CHESTPLATE;
	public static final RegistryObject<Item> RUSTY_IRON_ARMOR_LEGGINGS;
	public static final RegistryObject<Item> RUSTY_IRON_ARMOR_BOOTS;
	public static final RegistryObject<Item> CRATE_OF_OIL;
	public static final RegistryObject<Item> REFINING_STATION;
	public static final RegistryObject<Item> IRONPICKAXE;
	public static final RegistryObject<Item> OILFLUID_BUCKET;
	public static final RegistryObject<Item> STORAGE_CRATE;
	static {
		REFINER = REGISTRY.register("refiner", RefinerItem::new);
		OIL = REGISTRY.register("oil", OilItem::new);
		WORN_PICKAXE = REGISTRY.register("worn_pickaxe", WornPickaxeItem::new);
		WORN_AXE = REGISTRY.register("worn_axe", WornAxeItem::new);
		WORN_SWORD = REGISTRY.register("worn_sword", WornSwordItem::new);
		WORN_SHOVEL = REGISTRY.register("worn_shovel", WornShovelItem::new);
		WORN_HOE = REGISTRY.register("worn_hoe", WornHoeItem::new);
		RUSTY_PICKAXE = REGISTRY.register("rusty_pickaxe", RustyPickaxeItem::new);
		RUSTY_AXE = REGISTRY.register("rusty_axe", RustyAxeItem::new);
		RUSTY_SWORD = REGISTRY.register("rusty_sword", RustySwordItem::new);
		RUSTY_SHOVEL = REGISTRY.register("rusty_shovel", RustyShovelItem::new);
		RUSTY_HOE = REGISTRY.register("rusty_hoe", RustyHoeItem::new);
		WORN_ARMOR_HELMET = REGISTRY.register("worn_armor_helmet", WornArmorItem.Helmet::new);
		WORN_ARMOR_CHESTPLATE = REGISTRY.register("worn_armor_chestplate", WornArmorItem.Chestplate::new);
		WORN_ARMOR_LEGGINGS = REGISTRY.register("worn_armor_leggings", WornArmorItem.Leggings::new);
		WORN_ARMOR_BOOTS = REGISTRY.register("worn_armor_boots", WornArmorItem.Boots::new);
		RUSTY_IRON_ARMOR_HELMET = REGISTRY.register("rusty_iron_armor_helmet", RustyIronArmorItem.Helmet::new);
		RUSTY_IRON_ARMOR_CHESTPLATE = REGISTRY.register("rusty_iron_armor_chestplate", RustyIronArmorItem.Chestplate::new);
		RUSTY_IRON_ARMOR_LEGGINGS = REGISTRY.register("rusty_iron_armor_leggings", RustyIronArmorItem.Leggings::new);
		RUSTY_IRON_ARMOR_BOOTS = REGISTRY.register("rusty_iron_armor_boots", RustyIronArmorItem.Boots::new);
		CRATE_OF_OIL = block(ToolsNeedLoveModBlocks.CRATE_OF_OIL);
		REFINING_STATION = block(ToolsNeedLoveModBlocks.REFINING_STATION);
		IRONPICKAXE = REGISTRY.register("ironpickaxe", IronpickaxeItem::new);
		OILFLUID_BUCKET = REGISTRY.register("oilfluid_bucket", OilfluidItem::new);
		STORAGE_CRATE = block(ToolsNeedLoveModBlocks.STORAGE_CRATE);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}