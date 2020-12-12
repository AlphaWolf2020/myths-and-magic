package com.fran.mythology.util;

import com.fran.mythology.MythMod;
import com.fran.mythology.armor.MythArmorMaterial;
import com.fran.mythology.blocks.BlockItemBase;
import com.fran.mythology.blocks.SilverBlock;
import com.fran.mythology.blocks.SilverOre;
import com.fran.mythology.items.ItemBase;
import com.fran.mythology.tools.MythItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MythMod.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MythMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // Items
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ItemBase::new);
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", ItemBase::new);
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ItemBase::new);


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


    // Block Items
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItemBase(SILVER_BLOCK.get()));
    public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore", () -> new BlockItemBase(SILVER_ORE.get()));


}















