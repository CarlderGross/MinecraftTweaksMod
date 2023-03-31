package carldergross.tweaksmod.util;

import carldergross.tweaksmod.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static carldergross.tweaksmod.materials.ModMaterials.andesite;
import static carldergross.tweaksmod.materials.ModMaterials.diorite;
import static carldergross.tweaksmod.materials.ModMaterials.granite;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items ={
                new ItemGenericSword("diorite_sword","swordDiorite",diorite),
                new ItemGenericPickaxe("diorite_pickaxe", "pickaxeDiorite", diorite),
                new ItemGenericAxe("diorite_axe", "axeDiorite",diorite,8f,-3.2f),
                new ItemGenericShovel("diorite_shovel","shovelDiorite",diorite),
                new ItemGenericHoe("diorite_hoe","hoeDiorite",diorite),

                new ItemGenericSword("andesite_sword","swordAndesite",andesite),
                new ItemGenericPickaxe("andesite_pickaxe", "pickaxeAndesite", andesite),
                new ItemGenericAxe("andesite_axe", "axeAndesite",andesite,8f,-3.2f),
                new ItemGenericShovel("andesite_shovel","shovelAndesite",andesite),
                new ItemGenericHoe("andesite_hoe","hoeAndesite",andesite),

                new ItemGenericSword("granite_sword","swordGranite",granite),
                new ItemGenericPickaxe("granite_pickaxe", "pickaxeGranite", granite),
                new ItemGenericAxe("granite_axe", "axeGranite",granite,8f,-3.2f),
                new ItemGenericShovel("granite_shovel","shovelGranite",granite),
                new ItemGenericHoe("granite_hoe","hoeGranite",granite),

                new ItemGenericMaterial("chain_link","linkChain"),
                new ItemGenericMaterial("chain_panel","panelChain")
        };
        event.getRegistry().registerAll(items);
    }
}