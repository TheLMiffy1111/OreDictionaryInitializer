package thelm.oredictinit.registry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class GalaxySpace {
	protected static void ore() {
		try {
			Block thing = OreDictRegisCore.getBlock("GalaxySpace","ganymedeblocks");
            OreDictionary.registerOre("oreTitanium", new ItemStack(thing, 1, 3));
		}
		catch(Exception e) {
            e.printStackTrace();
		}
	}
}
