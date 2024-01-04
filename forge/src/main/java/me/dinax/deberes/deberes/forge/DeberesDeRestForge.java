package me.dinax.deberes.deberes.forge;

import dev.architectury.platform.forge.EventBuses;
import me.dinax.deberes.deberes.DeberesDeRest;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DeberesDeRest.MOD_ID)
public class DeberesDeRestForge {
    public DeberesDeRestForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(DeberesDeRest.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        DeberesDeRest.init();
    }
}