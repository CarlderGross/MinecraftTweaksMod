package carldergross.tweaksmod.items;

import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import carldergross.tweaksmod.items.ItemTiers;

import static carldergross.tweaksmod.TweaksModMain.modid;

@Mod.EventBusSubscriber(modid = modid, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(modid)
public class ItemHandler {

    //public static final Item test_item = null;
    public static final Item chain_link = null;
    public static final Item chain_panel = null;
    public static final Item andesite_pickaxe = null;
    public static final Item andesite_axe = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
               // new Item(new Item.Properties()).setRegistryName(modid, "test_item")
                new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(modid, "chain_link"),
                new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(modid, "chain_panel"),

                new PickaxeItem(ItemTiers.ANDESITE, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "andesite_pickaxe"),
                new PickaxeItem(ItemTiers.DIORITE, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "diorite_pickaxe"),
                new PickaxeItem(ItemTiers.GRANITE, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "granite_pickaxe"),

                new AxeItem(ItemTiers.ANDESITE, 7.0F, -3.2F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "andesite_axe"),
                new AxeItem(ItemTiers.DIORITE, 7.0F, -3.2F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "diorite_axe"),
                new AxeItem(ItemTiers.GRANITE, 7.0F, -3.2F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "granite_axe"),

                new ShovelItem(ItemTiers.ANDESITE, 1.5F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "andesite_shovel"),
                new ShovelItem(ItemTiers.DIORITE, 1.5F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "diorite_shovel"),
                new ShovelItem(ItemTiers.GRANITE, 1.5F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "granite_shovel"),

                new SwordItem(ItemTiers.ANDESITE, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(modid, "andesite_sword"),
                new SwordItem(ItemTiers.DIORITE, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(modid, "diorite_sword"),
                new SwordItem(ItemTiers.GRANITE, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(modid, "granite_sword"),

                new HoeItem(ItemTiers.ANDESITE, -2.0F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "andesite_hoe"),
                new HoeItem(ItemTiers.DIORITE, -2.0F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "diorite_hoe"),
                new HoeItem(ItemTiers.GRANITE, -2.0F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(modid, "granite_hoe")
        );
    }
}
