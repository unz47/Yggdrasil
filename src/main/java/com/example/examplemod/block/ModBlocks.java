package com.example.examplemod.block;

import com.example.examplemod.Yggdrasil;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, Yggdrasil.MODID);

    public static final RegistryObject<Block> MITHRIL_ORE = BLOCKS.register("mithril_ore",
        () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of()
            .strength(7.0f, 3.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)));

    public static final RegistryObject<Block> ADAMANTITE_ORE = BLOCKS.register("adamantite_ore",
        () -> new DropExperienceBlock(UniformInt.of(0, 3), BlockBehaviour.Properties.of()
            .strength(7.0f, 4.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            .lightLevel(state -> 9)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static void registerBlockItems(IEventBus eventBus) {
        DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, Yggdrasil.MODID);
        
        items.register("mithril_ore", () -> new BlockItem(MITHRIL_ORE.get(), new Item.Properties()));
        items.register("adamantite_ore", () -> new BlockItem(ADAMANTITE_ORE.get(), new Item.Properties()));
        
        items.register(eventBus);
    }
}
