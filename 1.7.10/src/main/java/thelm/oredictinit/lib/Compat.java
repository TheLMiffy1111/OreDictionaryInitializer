package thelm.oredictinit.lib;

import cpw.mods.fml.common.Loader;
import thelm.oredictinit.config.ConfigHandler;

public class Compat {
	
	public static boolean GC = false;
	public static boolean GCM = false;
	public static boolean GS = false;
	public static boolean SC = false;
	public static boolean UC = false;
	
	public static void init() {
		if(Loader.isModLoaded("GalacticraftCore") && ConfigHandler.GC)
			GC = true;
		if(Loader.isModLoaded("GalacticraftMars") && ConfigHandler.GCM)
			GCM = true;
		if(Loader.isModLoaded("GalaxySpace") && ConfigHandler.GS)
			GS = true;
		if(Loader.isModLoaded("shincolle") && ConfigHandler.SC)
			SC = true;		
		if(Loader.isModLoaded("universeCraft") && ConfigHandler.UC)
			UC = true;
	}
}
