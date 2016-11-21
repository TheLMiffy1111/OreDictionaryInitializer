package thelm.oredictinit.config;

import java.io.File;
import java.util.HashSet;
import java.util.Set;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thelm.oredictinit.OreDictInit;
import thelm.oredictinit.lib.Reference;

public class ConfigHandler {
	
	public static ConfigHandler INSTANCE = new ConfigHandler();
	public Configuration configFile;
	public Set<String> usedCategories = new HashSet<String>();
	
	//Nothing to see here yet :D
	
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
		
		//Nothing to see here yet :D
		
		if (configFile.hasChanged())
			configFile.save();
	}
	
	private String getStringWithComment(String category, String name, String def, String comment) {
		return configFile.get(category, name, def, comment).setRequiresMcRestart(true).getString();
	}
	
	private boolean getBoolean(String category, String name, boolean def) {
		return configFile.get(category, name, def).setRequiresMcRestart(true).getBoolean(def);
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (Reference.MOD_ID.equals(eventArgs.getModID())) {
			configFile.load();
			
			initThing();
			initCompat();
		}
	}
}
