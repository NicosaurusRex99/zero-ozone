package naturix.zero;

import naturix.zero.event.EventRadiation;
import naturix.zero.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Zero.MODID, name = Zero.NAME, version = Zero.VERSION)
public class Zero
{
    public static final String MODID = "zero";
    public static final String NAME = "Zero Atmosphere";
    public static final String VERSION = "1.12.2.0";


	public static org.apache.logging.log4j.Logger logger;
	
    @SidedProxy(serverSide = "naturix.zero.proxy.CommonProxy", clientSide = "naturix.zero.proxy.ClientProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance(MODID)
	public static Zero instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		registerEvent(new EventRadiation());
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	
	public static void registerEvent(Object event)
	{
		FMLCommonHandler.instance().bus().register(event);
		MinecraftForge.EVENT_BUS.register(event);
	}

}
