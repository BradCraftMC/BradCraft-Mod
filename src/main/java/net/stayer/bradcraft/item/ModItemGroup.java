package net.stayer.bradcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier("bradcraft", "bradcraft_items"))
        .displayName(Text.literal("BradCraft"))
        .icon(() -> new ItemStack(ModItems.TACO))
        .entries((enabledFeatures, entries, operatorDisabled) -> {
            entries.add(ModItems.TACO);
            entries.add(ModItems.TACO_SHELL);
        })
        .build();
}
