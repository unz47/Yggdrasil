package com.example.examplemod.item.armor;

import com.example.examplemod.Yggdrasil;
import com.example.examplemod.item.metal.MetalItems;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public class UltimateArmorMaterial implements ArmorMaterial {

    private static final String NAME = Yggdrasil.MODID + ":ultimate";

    private static final EnumMap<ArmorItem.Type, Integer> DEFENSE_MAP = Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 6);
        map.put(ArmorItem.Type.LEGGINGS, 12);
        map.put(ArmorItem.Type.CHESTPLATE, 16);
        map.put(ArmorItem.Type.HELMET, 6);
    });

    private static final EnumMap<ArmorItem.Type, Integer> DURABILITY_MAP = Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 888);
        map.put(ArmorItem.Type.LEGGINGS, 1036);
        map.put(ArmorItem.Type.CHESTPLATE, 1184);
        map.put(ArmorItem.Type.HELMET, 814);
    });

    private static final int ENCHANTMENT_VALUE = 15;
    private static final SoundEvent EQUIP_SOUND = SoundEvents.ARMOR_EQUIP_NETHERITE;
    private static final float TOUGHNESS = 6.0F;
    private static final float KNOCKBACK_RESISTANCE = 0.2F;
    private static final Supplier<Ingredient> REPAIR_INGREDIENT = () -> Ingredient.of(MetalItems.ADAMANTITE_INGOT.get());

    public static final UltimateArmorMaterial INSTANCE = new UltimateArmorMaterial();

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return DURABILITY_MAP.get(type);
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return DEFENSE_MAP.get(type);
    }

    @Override
    public int getEnchantmentValue() {
        return ENCHANTMENT_VALUE;
    }

    @Override
    public SoundEvent getEquipSound() {
        return EQUIP_SOUND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return REPAIR_INGREDIENT.get();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public float getToughness() {
        return TOUGHNESS;
    }

    @Override
    public float getKnockbackResistance() {
        return KNOCKBACK_RESISTANCE;
    }
}
