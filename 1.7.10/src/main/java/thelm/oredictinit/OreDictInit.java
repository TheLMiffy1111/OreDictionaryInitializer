package thelm.oredictinit;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import thelm.oredictinit.config.ConfigHandler;
import thelm.oredictinit.lib.Compat;
import thelm.oredictinit.lib.Reference;
import thelm.oredictinit.registry.OreDictRegisCore;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER, dependencies = Reference.DEPENDENCIES, guiFactory = Reference.GUI_FACTORY_CLASS)
public class OreDictInit {

	public static String definedThingyBlocks;
	public static String definedThingyItems;
	
	@Instance
	public static OreDictInit instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Woodchopper.info("Initializing...");
		
		Woodchopper.debug("Generating and Registering Config File");
		ConfigHandler.INSTANCE.preInit(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(ConfigHandler.INSTANCE);
		MinecraftForge.EVENT_BUS.register(this);
		
		Woodchopper.debug("Registering Compats");
		Compat.init();
		
		OreDictRegisCore.yayCompat();
		OreDictRegisCore.yayCustom();
		
		Woodchopper.info("Done!");
	}
}
