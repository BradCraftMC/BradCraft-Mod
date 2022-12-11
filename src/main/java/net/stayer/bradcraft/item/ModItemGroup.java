package net.stayer.bradcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BRADCRAFT = FabricItemGroup.builder(new Identifier("BradCraft", "bradcraft"))
            .icon(() -> new ItemStack(ModItems.TACO))
            .build();
}
