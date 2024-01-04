package me.dinax.deberes.deberes;

import me.dinax.deberes.deberes.creative_tab.CreativeTabController;
import me.dinax.deberes.deberes.item.ItemController;

public class DeberesDeRest
{
	public static final String MOD_ID = "deberes";

	public static void init() {
		ItemController.register();
		CreativeTabController.register();
	}
}
