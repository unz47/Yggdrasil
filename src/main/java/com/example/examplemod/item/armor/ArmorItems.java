package com.example.examplemod.item.armor;

import com.example.examplemod.Yggdrasil;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArmorItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Yggdrasil.MODID);

    public static final RegistryObject<Item> ULTIMATE_HELMET = ITEMS.register("ultimate_helmet",
        () -> new UltimateHelmetItem(UltimateArmorMaterial.ULTIMATE, ArmorItem.Type.HELMET,
            new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
