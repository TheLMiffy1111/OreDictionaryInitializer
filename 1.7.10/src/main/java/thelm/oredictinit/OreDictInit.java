package thelm.oredictinit;

import org.apache.logging.log4j.Level;

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

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER, dependencies = Reference.DEPENDENCIES)
public class OreDictInit {

	public static String definedThingyBlocks;
	public static String definedThingyItems;
	
	@Instance
	public static OreDictInit instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Woodchopper.log(Level.INFO, "ODI is in preInit.");
		
		ConfigHandler.INSTANCE.preInit(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(ConfigHandler.INSTANCE);
		MinecraftForge.EVENT_BUS.register(this);
		
		Compat.init();
		
		OreDictRegisCore.yayCompat();
		OreDictRegisCore.yayCustom();
		
		Woodchopper.log(Level.INFO, "ODI is out of preInit.");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
}
