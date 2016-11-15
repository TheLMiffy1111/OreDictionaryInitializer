package thelm.oredictinit.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ShinColle {
	protected static void ore() {
		try {
			Block thing = OreDictRegisCore.getBlock("shincolle","BlockPolymetal");
			OreDictionary.registerOre("blockManganese", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("shincolle","BlockAbyssium");
			OreDictionary.registerOre("blockAbyssium", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("shincolle","BlockPolymetalOre");
			OreDictionary.registerOre("oreManganese", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("shincolle","BlockGrudge");
			OreDictionary.registerOre("blockGrudge", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Block thing = OreDictRegisCore.getBlock("shincolle","BlockGrudgeHeavy");
			OreDictionary.registerOre("blockGrudgeHeavy", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("shincolle","Grudge");
			OreDictionary.registerOre("dustGrudge", new ItemStack(thing, 1, 0));
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("shincolle","AbyssNugget");
			OreDictionary.registerOre("nuggetAbyssium", new ItemStack(thing, 1, 0));
			OreDictionary.registerOre("dustTinyManganese", new ItemStack(thing, 1, 1));			
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		
		try {
			Item thing = OreDictRegisCore.getItem("shincolle","AbyssMetal");
			OreDictionary.registerOre("ingotAbyssium", new ItemStack(thing, 1, 0));
			OreDictionary.registerOre("dustManganese", new ItemStack(thing, 1, 1));
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
}
