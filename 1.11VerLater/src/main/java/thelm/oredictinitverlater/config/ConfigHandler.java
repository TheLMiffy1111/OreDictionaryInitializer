package thelm.oredictinitverlater.config;

import java.io.File;
import java.util.HashSet;
import java.util.Set;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thelm.oredictinitverlater.lib.Data;
import thelm.oredictinitverlater.lib.Reference;

public class ConfigHandler {
	
	public static ConfigHandler INSTANCE = new ConfigHandler();
	public Configuration configFile;
	public Set<String> usedCategories = new HashSet<String>();
	public static int lines;
	
	//Nothing to see here yet :D
	
	public void preInit(File file) {
		configFile = new Configuration(file, true);
		
		initLines();
		initThing();
		initCompat();
		usedCategories.add("Custom");
		usedCategories.add("Compat");
	}	
	
	private void initLines() {
		
		lines = getIntegerWithComment("Custom", "amountlines", 1, "Lines of block/item entries");
		
		if (configFile.hasChanged())
			configFile.save();
	}
	
	private void initThing() {
		
		Data.definedThingyBlocks[0] = getStringWithComment("Custom", "blocks0", "", "Format: oreDictEntry,modID,Block,damageValue;oreDictEntry,modID,Block,damageValue;etc.");
		Data.definedThingyItems[0] = getStringWithComment("Custom", "items0", "", "Format: oreDictEntry,modID,Item,damageValue;oreDictEntry,modID,Item,damageValue;etc.");
		
		for(int i = 1; i < lines; i++){
			Data.definedThingyBlocks[i] = getString("Custom", "blocks" + Integer.toString(i), "");
			Data.definedThingyItems[i] = getString("Custom", "items" + Integer.toString(i), "");
		}
		
		if (configFile.hasChanged())
			configFile.save();
	}
	
	private void initCompat() {
		
		//Nothing to see here yet :D
		
		if (configFile.hasChanged())
			configFile.save();
	}
	
	private String getString(String category, String name, String def) {
		return configFile.get(category, name, def).setRequiresMcRestart(true).getString();
	}
	
	private String getStringWithComment(String category, String name, String def, String comment) {
		return configFile.get(category, name, def, comment).setRequiresMcRestart(true).getString();
	}
	
	private int getIntegerWithComment(String category, String name, int def, String comment) {
		return configFile.get(category, name, def, comment).setRequiresMcRestart(true).getInt(def);
	}
	
	private boolean getBoolean(String category, String name, boolean def) {
		return configFile.get(category, name, def).setRequiresMcRestart(true).getBoolean(def);
	}
	
	private boolean getBooleanWithComment(String category, String name, boolean def, String comment) {
		return configFile.get(category, name, def, comment).setRequiresMcRestart(true).getBoolean(def);
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (Reference.MOD_ID.equals(eventArgs.getModID())) {
			configFile.load();
			
			initLines();
			initThing();
			initCompat();
		}
	}
}
