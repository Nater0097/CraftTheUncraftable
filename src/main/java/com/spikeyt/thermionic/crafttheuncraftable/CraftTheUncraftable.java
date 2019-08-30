package com.spikeyt.thermionic.crafttheuncraftable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("ctu")
public class CraftTheUncraftable {

	public static CraftTheUncraftable instance;
	public static final String MODID = "ctu";
	private static final Logger LOGGER = LogManager.getLogger(MODID);
		
	public CraftTheUncraftable() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
		
	}	
	
	private void setup(final FMLCommonSetupEvent event){		
		LOGGER.info("Setup method registerd!");		
	}
	
	private void clientRegistries(final FMLClientSetupEvent event){
		LOGGER.info("Client Registries method registerd!");
	}
	
}
