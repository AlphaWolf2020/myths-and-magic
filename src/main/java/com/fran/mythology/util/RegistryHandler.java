package com.fran.mythology.util;

import com.fran.mythology.MythMod;
import com.fran.mythology.armor.MythArmorMaterial;
import com.fran.mythology.blocks.*;
import com.fran.mythology.entities.RatEntity;
import com.fran.mythology.items.ItemBase;
import com.fran.mythology.tools.MythItemTier;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MythMod.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MythMod.MOD_ID);

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MythMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // Items
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ItemBase::new);
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", ItemBase::new);
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", ItemBase::new);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ItemBase::new);


    // Tools
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () ->
            new SwordItem(MythItemTier.SILVER, 6, -2.8F, new Item.Properties().group(MythMod.TAB)));

    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(MythItemTier.SILVER, 2, -1.4F, new Item.Properties().group(MythMod.TAB)));

    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () ->
            new AxeItem(MythItemTier.SILVER, 8, -1.8F, new Item.Properties().group(MythMod.TAB)));

    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () ->
            new ShovelItem(MythItemTier.SILVER, 1, -1.4F, new Item.Properties().group(MythMod.TAB)));

    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () ->
            new HoeItem(MythItemTier.SILVER, 1, -1.4F, new Item.Properties().group(MythMod.TAB)));

    // Armour / Armor

    public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(MythArmorMaterial.SILVER, EquipmentSlotType.HEAD, new Item.Properties().group(MythMod.TAB)));

    public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(MythArmorMaterial.SILVER, EquipmentSlotType.CHEST, new Item.Properties().group(MythMod.TAB)));

    public static final RegistryObject<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(MythArmorMaterial.SILVER, EquipmentSlotType.LEGS, new Item.Properties().group(MythMod.TAB)));

    public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(MythArmorMaterial.SILVER, EquipmentSlotType.FEET, new Item.Properties().group(MythMod.TAB)));

    // Blocks
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", SilverBlock::new);
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", SilverOre::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", CopperBlock::new);
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", CopperOre::new);

    // Block Items
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItemBase(SILVER_BLOCK.get()));
    public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore", () -> new BlockItemBase(SILVER_ORE.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE.get()));


    //Entity Types
    public static final RegistryObject<EntityType<RatEntity>> RAT = ENTITY_TYPES.register("rat", () -> EntityType.Builder.create(RatEntity::new, EntityClassification.CREATURE).size(1.5f, 2.5f).build(new ResourceLocation(MythMod.MOD_ID, "rat").toString()));

}















