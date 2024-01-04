package me.dinax.deberes.deberes.fabric;

import me.dinax.deberes.deberes.DeberesDeRest;
import net.fabricmc.api.ModInitializer;

public class DeberesDeRestFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DeberesDeRest.init();
    }
}