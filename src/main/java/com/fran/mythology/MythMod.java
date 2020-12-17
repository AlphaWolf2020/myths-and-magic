package com.fran.mythology;

import com.fran.mythology.entities.RatEntity;
import com.fran.mythology.util.RegistryHandler;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("myth")
public class MythMod {

    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "myth";


    public MythMod() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() ->
                GlobalEntityTypeAttributes.put(RegistryHandler.RAT.get(), RatEntity.setCustomAttributes().create()));
    }



    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB = new ItemGroup("mythsTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.SILVER_INGOT.get());
        }
 
    };
}