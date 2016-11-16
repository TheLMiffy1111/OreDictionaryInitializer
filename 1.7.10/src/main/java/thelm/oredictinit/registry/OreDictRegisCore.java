package thelm.oredictinit.registry;

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
			Woodchopper.info("Loading GalacticraftCore Compat");
			GalacticraftCore.ore();
		}
		
		if(Compat.GCM) {	
			Woodchopper.info("Loading GalacticraftMars Compat");
			GalacticraftMars.ore();
		}
		
		if(Compat.GS) {
			Woodchopper.info("Loading GalaxySpace Compat");
			GalaxySpace.ore();
		}
		
		if(Compat.SC) {
			Woodchopper.info("Loading ShinColle Compat");
			ShinColle.ore();			
		}
		
		if(Compat.UC) {
			Woodchopper.info("Loading UniverseCraft Compat");
			UniverseCraft.ore();
		}
	}
	
	public static void yayCustom() {
		Woodchopper.info("Loading Custom Blocks");
		for(String custom : OreDictInit.definedThingyBlocks.split(";")) {
			String[] data = custom.trim().split("-");
			if(data.length == 4){
				addCustomEntryB(data[0], data[1], data[2], data[3]);				
			}			
		}
		
		Woodchopper.info("Loading Custom Items");
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
			Woodchopper.warn("Entry " + entry + "-" + mod + "-" + block + "-" + damage + " has errored.");
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
			Woodchopper.warn("Entry " + entry + "-" + mod + "-" + item + "-" + damage + " has errored.");
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
			super("Unable to find " + item + " in mod " + mod + ". Either it doesn't exist or is a poorly registered item.");
		}
	}
}
