package carldergross.tweaksmod.common.config;

import com.google.gson.JsonObject;

import carldergross.tweaksmod.TweaksMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class ConfigCondition implements ICondition {
	private static final ResourceLocation NAME = new ResourceLocation(TweaksMod.MODID, "config_flag");
	
	//private static String CONDITION_ID = "three_shroom_stew";
	//TODO: make this into a more generic checker for any config value

	String configFlag;
	public ConfigCondition(String targetflag) {
		this.configFlag = targetflag;
	}
	
	public ResourceLocation getID() {
		return NAME;
	}

	public boolean test(IContext context) {
		return CommonConfig.CONFIG_FLAGS.get(configFlag).get();
	}
	
	public static class Serializer implements IConditionSerializer<ConfigCondition> {
		public static final Serializer INSTANCE = new Serializer();
		
		public ResourceLocation getID() {
			return NAME;
		}

		public void write(JsonObject json, ConfigCondition value) {
			json.addProperty("flag", value.configFlag);
		}

		public ConfigCondition read(JsonObject json) {
			return new ConfigCondition(json.get("flag").getAsString());
		}
		
	}
}