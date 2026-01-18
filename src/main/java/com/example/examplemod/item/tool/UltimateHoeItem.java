package com.example.examplemod.item.tool;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.state.BlockState;

public class UltimateHoeItem extends HoeItem {
    public UltimateHoeItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(HoeItem.createAttributes(tier, 8.0f, -3.0f)));
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        if (this.isCorrectToolForDrops(stack, state)) {
            return 18.0f;
        }
        return super.getDestroySpeed(stack, state);
    }

    @Override
    public void onCraftedBy(ItemStack stack, net.minecraft.world.level.Level level, net.minecraft.world.entity.player.Player player) {
        super.onCraftedBy(stack, level, player);
        stack.enchant(Enchantments.UNBREAKING, 3);
        stack.enchant(Enchantments.EFFICIENCY, 5);
        stack.enchant(Enchantments.MENDING, 1);
    }
}
