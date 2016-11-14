package thelm.oredictinit.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class UniverseCraft {
	protected static void ore() {
		try {
			Item thing = OreDictRegisCore.getItem("universeCraft","Particle");
			OreDictionary.registerOre("ingotCondensed", new ItemStack(thing, 1, 0));
			OreDictionary.registerOre("ingotSingularium", new ItemStack(thing, 1, 1));
			OreDictionary.registerOre("atomsHelium", new ItemStack(thing, 1, 4));
			OreDictionary.registerOre("atomsHydrogen", new ItemStack(thing, 1, 5));
			OreDictionary.registerOre("atomsAnimatterContained", new ItemStack(thing, 1, 8));
			OreDictionary.registerOre("atomsDiamond", new ItemStack(thing, 1, 9));
			OreDictionary.registerOre("atomsCarbonLattice", new ItemStack(thing, 1, 9));
			OreDictionary.registerOre("atomsGold", new ItemStack(thing, 1, 10));
			OreDictionary.registerOre("atomsEmerald", new ItemStack(thing, 1, 11));
			OreDictionary.registerOre("atomsBeryl", new ItemStack(thing, 1, 11));
			OreDictionary.registerOre("atomsIron", new ItemStack(thing, 1, 12));
			OreDictionary.registerOre("atomsLapis", new ItemStack(thing, 1, 13));
			OreDictionary.registerOre("atomsLazurite", new ItemStack(thing, 1, 13));
			OreDictionary.registerOre("atomsRedstone", new ItemStack(thing, 1, 14));
			OreDictionary.registerOre("atomsQuartz", new ItemStack(thing, 1, 15));
			OreDictionary.registerOre("atomsSiliconDioxide", new ItemStack(thing, 1, 15));
			OreDictionary.registerOre("atomsCondensed", new ItemStack(thing, 1, 16));
			OreDictionary.registerOre("atomsSingularium", new ItemStack(thing, 1, 17));
			OreDictionary.registerOre("atomsCoal", new ItemStack(thing, 1, 18));
			OreDictionary.registerOre("atomsCarbon", new ItemStack(thing, 1, 18));
			OreDictionary.registerOre("atomsAntimatter", new ItemStack(thing, 1, 19));
			OreDictionary.registerOre("atomsDarkMatter", new ItemStack(thing, 1, 26));
			OreDictionary.registerOre("atomsDarkMatterRefined", new ItemStack(thing, 1, 28));
			OreDictionary.registerOre("ingotBlackholium", new ItemStack(thing, 1, 42));
			OreDictionary.registerOre("ingotBlackholiumEnergized", new ItemStack(thing, 1, 45));
			OreDictionary.registerOre("ingotPalladium", new ItemStack(thing, 1, 57));
			OreDictionary.registerOre("ingotRhodium", new ItemStack(thing, 1, 58));
			OreDictionary.registerOre("ingotZirconium", new ItemStack(thing, 1, 59));
		}
		catch(Throwable e) {
            e.printStackTrace();
		}
		
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
			e.printStackTrace();
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
			e.printStackTrace();
		}
	}
}
