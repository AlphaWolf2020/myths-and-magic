package com.fran.mythology.world.gen;

import com.fran.mythology.MythMod;
import com.fran.mythology.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MythOreGen {
    public static void AddSilverOre(Biome biome) {

        //Copied from Vanilla Coal Ore Generation
        biome.getGenerationSettings().
        biome.generateFeatures(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandler.SILVER_ORE.get().getDefaultState(), 17)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 10))));
    }
    public static void CallbackRegisterBiomes()
    {
        for (Biome biome : ForgeRegistries.BIOMES)
            AddSilverOre(biome);
    }
}
// yeah I was looking through past problems in forge fourms and the server
// this is what I had:
/*    private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();
    private static final ArrayList<ConfiguredFeature<?, ?>> netherOres = new ArrayList<ConfiguredFeature<?, ?>>();
    private static final ArrayList<ConfiguredFeature<?, ?>> endOres = new ArrayList<ConfiguredFeature<?, ?>>();

    public static void registerOre(){
        //Overworld Ore Register
        overworldOres.add(register("silver_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandler.SILVER_ORE.get().getDefaultState(), 5))
        .range(112).square()// Spawn height start
        .func_242731_b(155))); // Chunk Spawn frequency

        //Nether Ore Register
       netherOres.add(register("silver_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, RegistryHandler.SILVER_ORE.get().getDefaultState(), 3))
                .range(0).square() // Spawn height start
                .func_242731_b(0))); // Chunk Spawn frequency

        //End Ore Register
        endOres.add(register("silver_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, RegistryHandler.SILVER_ORE.get().getDefaultState(), 3))
                .range(0).square() // Spawn height start
                .func_242731_b(0))); // Chunk Spawn frequency
    }



    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if(event.getCategory().equals(Biome.Category.NETHER)){
            for(ConfiguredFeature<?, ?> ore : netherOres){
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
        if(event.getCategory().equals(Biome.Category.THEEND)){
            for(ConfiguredFeature<?, ?> ore :endOres){
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
        for(ConfiguredFeature<?, ?> ore :overworldOres){
            if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
        }
    }


    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, MythMod.MOD_ID + ":" + name, configuredFeature);
    }
}*/