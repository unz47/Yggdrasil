package com.example.examplemod.item.tool;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantments;

public class UltimateAxeItem extends AxeItem {
    public UltimateAxeItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(AxeItem.createAttributes(tier, 25.0f, -3.0f)));
    }

    @Override
    public void onCraftedBy(ItemStack stack, net.minecraft.world.level.Level level, net.minecraft.world.entity.player.Player player) {
        super.onCraftedBy(stack, level, player);
        stack.enchant(Enchantments.UNBREAKING, 3);
        stack.enchant(Enchantments.SHARPNESS, 5);
        stack.enchant(Enchantments.EFFICIENCY, 5);
    }
}
