package com.example.examplemod.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;

public class UltimateHelmetItem extends ArmorItem {

    public UltimateHelmetItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public ItemStack getDefaultInstance() {
        ItemStack stack = new ItemStack(this);
        stack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
        stack.enchant(Enchantments.UNBREAKING, 3);
        stack.enchant(Enchantments.RESPIRATION, 3);
        stack.enchant(Enchantments.AQUA_AFFINITY, 1);
        return stack;
    }
}
