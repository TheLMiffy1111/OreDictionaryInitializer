package thelm.oredictinit;

import org.apache.logging.log4j.Level;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
		MinecraftForge.EVENT_BUS.register(ConfigHandler.INSTANCE);
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
