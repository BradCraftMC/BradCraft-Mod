package net.stayer.bradcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.stayer.bradcraft.BradCraft;
//import net.stayer.bradcraft.fluid.ModFluids;
//import net.stayer.bradcraft.item.custom.ModMusicDiscItem;
//import net.stayer.bradcraft.sound.ModSounds;

import static net.minecraft.registry.Registries.ITEM;

public class ModItems {
    // Taco & Taco Shell
    // Food properties can be found in ModFoodComponents.java
    public static final Item TACO = registerItem("taco",
            new Item(new FabricItemSettings().food(ModFoodComponents.TACO).rarity(Rarity.RARE)));
    public static final Item TACO_SHELL = registerItem("taco_shell",
            new Item (new FabricItemSettings().food(ModFoodComponents.TACO_SHELL).rarity(Rarity.UNCOMMON)));

    // Married Life music disc, currently broken (commented to avoid errors)
    //public static final Item DISC_MARRIED_LIFE = registerItem("disc_married_life",
            //new ModMusicDiscItem(7, ModSounds.MARRIED_LIFE,
                    //new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    // Drip armor
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

    // Jugs
    public static final Item JUG = registerItem("jug",
            new BucketItem(Fluids.EMPTY, new FabricItemSettings().maxCount(1)));
    public static final Item WATER_JUG = registerItem("water_jug",
            new BucketItem(Fluids.WATER, new FabricItemSettings().maxCount(1)));
    public static final Item LAVA_JUG = registerItem("lava_jug",
            new BucketItem(Fluids.LAVA, new FabricItemSettings().maxCount(1)));

    // Battery Acid
    // Food properties can be found in ModFoodComponents.java
    public static final Item BATTERY_ACID = registerItem("battery_acid",
            new Item(new FabricItemSettings().food(ModFoodComponents.BATTERY_ACID)));

    // Glowing Battery Acid
    // Food properties can be found in ModFoodComponents.java
    public static final Item GLOW_BATTERY_ACID = registerItem("glow_battery_acid",
            new Item(new FabricItemSettings().food(ModFoodComponents.GLOW_BATTERY_ACID)));

    // All Taters
    public static final Item TATER = registerItem("tater",
            new Item(new FabricItemSettings().food(ModFoodComponents.TATER)));
    public static final Item BAKED_TATER = registerItem("baked_tater",
            new Item(new FabricItemSettings().food(ModFoodComponents.BAKED_TATER)));
    public static final Item POISONOUS_TATER = registerItem("poisonous_tater",
            new Item(new FabricItemSettings().food(ModFoodComponents.POISONOUS_TATER)));

    // Fall Dude Egg
    public static final Item FALL_DUDE_EGG = registerItem("fall_dude_egg",
            new Item(new FabricItemSettings().food(ModFoodComponents.FALL_DUDE_EGG)));

    // Water Bottle
    // Rarity is a placeholder until a better setting idea has been realized
    public static final Item WATER_BOTTLE = registerItem("water_bottle",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    // Initial config data for items
    private static Item registerItem(String name, Item item) {
        return Registry.register(ITEM, new Identifier(BradCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BradCraft.LOGGER.debug("Registering mod items for " + BradCraft.MOD_ID);
    }
}