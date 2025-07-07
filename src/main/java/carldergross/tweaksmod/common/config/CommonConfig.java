package carldergross.tweaksmod.common.config;

import java.util.HashMap;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	
	public static final HashMap<String, ForgeConfigSpec.ConfigValue<Boolean>> CONFIG_FLAGS = new HashMap<String, ForgeConfigSpec.ConfigValue<Boolean>>();
	
	private static void addConfigFlag(String flag, boolean default_value) {
		CONFIG_FLAGS.put(flag, BUILDER.define(flag, default_value));
	}
	
	static {
		BUILDER.push("carldertweaks-config");
		
		BUILDER.comment("Make chainmail craftable");
		addConfigFlag("chainmail_crafting", true);
		BUILDER.comment("Craft wool into string");
		addConfigFlag("wool_to_string", true);
		BUILDER.comment("Craft mushroom stew from three mushrooms of the same type");
		addConfigFlag("three_shroom_stew", true);
		
		BUILDER.pop();
		SPEC = BUILDER.build();
	}
}