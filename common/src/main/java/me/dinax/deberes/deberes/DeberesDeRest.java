package me.dinax.deberes.deberes;

import creative_tab.CreativeTabController;
import item.ItemController;

public class DeberesDeRest
{
	public static final String MOD_ID = "deberes";

	public static void init() {
		ItemController.register();
		CreativeTabController.register();
	}
}
