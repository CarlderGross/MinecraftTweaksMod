package carldergross.tweaksmod.common.config;

import com.google.gson.JsonObject;

import carldergross.tweaksmod.TweaksMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class ConfigCondition implements ICondition {
	private static final ResourceLocation NAME = new ResourceLocation(TweaksMod.MODID, "three_shroom_stew");
	
	private static String CONDITION_ID = "three_shroom_stew";
	//TODO: make this into a more generic checker for any config value

	public ResourceLocation getID() {
		return NAME;
	}

	public boolean test(IContext context) {
		return CommonConfig.THREE_SHROOM_STEW_ENABLED.get();
	}
	
	public static class Serializer implements IConditionSerializer<ConfigCondition> {
		public static final Serializer INSTANCE = new Serializer();
		
		public ResourceLocation getID() {
			return NAME;
		}

		public void write(JsonObject json, ConfigCondition value) {
			//nothing to write, currently
		}

		public ConfigCondition read(JsonObject json) {
			return new ConfigCondition();
		}
		
	}
}