package net.voider.codersmp;

import net.fabricmc.api.ModInitializer;
import net.voider.codersmp.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class CoderSmp implements ModInitializer {
	public static final String MOD_ID = "codersmp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
