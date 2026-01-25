package com.example.examplemod.entity;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "yggdrasil", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityAttributes {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GIANT_BEE.get(), GiantBeeEntity.createAttributes().build());
    }
}
