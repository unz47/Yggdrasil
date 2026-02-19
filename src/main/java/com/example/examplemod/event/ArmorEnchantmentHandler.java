package com.example.examplemod.event;

import com.example.examplemod.Yggdrasil;
import com.example.examplemod.item.armor.ArmorItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Yggdrasil.MODID)
public class ArmorEnchantmentHandler {

    @SubscribeEvent
    public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
        ItemStack stack = event.getCrafting();
        if (stack.getItem() == ArmorItems.ULTIMATE_HELMET.get() ||
            stack.getItem() == ArmorItems.ULTIMATE_CHESTPLATE.get()) {
            if (!stack.isEnchanted()) {
                stack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
                stack.enchant(Enchantments.UNBREAKING, 3);
                stack.enchant(Enchantments.THORNS, 3);
            }
        }
    }
}
