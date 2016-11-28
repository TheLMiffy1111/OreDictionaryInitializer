package thelm.oredictinitverlater.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thelm.oredictinitverlater.Woodchopper;

public class Elysium {
	protected static void ore() {
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.blockCobalt");
			OreDictionary.registerOre("blockCobalt", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.blockSilicon");
			OreDictionary.registerOre("blockSilicon", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.blockCobalt");
			OreDictionary.registerOre("blockCobalt", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.blockSulphur");
			OreDictionary.registerOre("blockSulfur", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.blockTourmaline");
			OreDictionary.registerOre("blockTourmaline", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.blockJade");
			OreDictionary.registerOre("blockJade", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.blockIridium");
			OreDictionary.registerOre("blockIridium", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.blockCobalt");
			OreDictionary.registerOre("blockCobalt", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.oreSulphur");
			OreDictionary.registerOre("oreSulfur", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("elysium","tile.blockBeryl");
			OreDictionary.registerOre("blockBeryl", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("elysium","item.elysium_sulphur");
			OreDictionary.registerOre("dustSulfur", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("elysium","item.ingotIridium");
			OreDictionary.registerOre("ingotIridium", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("elysium","item.siliconchunk");
			OreDictionary.registerOre("gemSilicon", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("elysium","item.ingotCobalt");
			OreDictionary.registerOre("ingotCobalt", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("elysium","item.tourmaline");
			OreDictionary.registerOre("gemTourmaline", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("elysium","item.jade");
			OreDictionary.registerOre("gemJade", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("elysium","item.ingotTooth");
			OreDictionary.registerOre("ingotTooth", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("elysium","item.beryl");
			OreDictionary.registerOre("gemBeryl", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
	}
}
