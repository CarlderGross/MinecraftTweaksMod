package carldergross.tweaksmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemGenericSword extends ItemSword {

    public ItemGenericSword(String registryName, String unlocalizedName, ToolMaterial material) {
        super(material);
        setRegistryName(registryName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabs.COMBAT);
    }
}
