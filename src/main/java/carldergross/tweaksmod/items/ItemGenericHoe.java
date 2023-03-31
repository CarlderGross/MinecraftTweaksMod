package carldergross.tweaksmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemGenericHoe extends ItemHoe {
    public ItemGenericHoe(String registryName, String unlocalizedName, ToolMaterial material) {
        super(material);
        setRegistryName(registryName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
