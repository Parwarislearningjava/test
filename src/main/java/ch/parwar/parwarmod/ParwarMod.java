package ch.parwar.parwarmod;

import ch.parwar.parwarmod.core.init.Iteminit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;


@Mod(ParwarMod.MOD_ID)
public class ParwarMod {
    private static final Logger LOGGER = (Logger) LogManager.getLogger();
    public static final String MOD_ID = "parwarmod";
    public ParwarMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Iteminit.ITEMS.register(bus);
    }
}
