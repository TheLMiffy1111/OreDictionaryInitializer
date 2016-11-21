package thelm.oredictinit.config;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import thelm.oredictinit.OreDictInit;
import thelm.oredictinit.lib.Reference;

public class ConfigHandler {
	
	public static ConfigHandler INSTANCE = new ConfigHandler();
	public Configuration configFile;
	public Set<String> usedCategories = new HashSet<String>();
	
	public static boolean GC = true;
	public static boolean GCM = true;
	public static boolean GS = true;
	public static boolean SC = true;
	public static boolean UC = true;
	
	public void preInit(File file) {
		configFile = new Configuration(file, true);
		
		initThing();
		initCompat();
		usedCategories.add("Custom");
		usedCategories.add("Compat");
	}	
	
	private void initThing() {
		
		OreDictInit.definedThingyBlocks = getStringWithComment("Custom", "blocks", "", "Format: oreDictEntry,modID,Block,damageValue;oreDictEntry,modID,Block,damageValue;etc.");
		OreDictInit.definedThingyItems = getStringWithComment("Custom", "items", "", "Format: oreDictEntry,modID,Item,damageValue;oreDictEntry,modID,Item,damageValue;etc.");
		
		if (configFile.hasChanged())
			configFile.save();
	}
	
	private void initCompat() {
		
		GC = getBoolean("Compat", "GalacticraftCore", true);
		GCM = getBoolean("Compat", "GalacticraftMars", true);
		GS = getBoolean("Compat", "GalaxySpace", true);
		SC = getBoolean("Compat", "ShinColle", true);
		UC = getBooleanWithComment("Compat", "UniverseCraft", true, "Will remove when UniverseCraft oreDict entries are added.");
		
		if (configFile.hasChanged())
			configFile.save();
	}
	
	private String getStringWithComment(String category, String name, String def, String comment) {
		return configFile.get(category, name, def, comment).setRequiresMcRestart(true).getString();
	}
	
	private boolean getBoolean(String category, String name, boolean def) {
		return configFile.get(category, name, def).setRequiresMcRestart(true).getBoolean(def);
	}
	
	private boolean getBooleanWithComment(String category, String name, boolean def, String comment) {
		return configFile.get(category, name, def, comment).setRequiresMcRestart(true).getBoolean(def);
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (Reference.MOD_ID.equals(eventArgs.modID)) {
			configFile.load();
			
			initThing();
			initCompat();
		}
	}
}
