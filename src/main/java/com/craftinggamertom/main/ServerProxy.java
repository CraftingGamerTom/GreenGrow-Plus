package com.craftinggamertom.main;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.client.main.Main;

public class ServerProxy extends CommonProxy{

	@Override
    public void preInit(FMLPreInitializationEvent e) {
    	super.preInit(e);
    }
	@Override
    public void init(FMLInitializationEvent e) {
    	super.init(e);
    }
	@Override
    public void postInit(FMLPostInitializationEvent e) {
    	super.postInit(e);
    }
}
