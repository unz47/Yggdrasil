package com.example.examplemod.item.metal;

import com.example.examplemod.Yggdrasil;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MetalItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, Yggdrasil.MODID);

    public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTITE_NUGGET = ITEMS.register("adamantite_nugget",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
