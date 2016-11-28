package thelm.oredictinitverlater;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import thelm.oredictinitverlater.config.ConfigHandler;
import thelm.oredictinitverlater.lib.Compat;
import thelm.oredictinitverlater.lib.Reference;
import thelm.oredictinitverlater.registry.OreDictRegisCore;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER, dependencies = Reference.DEPENDENCIES, guiFactory = Reference.GUI_FACTORY_CLASS)
public class OreDictInit {
	
	@Instance
	public static OreDictInit instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {	

		Woodchopper.debug("Generating and Registering Config File");
		ConfigHandler.INSTANCE.preInit(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(ConfigHandler.INSTANCE);
		MinecraftForge.EVENT_BUS.register(this);
		
		Woodchopper.debug("Registering Compats");
		Compat.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	
		Woodchopper.info("Initializing...");
		
		OreDictRegisCore.yayCompat();	
		OreDictRegisCore.yayCustom();
		
		Woodchopper.info("Done!");
	}
}
