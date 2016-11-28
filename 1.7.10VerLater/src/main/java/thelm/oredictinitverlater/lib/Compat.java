package thelm.oredictinitverlater.lib;

import cpw.mods.fml.common.Loader;
import thelm.oredictinitverlater.config.ConfigHandler;

public class Compat {
	
	public static boolean EL = false;
	
	public static void init() {
		
		if(Loader.isModLoaded("elysium") && ConfigHandler.EL)
			EL = true;
	}
}
