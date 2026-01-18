package com.example.examplemod.item.tool;

import com.example.examplemod.Yggdrasil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, Yggdrasil.MODID);

    public static final RegistryObject<Item> ULTIMATE_AXE = ITEMS.register("ultimate_axe",
        () -> new UltimateAxeItem(ModToolTiers.ULTIMATE, 
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ULTIMATE_SWORD = ITEMS.register("ultimate_sword",
        () -> new UltimateSwordItem(ModToolTiers.ULTIMATE, 
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ULTIMATE_PICKAXE = ITEMS.register("ultimate_pickaxe",
        () -> new UltimatePickaxeItem(ModToolTiers.ULTIMATE, 
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ULTIMATE_SHOVEL = ITEMS.register("ultimate_shovel",
        () -> new UltimateShovelItem(ModToolTiers.ULTIMATE, 
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ULTIMATE_HOE = ITEMS.register("ultimate_hoe",
        () -> new UltimateHoeItem(ModToolTiers.ULTIMATE, 
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ULTIMATE_BOW = ITEMS.register("ultimate_bow",
        () -> new UltimateBowItem(
            new Item.Properties().durability(1000).fireResistant().rarity(Rarity.UNCOMMON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
