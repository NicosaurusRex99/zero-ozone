package naturix.zero.event;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EventRadiation{ 


	public static DamageSource Radiation = new DamageSource("radiation");
	private Item boots = null, body = null, legs = null, helmet = null;
	@SubscribeEvent
	public void playerTick(PlayerTickEvent event) {
		ItemStack stackBoots = event.player.inventory.armorInventory.get(0);
		ItemStack stackLegs = event.player.inventory.armorInventory.get(1);
		ItemStack stackBody = event.player.inventory.armorInventory.get(2);
		ItemStack stackHelmet = event.player.inventory.armorInventory.get(3);
		if(stackBoots != null) boots = stackBoots.getItem();
		else boots = null;
		if(stackBody != null) body = stackBody.getItem();
		else body = null;
		if(stackLegs != null) legs = stackLegs.getItem();
		else legs = null;
		if(stackHelmet != null) helmet = stackHelmet.getItem();
		else helmet = null;
		if(event.player.hurtTime < 40) {
		if(helmet != null && event.player.world.canSeeSky(event.player.getPosition()) && event.player.world.isDaytime()==true) 
		{
       	 event.player.attackEntityFrom(Radiation, 1f);
		}
}
}
}