package thelm.oredictinit.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thelm.oredictinit.Woodchopper;

public class GalaxySpace {
	protected static void ore() {
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","ioblocks");
			OreDictionary.registerOre("oreSulfur", new ItemStack(thing, 1, 6));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}		
		
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","ganymedeblocks");
			OreDictionary.registerOre("oreTitanium", new ItemStack(thing, 1, 3));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","barnardaClog");
			OreDictionary.registerOre("logWood", new ItemStack(thing, 1, 3));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","metalsblock");
			OreDictionary.registerOre("blockLead", new ItemStack(thing, 1, 0));
			OreDictionary.registerOre("blockAdamantite", new ItemStack(thing, 1, 1));
			OreDictionary.registerOre("blockCobaltum", new ItemStack(thing, 1, 2));
			OreDictionary.registerOre("blockMagnesium", new ItemStack(thing, 1, 3));
			OreDictionary.registerOre("blockMithril", new ItemStack(thing, 1, 4));
			OreDictionary.registerOre("blockNickel", new ItemStack(thing, 1, 5));
			OreDictionary.registerOre("blockOriharukon", new ItemStack(thing, 1, 6));
			OreDictionary.registerOre("blockPlatinum", new ItemStack(thing, 1, 7));
			OreDictionary.registerOre("blockTungsten", new ItemStack(thing, 1, 8));
			OreDictionary.registerOre("blockCopper", new ItemStack(thing, 1, 9));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","enceladusglowstone");
			OreDictionary.registerOre("glowstone", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","plutoglowstone");
			OreDictionary.registerOre("glowstone", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","ioglowstone");
			OreDictionary.registerOre("glowstone", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","proteusglowstone");
			OreDictionary.registerOre("glowstone", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","ceresglowstone");
			OreDictionary.registerOre("glowstone", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("GalaxySpace","item.GlowstoneDusts");
			OreDictionary.registerOre("dustGlowstone", new ItemStack(thing, 1, 0));
			OreDictionary.registerOre("dustGlowstone", new ItemStack(thing, 1, 1));
			OreDictionary.registerOre("dustGlowstone", new ItemStack(thing, 1, 2));
			OreDictionary.registerOre("dustGlowstone", new ItemStack(thing, 1, 3));
			OreDictionary.registerOre("dustGlowstone", new ItemStack(thing, 1, 4));
		}
		catch(Exception e) {
			Woodchopper.warn(e.toString());
		}
	}
}
