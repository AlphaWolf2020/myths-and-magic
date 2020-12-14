package com.fran.mythology.world.gen;

import com.fran.mythology.MythMod;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = MythMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MythOreGen {

    private static final ArrayList<Biome.Category> nonOverworldBiomes = new ArrayList<>();
    static {
        nonOverworldBiomes.add(Biome.Category.NETHER);
        //nonOverworldBiomes.add(Biome.Category.NETHER_WASTES);
        nonOverworldBiomes.add(Biome.Category.THEEND);
        //add any others here as needed
    }

    @SubscribeEvent
    public static void onBiomeLoading(BiomeLoadingEvent event){
        if (!nonOverworldBiomes.contains(event.getCategory())){
        //if (event.getCategory() == Biome.Category.FOREST){
        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, MythConfiguredFeatures.SILVER_ORE);


    }}}


   //Overworld Ore Register
        /*overworldOres.add(register("silver_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandler.SILVER_ORE.get().getDefaultState(), 5))
        .range(112).square().chance(100)));// Spawn height start
        //.func_242731_b(155))); // Chunk Spawn frequency

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
        if(event.getCategory().equals(Biome.Category.FOREST)){
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