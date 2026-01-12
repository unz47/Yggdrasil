package com.example.examplemod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Yggdrasil.MODID)
public class Yggdrasil {
    public static final String MODID = "yggdrasil";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Yggdrasil() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        
        LOGGER.info("Hello from Yggdrasil!");
    }
}
