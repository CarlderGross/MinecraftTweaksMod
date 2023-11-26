package carldergross.tweaksmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import carldergross.tweaksmod.common.registry.*;

@Mod(TweaksMod.MODID)
public class TweaksMod {
    public static final String MODID = "carldertweaks";
    
    public TweaksMod() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	ModItems.ITEMS.register(modEventBus);
    }
}