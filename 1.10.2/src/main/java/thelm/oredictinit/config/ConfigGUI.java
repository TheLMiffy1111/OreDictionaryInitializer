package thelm.oredictinit.config;

import java.util.ArrayList;
import java.util.List;

import thelm.oredictinit.lib.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ConfigGUI extends GuiConfig {
	
	public ConfigGUI(GuiScreen parent) {
		super(parent, getElements(), Reference.MOD_ID, Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.INSTANCE.configFile.toString()));
	}
	
	@SuppressWarnings({"rawtypes"})
	private static List<IConfigElement> getElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		for(String category : ConfigHandler.INSTANCE.usedCategories)
			list.add(categoryElement(category, category, category));
		return list;
	}
	
	private static IConfigElement categoryElement(String category, String name, String tooltip_key) {
		return new DummyConfigElement.DummyCategoryElement(name, tooltip_key, new ConfigElement(ConfigHandler.INSTANCE.configFile.getCategory(category)).getChildElements());
	}
}
