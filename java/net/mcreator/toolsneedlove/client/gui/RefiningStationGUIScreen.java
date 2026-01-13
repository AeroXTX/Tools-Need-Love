package net.mcreator.toolsneedlove.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.toolsneedlove.world.inventory.RefiningStationGUIMenu;
import net.mcreator.toolsneedlove.init.ToolsNeedLoveModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class RefiningStationGUIScreen extends AbstractContainerScreen<RefiningStationGUIMenu> implements ToolsNeedLoveModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public RefiningStationGUIScreen(RefiningStationGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("tools_need_love:textures/screens/refining_station_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(new ResourceLocation("tools_need_love:textures/screens/worn_pickaxe.png"), this.leftPos + 56, this.topPos + 49, 0, 0, 8, 8, 8, 8);
		guiGraphics.blit(new ResourceLocation("tools_need_love:textures/screens/oilbottletexture.png"), this.leftPos + 97, this.topPos + 31, 0, 0, 8, 8, 8, 8);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.tools_need_love.refining_station_gui.label_empty"), 56, 30, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tools_need_love.refining_station_gui.label_empty1"), 71, 46, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tools_need_love.refining_station_gui.label_empty2"), 42, 45, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tools_need_love.refining_station_gui.label_empty3"), 109, 51, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tools_need_love.refining_station_gui.label_refining_station"), 51, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}