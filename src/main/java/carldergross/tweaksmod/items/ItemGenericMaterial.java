package carldergross.tweaksmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGenericMaterial extends Item {
    public ItemGenericMaterial(String registryName, String unlocalizedName) {
        setRegistryName(registryName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabs.MATERIALS);
    }
}
