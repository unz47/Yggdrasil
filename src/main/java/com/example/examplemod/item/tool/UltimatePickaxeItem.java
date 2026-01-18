package com.example.examplemod.item.tool;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.state.BlockState;

public class UltimatePickaxeItem extends PickaxeItem {
    public UltimatePickaxeItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(PickaxeItem.createAttributes(tier, 15.0f, -2.8f)));
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        if (this.isCorrectToolForDrops(stack, state)) {
            return 15.0f;
        }
        return super.getDestroySpeed(stack, state);
    }

    @Override
    public void onCraftedBy(ItemStack stack, net.minecraft.world.level.Level level, net.minecraft.world.entity.player.Player player) {
        super.onCraftedBy(stack, level, player);
        stack.enchant(Enchantments.UNBREAKING, 3);
        stack.enchant(Enchantments.EFFICIENCY, 5);
        stack.enchant(Enchantments.FORTUNE, 3);
    }
}
