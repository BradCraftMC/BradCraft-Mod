package net.stayer.bradcraft;

import net.fabricmc.api.ModInitializer;
//import net.stayer.bradcraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.stayer.bradcraft.entity.ImpostorEntity;
import net.stayer.bradcraft.item.ModItemGroup;
import net.stayer.bradcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.registry.Registry;

import static net.stayer.bradcraft.item.ModItemGroup.BRADCRAFT;

public class BradCraft implements ModInitializer {
	public static final String MOD_ID = "bradcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger("bradcraft");

	public static final EntityType<ImpostorEntity> IMPOSTOR = Registry.register(
			Registries.ENTITY_TYPE,
			new Identifier("bradcraft", "impostor"),
			FabricEntityTypeBuilder.<ImpostorEntity>create(SpawnGroup.MONSTER,ImpostorEntity::new).dimensions(EntityDimensions.fixed(0.75f, 1.0f)).build()
	);

@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		//ModBlocks.registerModBlocks();

		/*ItemGroupEvents.modifyEntriesEvent(BRADCRAFT).register(content -> {
			content.add(ModItems.TACO);
			content.add(ModItems.TACO_SHELL);
			content.add(ModItems.TATER);
			content.add(ModItems.BAKED_TATER);
			content.add(ModItems.POISONOUS_TATER);
			content.add(ModItems.JUG);
			content.add(ModItems.WATER_JUG);
			content.add(ModItems.LAVA_JUG);
			content.add(ModItems.WATER_BOTTLE);
			content.add(ModItems.FALL_DUDE_EGG);
			content.add(ModItems.BATTERY_ACID);
			content.add(ModItems.GLOW_BATTERY_ACID);
			content.add(ModItems.DRIP_HELMET);
			content.add(ModItems.DRIP_CHESTPLATE);
			content.add(ModItems.DRIP_LEGGINGS);
			content.add(ModItems.DRIP_BOOTS);*/
	}
}
