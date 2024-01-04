package item;

import creative_tab.CreativeTabController;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.dinax.deberes.deberes.DeberesDeRest;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;

public class ItemController {
    public static final DeferredRegister<Item> ItemRegister = DeferredRegister.create(DeberesDeRest.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> DualScreenConsole = ItemRegister.register(
            "dual_screen_console",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).arch$tab(CreativeTabController.DeberesTab).stacksTo(4))
    );
    public static final RegistrySupplier<Item> Stylus = ItemRegister.register(
            "stylus",
            () -> new Item(new Item.Properties().arch$tab(CreativeTabController.DeberesTab))
    );
    public static final RegistrySupplier<Item> DualAxe = ItemRegister.register(
            "dual_axe",
            () -> new AxeItem(Tiers.NETHERITE, 10, 10, new Item.Properties().arch$tab(CreativeTabController.DeberesTab))
    );
    public static void register(){
        ItemRegister.register();
    }
}
