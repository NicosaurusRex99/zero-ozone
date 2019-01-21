package naturix.zero.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
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