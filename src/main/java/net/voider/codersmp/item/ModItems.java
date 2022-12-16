package net.voider.codersmp.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.voider.codersmp.CoderSmp;

public class ModItems {

    public  static final Item FUNNY_BLOCK = registerItem("funny_block",
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(CoderSmp.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CoderSmp.LOGGER.debug("Registering Mod Items for" + CoderSmp.MOD_ID);

    }
}
