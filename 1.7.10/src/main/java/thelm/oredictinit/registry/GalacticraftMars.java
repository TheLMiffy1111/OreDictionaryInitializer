package thelm.oredictinit.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class GalacticraftMars {
	protected static void ore() {
			try {
 				Item thing = OreDictRegisCore.getItem("GalacticraftMars","item.null");
                OreDictionary.registerOre("ingotDesh", new ItemStack(thing, 1, 2));
 			}
 			catch(Throwable e) {
                e.printStackTrace();
 			}
 			
 			try {
 				Block thing = OreDictRegisCore.getBlock("GalacticraftMars","tile.mars");
                OreDictionary.registerOre("blockDesh", new ItemStack(thing, 1, 8));
 			}
 			catch(Exception e) {
                e.printStackTrace();
 			}
 			
 			try {
 				Block thing = OreDictRegisCore.getBlock("GalacticraftMars","tile.asteroidsBlock");
                OreDictionary.registerOre("oreTitanium", new ItemStack(thing, 1, 4));
 			}
 			catch(Exception e) {
                e.printStackTrace();
 			}
	}
}
