package carldergross.tweaksmod.common.item;

import java.util.function.Supplier;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ItemTiers implements Tier {
    ANDESITE(1, 131, 4.0f, 1.0f, 5,
    		() -> Ingredient.of(Items.ANDESITE)),
    DIORITE(1, 131, 4.0f, 1.0f, 5, 
    		() -> Ingredient.of(Items.DIORITE)),
    GRANITE(1, 131, 4.0f, 1.0f, 5,
    		() -> Ingredient.of(Items.GRANITE));

    private final int harvestLevel;
    private final int maxUses;
    private final float speed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;
    
    ItemTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
    	this.harvestLevel = level;
    	this.maxUses = uses;
    	this.speed = speed;
    	this.attackDamage = damage;
    	this.enchantability = enchantmentValue;
    	this.repairIngredient = repairIngredient;
    }
    
    @Override
    public int getLevel() {
    	return this.harvestLevel;
    }
    
    @Override
    public int getUses() {
    	return this.maxUses;
    }
    
    @Override
    public float getSpeed() {
    	return this.speed;
    }
    
    @Override
    public float getAttackDamageBonus() {
    	return this.attackDamage;
    }
    
    @Override
    public int getEnchantmentValue() {
    	return this.enchantability;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
    	return this.repairIngredient.get();
    }
}
