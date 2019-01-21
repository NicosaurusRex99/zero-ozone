package naturix.zero.proxy;


import java.io.File;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod.EventBusSubscriber
	public class CommonProxy {
	public static Configuration config;
	
	    public void preInit(FMLPreInitializationEvent e) {
	    	File directory = e.getModConfigurationDirectory();
	        config = new Configuration(new File(directory.getPath(), "naturix/zero.cfg"));

	        }
	    public EntityPlayer getPlayer() { return null; }
	    public void init(FMLInitializationEvent e) {
	    }

	    public void postInit(FMLPostInitializationEvent e) {
	    	if (config.hasChanged()) {
	            config.save();
	        }
	    }

		

	}
