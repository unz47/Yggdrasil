package com.example.examplemod.item;

import com.example.examplemod.block.ModBlocks;
import com.example.examplemod.item.metal.MetalItems;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static void register(IEventBus eventBus) {
        MetalItems.register(eventBus);
        ModBlocks.registerBlockItems(eventBus);
    }
}
