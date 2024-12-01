package com.Kizo50.carpeta_forge.common.items_mod;

import com.Kizo50.carpeta_forge.Carpeta_forge_main;

import net.minecraft.block.material.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item.Properties;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class Foods_mod {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			Carpeta_forge_main.MOD_ID);
	
	//COMIDAS
	public static final RegistryObject<Item> HAMBURGUESA = ITEMS.register("hamburguesa", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(6).saturation(0.3f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);
	public static final RegistryObject<Item> KEBAP = ITEMS.register("kebap", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(10).saturation(0.5f).effect(new EffectInstance(Effects.REGENERATION, 400, 1), 1.0F).effect(new EffectInstance(Effects.SLOWNESS, 2400, 3), 1.0F).effect(new EffectInstance(Effects.ABSORPTION, 2400, 3), 1.0F).effect(new EffectInstance(Effects.WEAKNESS, 2400, 3), 1.0F).effect(new EffectInstance(Effects.WITHER, 400, 3), 1.0F).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))
			
	);
	
	public static final RegistryObject<Item> ACEITE_GIRASOL = ITEMS.register("aceite", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(2).saturation(0.2f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);
	
	public static final RegistryObject<Item> SALSA_YOGURT = ITEMS.register("salsayogurt", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(1).saturation(0.1f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);

	public static final RegistryObject<Item> PATATA_FRITAS = ITEMS.register("patatas_fritas", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(4).saturation(0.2f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);
	
	public static final RegistryObject<Item> BOTE_SALSA_YOGURT = ITEMS.register("bote_salsa_yogurt", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(2).saturation(0.2f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);
	
	public static final RegistryObject<Item> PAELLA = ITEMS.register("paella", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(9).saturation(0.2f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);
	
	public static final RegistryObject<Item> PAN_PITA = ITEMS.register("pan_pita", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(4).saturation(0.2f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);

	public static final RegistryObject<Item> ENSALADA = ITEMS.register("ensalada", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(6).saturation(0.2f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);
	
	//IMPLENTAR FOTOS Y YA BUENO Y EL RECIPIES Y EL JSON
	/*
	public static final RegistryObject<Item> CHURROS = ITEMS.register("churros", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(7).saturation(0.3f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);
	public static final RegistryObject<Item> TORTILLA = ITEMS.register("tortilla", () -> new Item(
			new Item.Properties().food(new Food.Builder().hunger(8).saturation(0.1f).build()).group(ItemGroup.FOOD).group(Mod_TAB.KEBAP_MOD))

	);
	
	*/
	
	//TAB 
	 public static final RegistryObject<Item> TAB = ITEMS.register("tab", ()
	             -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

	//HERRAMIENTAS KEBAP
	 
	public static final RegistryObject<SwordItem> ESPADA_KEBAP = ITEMS.register("espada_kebap", ()
			-> new SwordItem(espada_tier.ESPADAKEBAP, 5, -2.8f, (new Item.Properties()).group(ItemGroup.COMBAT).group(Mod_TAB.KEBAP_MOD)));
	
	public static final RegistryObject<PickaxeItem> PICO_KEBAP = ITEMS.register("pico_kebap", ()
			-> new PickaxeItem(pico_tier.PICOKEBAP, 5, 1.8F, (new Item.Properties()).group(ItemGroup.TOOLS).group(Mod_TAB.KEBAP_MOD)));
	
	public static final RegistryObject<HoeItem> AZADA_KEBAP = ITEMS.register("azada_kebap", ()
			-> new HoeItem(espada_tier.ESPADAKEBAP, -3, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS).group(Mod_TAB.KEBAP_MOD)));

	public static final RegistryObject<ShovelItem> PALA_KEBAP = ITEMS.register("pala_kebap", ()
			-> new ShovelItem(espada_tier.ESPADAKEBAP, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS).group(Mod_TAB.KEBAP_MOD)));	
	
	public static final RegistryObject<AxeItem> HACHA_KEBAP = ITEMS.register("hacha_kebap", ()
			->  new AxeItem(espada_tier.ESPADAKEBAP, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS).group(Mod_TAB.KEBAP_MOD)));
	
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
