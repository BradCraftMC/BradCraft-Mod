package net.stayer.bradcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.stayer.bradcraft.BradCraft;

import static net.minecraft.registry.Registries.ITEM;

public class ModItems {
    public static final Item TACO = registerItem("taco",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)
                    .food(new FoodComponent.Builder().hunger(11).saturationModifier(16).build())));
    public static final Item TACO_SHELL = registerItem("taco_shell",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(3).build())));


    private static Item registerItem(String name, Item item) {
        return Registry.register(ITEM, new Identifier(BradCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BradCraft.LOGGER.debug("Registering mod items for " + BradCraft.MOD_ID);
    }
}