package creative_tab;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import item.ItemController;
import me.dinax.deberes.deberes.DeberesDeRest;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabController {
    public static final DeferredRegister<CreativeModeTab> TabRegister = DeferredRegister.create(DeberesDeRest.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> DeberesTab = TabRegister.register(
            "tab_deberes",
            () -> {
                return CreativeTabRegistry.create(
                        Component.translatable("itemGroup." + DeberesDeRest.MOD_ID + ".tab_deberes"),
                        () ->{
                            return new ItemStack(ItemController.DualScreenConsole.get());
                        }
                );
            }
    );
    public static void register(){
        TabRegister.register();
    }
}
