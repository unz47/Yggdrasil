package com.example.examplemod.item.armor;

import com.example.examplemod.Yggdrasil;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArmorItems {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Yggdrasil.MODID);

    // Base durability 74 (netherite 37 x2)
    // HELMET: 74 * 11 = 814, CHESTPLATE: 74 * 16 = 1184, LEGGINGS: 74 * 15 = 1110, BOOTS: 74 * 13 = 962
    private static final int BASE_DURABILITY = 74;

    public static final RegistryObject<Item> ULTIMATE_HELMET = ITEMS.register("ultimate_helmet",
        () -> new UltimateArmorItem(ModArmorMaterials.ULTIMATE, ArmorItem.Type.HELMET,
            new Item.Properties().durability(BASE_DURABILITY * 11)
                .fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ULTIMATE_CHESTPLATE = ITEMS.register("ultimate_chestplate",
        () -> new UltimateArmorItem(ModArmorMaterials.ULTIMATE, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(BASE_DURABILITY * 16)
                .fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ULTIMATE_LEGGINGS = ITEMS.register("ultimate_leggings",
        () -> new UltimateArmorItem(ModArmorMaterials.ULTIMATE, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(BASE_DURABILITY * 15)
                .fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ULTIMATE_BOOTS = ITEMS.register("ultimate_boots",
        () -> new UltimateArmorItem(ModArmorMaterials.ULTIMATE, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(BASE_DURABILITY * 13)
                .fireResistant().rarity(Rarity.UNCOMMON)));

    public static void register(IEventBus eventBus) {
        ModArmorMaterials.init();
        ITEMS.register(eventBus);
    }
}
