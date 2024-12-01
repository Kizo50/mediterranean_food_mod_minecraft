package com.Kizo50.carpeta_forge.common.items_mod;

import java.util.function.Supplier;

import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public enum pico_tier implements IItemTier {

	
	PICOKEBAP(1, 131, 4.0F, 3.0F, 5, () -> Ingredient.fromItems(Blocks.DIAMOND_ORE));

    private final Supplier<Ingredient> repairmaterial;
    private final int enchantability;
    private final float attackDamage;
    private final float efficiency;
    private final int maxUses;
    private final int harvestLevel;


    pico_tier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairmaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairmaterial = repairmaterial;
    }

	
	@Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairmaterial.get();
    }
    {
}
}
