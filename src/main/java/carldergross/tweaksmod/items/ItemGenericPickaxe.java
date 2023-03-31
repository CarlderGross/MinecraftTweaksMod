package carldergross.tweaksmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemGenericPickaxe extends ItemPickaxe {
    public ItemGenericPickaxe(String registryName, String unlocalizedName, ToolMaterial material) {
        super(material);
        setRegistryName(registryName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
