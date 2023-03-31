package carldergross.tweaksmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemGenericAxe extends ItemAxe {
    public ItemGenericAxe(String registryName, String unlocalizedName, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setRegistryName(registryName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
