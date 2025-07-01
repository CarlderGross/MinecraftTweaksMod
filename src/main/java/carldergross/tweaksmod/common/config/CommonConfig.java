package carldergross.tweaksmod.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	
	public static final ForgeConfigSpec.ConfigValue<Boolean> CHAINMAIL_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> WOOL_STRING_ENABLED;
	//public static final ForgeConfigSpec.ConfigValue<Boolean> STONE_TOOLS_ENABLED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> THREE_SHROOM_STEW_ENABLED;
	
	static {
		BUILDER.push("carldertweaks-config");
		//STONE_TOOLS_ENABLED = BUILDER.comment("Andesite, diorite, and granite tool recipes").define("alt-stone-tools", true);
		CHAINMAIL_ENABLED = BUILDER.comment("Make chainmail craftable").define("chainmail-crafting", true);
		WOOL_STRING_ENABLED = BUILDER.comment("Craft wool into string").define("wool-to-string", true);
		THREE_SHROOM_STEW_ENABLED = BUILDER.comment("Craft mushroom stew from three mushrooms of the same type").define("three-shroom-stew", true);
		
		BUILDER.pop();
		SPEC = BUILDER.build();
	}
}