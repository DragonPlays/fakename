package tschipp.fakename;

import net.minecraft.world.World;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public interface IProxy
{
	public void setup(final FMLCommonSetupEvent event);
	
	public World getWorld();
}
