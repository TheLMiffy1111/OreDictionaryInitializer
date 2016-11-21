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
		Woodchopper.info("Loading Custom Block Entries");
		for(String custom : OreDictInit.definedThingyBlocks.split(";")) {
			String[] rawData = custom.trim().split(",");
			if(rawData.length == 4) {
				String[] entries = rawData[0].split("\\+");
				String[] damageValues = rawData[3].split("\\+");
				if(entries.length == damageValues.length) {
					for(int i = 0; i < entries.length; i++) {
						try {
							Integer.parseInt(damageValues[i]);
						}
						catch(Throwable e) {
							Woodchopper.warn("Entry " + entries[i] + "," + rawData[1] + "," + rawData[2] + "," + damageValues[i] + " has errored.");
							Woodchopper.warn(e.toString());
							break;
						}
						addCustomEntryB(entries[i].trim(), rawData[1].trim(), rawData[2].trim(), damageValues[i]);
					}
				}
			}			
		}
		
		Woodchopper.info("Loading Custom Item Entries");
		for(String custom : OreDictInit.definedThingyItems.split(";")) {
			String[] rawData = custom.trim().split(",");
			if(rawData.length == 4) {
				String[] entries = rawData[0].trim().split("\\+");
				String[] damageValues = rawData[3].trim().split("\\+");
				if(entries.length == damageValues.length) {
					for(int i = 0; i < entries.length; i++) {
						try {
							Integer.parseInt(damageValues[i]);
						}
						catch(Throwable e) {
							Woodchopper.warn("Entry " + entries[i] + "," + rawData[1] + "," + rawData[2] + "," + damageValues[i] + " has errored.");
							Woodchopper.warn(e.toString());						
							break;
						}
						addCustomEntryI(entries[i].trim(), rawData[1].trim(), rawData[2].trim(), damageValues[i].trim());
					}
				}
			}	
		}
	}
	
	public static void addCustomEntryB(String entry, String mod, String block, String damage) {
		
		int dam = Integer.parseInt(damage);
		
		try {
			Block thing = getBlock(mod,block);
			OreDictionary.registerOre(entry, new ItemStack(thing, 1, dam));
		}
		catch(Throwable e) {
			Woodchopper.warn("Entry " + entry + "," + mod + "," + block + "," + damage + " has errored.");
			Woodchopper.warn(e.toString());
		}
	}
	
	public static void addCustomEntryI(String entry, String mod, String item, String damage) {
		
		int dam = Integer.parseInt(damage);
		
		try {
			Item thing = getItem(mod,item);
			OreDictionary.registerOre(entry, new ItemStack(thing, 1, dam));
		}
		catch(Throwable e) {
			Woodchopper.warn("Entry " + entry + "," + mod + "," + item + "," + damage + " has errored.");
			Woodchopper.warn(e.toString());
		}
	}
	
	public static Block getBlock(String mod, String block) throws BlockNotFoundException {
		Block target = GameRegistry.findBlock(mod, block);
		if(target == null)
			throw new BlockNotFoundException(mod, block);
		return target;
	}
	
	public static Item getItem(String mod, String item) throws ItemNotFoundException {
		Item target = GameRegistry.findItem(mod, item);
		if(target == null)
			throw new ItemNotFoundException(mod, item);
		return target;
	}
	
	public static class BlockNotFoundException extends Exception {
		public BlockNotFoundException(String mod, String item) {
			super("Unable to find block \"" + mod + ":" + item + "\". Either it doesn't exist or is a poorly registered block.");
		}
	}
	
	public static class ItemNotFoundException extends Exception {
		public ItemNotFoundException(String mod, String item) {
			super("Unable to find item \"" + mod + ":" + item + "\". Either it doesn't exist or is a poorly registered item.");
		}
	}
}
