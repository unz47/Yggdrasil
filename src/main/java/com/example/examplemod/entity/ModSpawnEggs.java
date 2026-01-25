package com.example.examplemod.entity;

import com.example.examplemod.Yggdrasil;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSpawnEggs {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Yggdrasil.MODID);

    public static final RegistryObject<Item> GIANT_BEE_SPAWN_EGG = ITEMS.register("giant_bee_spawn_egg",
            () -> new GiantBeeSpawnEggItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
