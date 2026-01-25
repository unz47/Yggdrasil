package com.example.examplemod.entity;

import com.example.examplemod.Yggdrasil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Yggdrasil.MODID);

    public static final RegistryObject<SoundEvent> GIANT_BEE_AMBIENT = SOUND_EVENTS.register("entity.giant_bee.ambient",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Yggdrasil.MODID, "entity.yggdrasil.giant_bee.ambient")));

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
