package thelm.oredictinit.registry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class GalacticraftCore {

	protected static void ore() {
		try {
			Block thing = OreDictRegisCore.getBlock("GalacticraftCore","tile.fallenMeteor");
            OreDictionary.registerOre("oreMeteoricIron", new ItemStack(thing, 1, 0));
		}
		catch(Exception e) {
            e.printStackTrace();
        }
		
		try {
			Block thing = OreDictRegisCore.getBlock("GalacticraftCore","tile.gcBlockCore");
            OreDictionary.registerOre("blockMeteoricIron", new ItemStack(thing, 1, 12));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
