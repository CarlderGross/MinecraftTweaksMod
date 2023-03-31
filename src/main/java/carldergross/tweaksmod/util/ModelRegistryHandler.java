package carldergross.tweaksmod.util;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import static carldergross.tweaksmod.init.ModItems.*;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(diorite_pickaxe);
        registerModel(diorite_sword);
        registerModel(diorite_axe);
        registerModel(diorite_shovel);
        registerModel(diorite_hoe);

        registerModel(andesite_pickaxe);
        registerModel(andesite_axe);
        registerModel(andesite_sword);
        registerModel(andesite_shovel);
        registerModel(andesite_hoe);

        registerModel(granite_pickaxe);
        registerModel(granite_axe);
        registerModel(granite_shovel);
        registerModel(granite_sword);
        registerModel(granite_hoe);

        registerModel(chain_link);
        registerModel(chain_panel);
    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
