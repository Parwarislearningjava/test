package ch.parwar.parwarmod.core.init;

import ch.parwar.parwarmod.ParwarMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Iteminit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ParwarMod.MOD_ID);
    public static final RegistryObject<Item> FEUER_KUGEL = ITEMS.register("feuer_kugel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
