package com.fran.mythology.world.gen;

import com.fran.mythology.util.RegistryHandler;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class MythConfigurations {
        public static final OreFeatureConfig SILVER_ORE = new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                RegistryHandler.SILVER_ORE.get().getDefaultState(),
                7);


}

