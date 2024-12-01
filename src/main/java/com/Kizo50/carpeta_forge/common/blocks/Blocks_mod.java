package com.Kizo50.carpeta_forge.common.blocks;

import com.Kizo50.carpeta_forge.Carpeta_forge_main;
import com.Kizo50.carpeta_forge.common.items_mod.Foods_mod;
import com.Kizo50.carpeta_forge.common.items_mod.Mod_TAB;
import com.google.common.base.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks_mod {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,Carpeta_forge_main.MOD_ID);
		
		
	private static 	<T extends Block> RegistryObject <T> registerBlock(String name,Supplier<T>block) {
		RegistryObject <T> toReturn = BLOCKS.register(name, block);
		
		//NO FUNCIONA ESTA LINEA
		registerBlockItem(name,toReturn);
		return toReturn;
		
	}
	
	public static final RegistryObject <Block> BLOQUE_PRUEBA1 = registerBlock("bloque_prueba",
			()->new Block(AbstractBlock.Properties.create(Material.ROCK)
					.harvestLevel(1)
					.setRequiresTool()
					.harvestTool(ToolType.PICKAXE)
					.hardnessAndResistance(1.5f,5.0f)
					)
			
			)
			
		));
		
		
		public static final RegistryObject <Block> BLOQUE_KEBAP = registerBlock("bloque_kebap",
				()->new Block(AbstractBlock.Properties.create(Material.WOOD)
						.harvestLevel(2)
						.setRequiresTool()
						.harvestTool(ToolType.AXE)
						.hardnessAndResistance(1.5f,5.0f)
						
						)
				
				)
				
			));
	
	private static 	<T extends Block> void registerBlockItem(String name,RegistryObject<T> block) {
		Foods_mod.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).group(Mod_TAB.KEBAP_MOD)));
		
	}
	

	
	public static void register(IEventBus eventBus) {
		
		BLOCKS.register(eventBus);
	}
}
