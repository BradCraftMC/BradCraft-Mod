package net.stayer.bradcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stayer.bradcraft.BradCraft;

public class ModItemGroup {
    public static ItemGroup BRADCRAFT;

    public static void registerItemGroups() {
        BRADCRAFT = FabricItemGroup.builder(new Identifier(BradCraft.MOD_ID, "bradcraft"))
                .displayName(Text.literal("BradCraft v2"))
                .icon(() -> new ItemStack(ModItems.TACO))
                .entries((enabledFeatures, entries) -> {
                    entries.add(ModItems.TACO);
                    entries.add(ModItems.TACO_SHELL);
                    entries.add(ModItems.TATER);
                    entries.add(ModItems.BAKED_TATER);
                    entries.add(ModItems.POISONOUS_TATER);
                    entries.add(ModItems.FALL_DUDE_EGG);
                    entries.add(ModItems.BATTERY_ACID);
                    entries.add(ModItems.GLOW_BATTERY_ACID);
                    entries.add(ModItems.JUG);
                    entries.add(ModItems.WATER_JUG);
                    entries.add(ModItems.LAVA_JUG);
                    entries.add(ModItems.WATER_BOTTLE);
                    entries.add(ModItems.DRIP_HELMET);
                    entries.add(ModItems.DRIP_CHESTPLATE);
                    entries.add(ModItems.DRIP_LEGGINGS);
                    entries.add(ModItems.DRIP_BOOTS);
                })
                .build();
    }
}