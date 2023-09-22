package io.github.sirdoudou.savagehumans;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = Reference.MOD_ID)
public class SavageHumans {
    public SavageHumans() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();


    }
}
