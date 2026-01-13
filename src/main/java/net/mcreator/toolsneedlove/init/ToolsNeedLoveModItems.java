/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toolsneedlove.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

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
	}
	// Start of user code block custom items
	// End of user code block custom items
}