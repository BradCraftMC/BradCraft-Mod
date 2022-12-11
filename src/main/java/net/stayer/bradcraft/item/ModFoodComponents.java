package net.stayer.bradcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class ModFoodComponents {
    // Tacos
    public static final FoodComponent TACO = new FoodComponent.Builder().hunger(11).saturationModifier(1.7f).meat().build();
    public static final FoodComponent TACO_SHELL = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build();

    // Battery Acid
    public static final FoodComponent BATTERY_ACID = new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,450,1),0.7f).build();

    // Glowing Battery Acid
    public static final FoodComponent GLOW_BATTERY_ACID = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,300,2),0.8f).build();

    // Taters
    public static final FoodComponent TATER = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent BAKED_TATER = new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).build();
    public static final FoodComponent POISONOUS_TATER = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,300,4),0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600,2),1f).build();

    // Fall Dude Egg
    public static final FoodComponent FALL_DUDE_EGG = new FoodComponent.Builder().hunger(5).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600,0),0.8f).meat().build();
}