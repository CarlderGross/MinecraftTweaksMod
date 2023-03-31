package carldergross.tweaksmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemGenericShovel extends ItemSpade {
    public ItemGenericShovel(String registryName, String unlocalizedName, ToolMaterial material) {
        super(material);
        setRegistryName(registryName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
