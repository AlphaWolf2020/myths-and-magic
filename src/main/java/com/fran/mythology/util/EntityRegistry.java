package com.fran.mythology.util;

import com.fran.mythology.MythMod;
import com.fran.mythology.client.render.RatRenderer;
import com.google.common.base.Preconditions;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = MythMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegistry {
    @SubscribeEvent
    public static void registerRat(RegistryEvent.Register<EntityType<?>> event) {
        Preconditions.checkNotNull(RegistryHandler.RAT.get().getRegistryName(), "registryName");
        event.getRegistry().register(RegistryHandler.RAT.get());

    }

}
