package com.example.examplemod.item;

import com.example.examplemod.Yggdrasil;
import com.example.examplemod.block.ModBlocks;
import com.example.examplemod.entity.ModSpawnEggs;
import com.example.examplemod.item.metal.MetalItems;
import com.example.examplemod.item.tool.ToolItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Yggdrasil.MODID);

    public static final RegistryObject<CreativeModeTab> MISC_TAB = CREATIVE_MODE_TABS.register("misc_tab",
        () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(MetalItems.MITHRIL_NUGGET.get()))
            .title(Component.translatable("creativetab.yggdrasil.misc"))
            .displayItems((parameters, output) -> {
                output.accept(MetalItems.MITHRIL_NUGGET.get());
                output.accept(MetalItems.MITHRIL_INGOT.get());
                output.accept(MetalItems.ADAMANTITE_NUGGET.get());
                output.accept(MetalItems.ADAMANTITE_INGOT.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("blocks_tab",
        () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModBlocks.MITHRIL_ORE.get()))
            .title(Component.translatable("creativetab.yggdrasil.blocks"))
            .displayItems((parameters, output) -> {
                output.accept(ModBlocks.MITHRIL_ORE.get());
                output.accept(ModBlocks.ADAMANTITE_ORE.get());
                output.accept(ModBlocks.MITHRIL_BLOCK.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("tools_tab",
        () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ToolItems.ULTIMATE_PICKAXE.get()))
            .title(Component.translatable("creativetab.yggdrasil.tools"))
            .displayItems((parameters, output) -> {
                output.accept(ToolItems.ULTIMATE_PICKAXE.get());
                output.accept(ToolItems.ULTIMATE_SHOVEL.get());
                output.accept(ToolItems.ULTIMATE_HOE.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> COMBAT_TAB = CREATIVE_MODE_TABS.register("combat_tab",
        () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ToolItems.ULTIMATE_AXE.get()))
            .title(Component.translatable("creativetab.yggdrasil.combat"))
            .displayItems((parameters, output) -> {
                output.accept(ToolItems.ULTIMATE_SWORD.get());
                output.accept(ToolItems.ULTIMATE_AXE.get());
                output.accept(ToolItems.ULTIMATE_BOW.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TABS.register("food_tab",
        () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(Items.APPLE))
            .title(Component.translatable("creativetab.yggdrasil.food"))
            .displayItems((parameters, output) -> {
                output.accept(Items.APPLE);
            })
            .build());

    public static final RegistryObject<CreativeModeTab> ENEMY_TAB = CREATIVE_MODE_TABS.register("enemy_tab",
        () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModSpawnEggs.GIANT_BEE_SPAWN_EGG.get()))
            .title(Component.translatable("creativetab.yggdrasil.enemy"))
            .displayItems((parameters, output) -> {
                output.accept(ModSpawnEggs.GIANT_BEE_SPAWN_EGG.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
