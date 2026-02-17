package com.example.examplemod.item.armor;

import com.example.examplemod.Yggdrasil;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    // Netherite x2: defense H=6,C=16,L=12,B=6, toughness=6.0, knockback=0.2, enchantability=30
    public static final Holder<ArmorMaterial> ULTIMATE = register("ultimate",
        Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.HELMET, 6);
            map.put(ArmorItem.Type.CHESTPLATE, 16);
            map.put(ArmorItem.Type.LEGGINGS, 12);
            map.put(ArmorItem.Type.BOOTS, 6);
            map.put(ArmorItem.Type.BODY, 22);
        }),
        30,
        SoundEvents.ARMOR_EQUIP_NETHERITE,
        () -> Ingredient.EMPTY,
        6.0F,
        0.2F
    );

    private static Holder<ArmorMaterial> register(
        String name,
        EnumMap<ArmorItem.Type, Integer> defense,
        int enchantmentValue,
        Holder<SoundEvent> equipSound,
        Supplier<Ingredient> repairIngredient,
        float toughness,
        float knockbackResistance
    ) {
        ResourceLocation loc = new ResourceLocation(Yggdrasil.MODID, name);
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(loc));
        return Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            loc,
            new ArmorMaterial(defense, enchantmentValue, equipSound, repairIngredient, layers, toughness, knockbackResistance)
        );
    }

    public static void init() {
    }
}
