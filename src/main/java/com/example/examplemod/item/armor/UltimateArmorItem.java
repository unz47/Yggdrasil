package com.example.examplemod.item.armor;

import net.minecraft.core.Holder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class UltimateArmorItem extends ArmorItem {

    public UltimateArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        super.onCraftedBy(stack, level, player);

        stack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
        stack.enchant(Enchantments.UNBREAKING, 3);
        stack.enchant(Enchantments.MENDING, 1);

        switch (this.getType()) {
            case HELMET:
                stack.enchant(Enchantments.RESPIRATION, 3);
                stack.enchant(Enchantments.AQUA_AFFINITY, 1);
                break;
            case CHESTPLATE:
                stack.enchant(Enchantments.THORNS, 3);
                break;
            case LEGGINGS:
                stack.enchant(Enchantments.SWIFT_SNEAK, 3);
                break;
            case BOOTS:
                stack.enchant(Enchantments.FALL_PROTECTION, 4);
                stack.enchant(Enchantments.DEPTH_STRIDER, 3);
                break;
            default:
                break;
        }
    }
}
