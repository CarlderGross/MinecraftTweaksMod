package carldergross.tweaksmod.items;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;

import java.util.function.Supplier;

public enum ItemTiers implements IItemTier {
    ANDESITE(1, 131, 4.0f, 1.0f, 5, null),
    DIORITE(1, 131, 4.0f, 1.0f, 5, null),
    GRANITE(1, 131, 4.0f, 1.0f, 5, null);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    private ItemTiers(int harvestinput, int maxUsesinput, float efficiencyinput, float damageinput, int enchantabilityinput, Ingredient repairMaterialinput) {
        this.harvestLevel = harvestinput;
        this.maxUses = maxUsesinput;
        this.efficiency = efficiencyinput;
        this.attackDamage = damageinput;
        this.enchantability = enchantabilityinput;
        this.repairMaterial = repairMaterialinput;
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
        return this.repairMaterial;
    }
}
