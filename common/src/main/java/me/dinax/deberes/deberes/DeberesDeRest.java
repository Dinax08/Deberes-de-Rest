package me.dinax.deberes.deberes;

import me.dinax.deberes.deberes.creative_tab.CreativeTabController;
import me.dinax.deberes.deberes.item.ItemController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeberesDeRest
{
	public static final String MOD_ID = "deberes";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static void init() {
		ItemController.register();
		CreativeTabController.register();
		Events.register();
	}
}
