package thelm.oredictinit.registry;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thelm.oredictinit.Woodchopper;
import thelm.oredictinit.lib.Compat;
import thelm.oredictinit.OreDictInit;

public class OreDictRegisCore {
	
	public static void yayCompat() {
		
		if(Compat.GC) {
			Woodchopper.log(Level.INFO, "Loading GalacticraftCore Compat");
			GalacticraftCore.ore();
		}
		
		if(Compat.GCM) {	
			Woodchopper.log(Level.INFO, "Loading GalacticraftMars Compat");
			GalacticraftMars.ore();
		}
		
		if(Compat.GS) {
			Woodchopper.log(Level.INFO, "Loading GalaxySpace Compat");
			GalaxySpace.ore();
		}
		
		if(Compat.TM) {			
			Woodchopper.log(Level.INFO, "Loading TaintedMagic Compat");
			TaintedMagic.ore();
		}
		
		if(Compat.UC) {
			Woodchopper.log(Level.INFO, "Loading UniverseCraft Compat");
			UniverseCraft.ore();
		}
	}
	
	public static void yayCustom() {
		for(String custom : OreDictInit.definedThingyBlocks.split(";")) {
			String[] data = custom.trim().split("-");
			if(data.length == 4){
				addCustomEntryB(data[0], data[1], data[2], data[3]);				
			}			
		}
		
		for(String custom : OreDictInit.definedThingyItems.split(";")) {
			String[] data = custom.trim().split("-");
			if(data.length == 4){
				addCustomEntryI(data[0], data[1], data[2], data[3]);				
			}			
		}
	}
	
	public static void addCustomEntryB(String entry, String mod, String block, String damage) {
		
		Integer dam = Integer.parseInt(damage);
		
		try {
			Block thing = getBlock(mod,block);
			OreDictionary.registerOre(entry, new ItemStack(thing, 1, dam));
		}
		catch(Throwable e) {
			Woodchopper.log(Level.INFO, "Entry " + entry + "-" + mod + "-" + block + "-" + damage + " has errored.");
			e.printStackTrace();
		}
	}
	
	public static void addCustomEntryI(String entry, String mod, String item, String damage) {
		
		Integer dam = Integer.parseInt(damage);
		
		try {
			Item thing = getItem(mod,item);
			OreDictionary.registerOre(entry, new ItemStack(thing, 1, dam));
		}
		catch(Throwable e) {
			Woodchopper.log(Level.INFO, "Entry " + entry + "-" + mod + "-" + item + "-" + damage + " has errored.");
			e.printStackTrace();
		}
	}
	
	public static Block getBlock(String mod, String block) throws ItemNotFoundException {
		Block target = GameRegistry.findBlock(mod, block);
		if(target == null)
			throw new ItemNotFoundException(mod, block);
		return target;
	}
	
	public static Item getItem(String mod, String item) throws ItemNotFoundException {
		Item target = GameRegistry.findItem(mod, item);
		if(target == null)
			throw new ItemNotFoundException(mod, item);
		return target;
	}
	
	public static class ItemNotFoundException extends Exception {
		public ItemNotFoundException(String mod, String item) {
			super("Unable to find " + item + " in mod " + mod);
		}
	}
}
