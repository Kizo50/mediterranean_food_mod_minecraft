package com.Kizo50.carpeta_forge.common.items_mod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.*;
public class Mod_TAB {

	public static final ItemGroup KEBAP_MOD = new ItemGroup("kebap_mod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Foods_mod.TAB.get());
        }
    };

}
