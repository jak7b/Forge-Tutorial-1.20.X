package net.kuko.tutorialmod.item;

import net.kuko.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM,TutorialMod.MOD_ID);
//
//    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
//            () -> new Item(new Item.Properties()));




    public static void register(IEventBus bus) {
        ITEMS.register(bus );
        TutorialMod.LOGGER.info("ModItems registering for " + TutorialMod.MOD_ID);
    }
}
