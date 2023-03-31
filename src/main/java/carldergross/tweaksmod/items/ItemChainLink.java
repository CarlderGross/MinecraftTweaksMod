package carldergross.tweaksmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemChainLink extends Item {
    public ItemChainLink(String registryName, String unlocalizedName) {
        setRegistryName(registryName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabs.MATERIALS);
    }
}
