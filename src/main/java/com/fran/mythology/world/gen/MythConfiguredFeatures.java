package com.fran.mythology.world.gen;

import com.fran.mythology.MythMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;

public class MythConfiguredFeatures {
        public static final ConfiguredFeature<?, ?>SILVER_ORE =
                newConfiguredFeature("silver_ore", Feature.ORE.withConfiguration(MythConfigurations.SILVER_ORE).range(30).square().func_242731_b(4));

        public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName, ConfiguredFeature<?, ?> configuredFeature) {
            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(MythMod.MOD_ID, registryName), configuredFeature);
            return configuredFeature;

        }
}
