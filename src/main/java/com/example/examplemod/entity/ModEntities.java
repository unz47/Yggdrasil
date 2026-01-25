package com.example.examplemod.entity;

import com.example.examplemod.Yggdrasil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Yggdrasil.MODID);

    public static final RegistryObject<EntityType<GiantBeeEntity>> GIANT_BEE =
            ENTITY_TYPES.register("giant_bee", () -> EntityType.Builder.of(GiantBeeEntity::new, MobCategory.MONSTER)
                    .sized(2.0f, 4.0f)
                    .build(new ResourceLocation(Yggdrasil.MODID, "giant_bee").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
