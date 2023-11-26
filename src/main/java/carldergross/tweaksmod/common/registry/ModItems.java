package carldergross.tweaksmod.common.registry;

import carldergross.tweaksmod.TweaksMod;
import carldergross.tweaksmod.common.item.ItemTiers;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.HoeItem;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TweaksMod.MODID);
	
	//Helper methods
	public static Item.Properties basicItemProperties() {
		return new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS);
	}
	
	public static Item.Properties weaponItemProperties() {
		return new Item.Properties().tab(CreativeModeTab.TAB_COMBAT);
	}
	
	public static Item.Properties toolItemProperties() {
		return new Item.Properties().tab(CreativeModeTab.TAB_TOOLS);
	}
	
	//Tools
	public static final RegistryObject<Item> ANDESITE_SWORD = ITEMS.register("andesite_sword",
			() -> new SwordItem(ItemTiers.ANDESITE, 3, -2.4F, weaponItemProperties()));
	public static final RegistryObject<Item> DIORITE_SWORD = ITEMS.register("diorite_sword",
			() -> new SwordItem(ItemTiers.DIORITE, 3, -2.4F, weaponItemProperties()));
	public static final RegistryObject<Item> GRANITE_SWORD = ITEMS.register("granite_sword",
			() -> new SwordItem(ItemTiers.GRANITE, 3, -2.4F, weaponItemProperties()));
	
	public static final RegistryObject<Item> ANDESITE_PICK = ITEMS.register("andesite_pickaxe",
			() -> new PickaxeItem(ItemTiers.ANDESITE, 1, -2.8F, toolItemProperties()));
	public static final RegistryObject<Item> DIORITE_PICK = ITEMS.register("diorite_pickaxe",
			() -> new PickaxeItem(ItemTiers.DIORITE, 1, -2.8F, toolItemProperties()));
	public static final RegistryObject<Item> GRANITE_PICK = ITEMS.register("granite_pickaxe",
			() -> new PickaxeItem(ItemTiers.GRANITE, 1, -2.8F, toolItemProperties()));
	
	public static final RegistryObject<Item> ANDESITE_AXE = ITEMS.register("andesite_axe",
			() -> new AxeItem(ItemTiers.ANDESITE, 7.0F, -3.2F, toolItemProperties()));
	public static final RegistryObject<Item> DIORITE_AXE = ITEMS.register("diorite_axe",
			() -> new AxeItem(ItemTiers.DIORITE, 7.0F, -3.2F, toolItemProperties()));
	public static final RegistryObject<Item> GRANITE_AXE = ITEMS.register("granite_axe",
			() -> new AxeItem(ItemTiers.GRANITE, 7.0F, -3.2F, toolItemProperties()));
	
	public static final RegistryObject<Item> ANDESITE_SHOVEL = ITEMS.register("andesite_shovel",
			() -> new ShovelItem(ItemTiers.ANDESITE, 1.5F, -3.0F, toolItemProperties()));
	public static final RegistryObject<Item> DIORITE_SHOVEL = ITEMS.register("diorite_shovel",
			() -> new ShovelItem(ItemTiers.DIORITE, 1.5F, -3.0F, toolItemProperties()));
	public static final RegistryObject<Item> GRANITE_SHOVEL = ITEMS.register("granite_shovel",
			() -> new ShovelItem(ItemTiers.GRANITE, 1.5F, -3.0F, toolItemProperties()));
	
	public static final RegistryObject<Item> ANDESITE_HOE = ITEMS.register("andesite_hoe",
			() -> new HoeItem(ItemTiers.ANDESITE, 0, -2.0F, toolItemProperties()));
	public static final RegistryObject<Item> DIORITE_HOE = ITEMS.register("diorite_hoe",
			() -> new HoeItem(ItemTiers.DIORITE, 0, -2.0F, toolItemProperties()));
	public static final RegistryObject<Item> GRANITE_HOE = ITEMS.register("granite_hoe",
			() -> new HoeItem(ItemTiers.GRANITE, 0, -2.0F, toolItemProperties()));
	
	//Ingredients
	public static final RegistryObject<Item> CHAIN_LINK = ITEMS.register("chain_link",
			() -> new Item(basicItemProperties()));
	public static final RegistryObject<Item> CHAIN_PANEL = ITEMS.register("chain_panel",
			() -> new Item(basicItemProperties()));
}
