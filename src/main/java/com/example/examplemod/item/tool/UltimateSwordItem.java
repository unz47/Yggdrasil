package com.example.examplemod.item.tool;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantments;

public class UltimateSwordItem extends SwordItem {
    public UltimateSwordItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(SwordItem.createAttributes(tier, 50, -2.4f)));
    }

    @Override
    public void onCraftedBy(ItemStack stack, net.minecraft.world.level.Level level, net.minecraft.world.entity.player.Player player) {
        super.onCraftedBy(stack, level, player);
        stack.enchant(Enchantments.UNBREAKING, 3);
        stack.enchant(Enchantments.SHARPNESS, 5);
        stack.enchant(Enchantments.FIRE_ASPECT, 2);
    }
}
