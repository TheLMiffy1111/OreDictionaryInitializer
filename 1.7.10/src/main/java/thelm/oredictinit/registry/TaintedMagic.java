package thelm.oredictinit.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class TaintedMagic {
	protected static void ore() {
			try {
 				Item thing = OreDictRegisCore.getItem("TaintedMagic","ItemMaterial");
                OreDictionary.registerOre("ingotShadow", new ItemStack(thing, 1, 0));
 			}
 			catch(Throwable e) {
                e.printStackTrace();
 			}
			
			try {
				Block thing = OreDictRegisCore.getBlock("TaintedMagic","BlockShadowOre");
                OreDictionary.registerOre("oreShadow", new ItemStack(thing, 1, 0));
			}
 			catch(Exception e) {
                e.printStackTrace();
 			}
			
			try {
				Block thing = OreDictRegisCore.getBlock("TaintedMagic","BlockShadowmetal");
                OreDictionary.registerOre("blockShadow", new ItemStack(thing, 1, 0));
			}
 			catch(Exception e) {
                e.printStackTrace();
 			}
	}
}
