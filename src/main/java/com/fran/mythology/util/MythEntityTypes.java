package com.fran.mythology.util;

import com.fran.mythology.MythMod;
import com.fran.mythology.entities.RatEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MythEntityTypes {


    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MythMod.MOD_ID);


   //Entity Types
   public static final RegistryObject<EntityType<RatEntity>> RAT = ENTITY_TYPES.register("rat",
           () -> EntityType.Builder.create(RatEntity::new, EntityClassification.CREATURE)
                   .size(1.0f, 1.0f) // Hitbox Size
                   .build(new ResourceLocation(MythMod.MOD_ID, "rat").toString()));
}
