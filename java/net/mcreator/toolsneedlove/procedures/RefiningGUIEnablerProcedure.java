package net.mcreator.toolsneedlove.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.toolsneedlove.init.ToolsNeedLoveModMenus;
import net.mcreator.toolsneedlove.init.ToolsNeedLoveModItems;

public class RefiningGUIEnablerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == ToolsNeedLoveModItems.REFINER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == ToolsNeedLoveModItems.OIL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == ToolsNeedLoveModItems.WORN_PICKAXE
						.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu) {
				ItemStack stack = _menu.getSlots().get(0).getItem();
				if (stack != null) {
					if (stack.hurt(1, RandomSource.create(), null)) {
						stack.shrink(1);
						stack.setDamageValue(0);
					}
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).set(ItemStack.EMPTY);
				_menu.getSlots().get(2).set(ItemStack.EMPTY);
				ItemStack _setstack9 = new ItemStack(ToolsNeedLoveModItems.IRONPICKAXE.get()).copy();
				_setstack9.setCount(1);
				_menu.getSlots().get(3).set(_setstack9);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("tools_need_love:worntosqueekyclean"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu11 ? _menu11.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == ToolsNeedLoveModItems.REFINER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu13 ? _menu13.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == ToolsNeedLoveModItems.OIL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu15 ? _menu15.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == ToolsNeedLoveModItems.RUSTY_PICKAXE
						.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu) {
				ItemStack stack = _menu.getSlots().get(0).getItem();
				if (stack != null) {
					if (stack.hurt(1, RandomSource.create(), null)) {
						stack.shrink(1);
						stack.setDamageValue(0);
					}
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof ToolsNeedLoveModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).set(ItemStack.EMPTY);
				_menu.getSlots().get(2).set(ItemStack.EMPTY);
				ItemStack _setstack20 = new ItemStack(ToolsNeedLoveModItems.WORN_PICKAXE.get()).copy();
				_setstack20.setCount(1);
				_menu.getSlots().get(3).set(_setstack20);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}