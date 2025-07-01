package carldergross.tweaksmod;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import carldergross.tweaksmod.common.registry.*;
import carldergross.tweaksmod.common.config.*;

@Mod(TweaksMod.MODID)
public class TweaksMod {
    public static final String MODID = "carldertweaks";
    
    public TweaksMod() {
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC, String.format("%s-common-config.toml", MODID));
    	
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	ModItems.ITEMS.register(modEventBus);
    }
}