package net.stayer.bradcraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stayer.bradcraft.BradCraft;
import net.stayer.bradcraft.block.custom.ModFluidBlock;
//import net.stayer.bradcraft.fluid.ModFluids;

import static net.minecraft.registry.Registries.BLOCK;
import static net.minecraft.registry.Registries.ITEM;

//public class ModBlocks {
    // Milk Block, currently broken
    //public static final Block MILK_BLOCK = registerBlockWithoutBlockItem("milk_block",
            //new ModFluidBlock(ModFluids.MILK_STILL, FabricBlockSettings.of(Material.WATER)
                    //.noCollision().nonOpaque().dropsNothing()));
    //private static Block registerBlock(String name, Block block, ItemGroup group) {
        //registerBlockItem(name, block, group);
        //return Registry.register(BLOCK, new Identifier(BradCraft.MOD_ID, name), block);
    //}
    // Block class for blocks in the same nature as Milk Block, uncomment when fixed
    //private static Block registerBlockWithoutBlockItem(String name, Block block) {
        //registerBlockItem(name, block, group);
        //return Registry.register(BLOCK, new Identifier(BradCraft.MOD_ID, name), block);
    //}
    //private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        //return Registry.register(ITEM, new Identifier(BradCraft.MOD_ID, name),
                //new BlockItem(block, ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> entries.add(new ItemStack))));
    //}

    //public static void registerModBlocks() {
        //BradCraft.LOGGER.info("Registering ModBlocks for " + BradCraft.MOD_ID);
    //}
//}
