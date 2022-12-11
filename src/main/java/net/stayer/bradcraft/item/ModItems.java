package net.stayer.bradcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.stayer.bradcraft.BradCraft;
//import net.stayer.bradcraft.item.custom.ModMusicDiscItem;
//import net.stayer.bradcraft.sound.ModSounds;

import static net.minecraft.registry.Registries.ITEM;

public class ModItems {
    // Taco
    public static final Item TACO = registerItem("taco",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)
                    .food(new FoodComponent.Builder().hunger(11).saturationModifier(16).build())));
    // Taco Shell
    public static final Item TACO_SHELL = registerItem("taco_shell",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(3).build())));

    // Married Life music disc, currently broken (commented to avoid errors)
    //public static final Item DISC_MARRIED_LIFE = registerItem("disc_married_life",
            //new ModMusicDiscItem(7, ModSounds.MARRIED_LIFE,
                    //new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    // All 4 Drip armor sets below
    public static final Item DRIP_HELMET = registerItem("drip_helmet",
            new ArmorItem(ModArmorMaterials.DRIP, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item DRIP_CHESTPLATE = registerItem("drip_chestplate",
            new ArmorItem(ModArmorMaterials.DRIP, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item DRIP_LEGGINGS = registerItem("drip_leggings",
            new ArmorItem(ModArmorMaterials.DRIP, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item DRIP_BOOTS = registerItem("drip_boots",
            new ArmorItem(ModArmorMaterials.DRIP, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.EPIC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(ITEM, new Identifier(BradCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BradCraft.LOGGER.debug("Registering mod items for " + BradCraft.MOD_ID);
    }
}