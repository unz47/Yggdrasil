package com.example.examplemod.item.food;

import com.example.examplemod.Yggdrasil;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Yggdrasil.MODID);

    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
        () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                .nutrition(2)
                .saturationModifier(0.4f)
                .build())));

    public static final RegistryObject<Item> ROASTED_CORN = ITEMS.register("roasted_corn",
        () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                .nutrition(5)
                .saturationModifier(0.6f)
                .build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
