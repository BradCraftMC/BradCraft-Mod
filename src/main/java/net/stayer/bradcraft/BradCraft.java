package net.stayer.bradcraft;

import net.fabricmc.api.ModInitializer;
import net.stayer.bradcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BradCraft implements ModInitializer {
	public static final String MOD_ID = "bradcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
