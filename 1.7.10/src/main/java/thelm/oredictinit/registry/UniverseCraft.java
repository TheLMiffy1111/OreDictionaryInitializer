package thelm.oredictinit.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thelm.oredictinit.Woodchopper;

public class UniverseCraft {
	protected static void ore() {
		try {
			Block thing = OreDictRegisCore.getBlock("universeCraft","MetadataBlocks");
			OreDictionary.registerOre("blockCondensed", new ItemStack(thing, 1, 0));
			OreDictionary.registerOre("blockSingularium", new ItemStack(thing, 1, 1));
			OreDictionary.registerOre("oreCondensed", new ItemStack(thing, 1, 2));
			OreDictionary.registerOre("oreSingularium", new ItemStack(thing, 1, 3));
			OreDictionary.registerOre("blockDarkMatter", new ItemStack(thing, 1, 8));
			OreDictionary.registerOre("blockPaper", new ItemStack(thing, 1, 10));
			OreDictionary.registerOre("blockBlackholium", new ItemStack(thing, 1, 13));
			OreDictionary.registerOre("blockBlackholiumEnergized", new ItemStack(thing, 1, 14));
			OreDictionary.registerOre("blockDarkMatterRefined", new ItemStack(thing, 1, 15));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("universeCraft","MetadataBlocks2");
			OreDictionary.registerOre("orePalladium", new ItemStack(thing, 1, 8));
			OreDictionary.registerOre("oreRhodium", new ItemStack(thing, 1, 9));
			OreDictionary.registerOre("oreZirconium", new ItemStack(thing, 1, 10));
			OreDictionary.registerOre("blockPalladium", new ItemStack(thing, 1, 11));
			OreDictionary.registerOre("blockRhodium", new ItemStack(thing, 1, 12));
			OreDictionary.registerOre("blockZirconium", new ItemStack(thing, 1, 13));
		}
		catch(Exception e) {
			Woodchopper.warn(e.getMessage());
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("universeCraft","Particle");
			OreDictionary.registerOre("ingotCondensed", new ItemStack(thing, 1, 0));
			OreDictionary.registerOre("ingotSingularium", new ItemStack(thing, 1, 1));
			OreDictionary.registerOre("ingotBlackholium", new ItemStack(thing, 1, 42));
			OreDictionary.registerOre("ingotBlackholiumEnergized", new ItemStack(thing, 1, 45));
			OreDictionary.registerOre("ingotPalladium", new ItemStack(thing, 1, 57));
			OreDictionary.registerOre("ingotRhodium", new ItemStack(thing, 1, 58));
			OreDictionary.registerOre("ingotZirconium", new ItemStack(thing, 1, 59));
		}
		catch(Throwable e) {
			Woodchopper.warn(e.getMessage());
		}
	}
}
