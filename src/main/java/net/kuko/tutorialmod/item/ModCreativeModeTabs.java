package net.kuko.tutorialmod.item;

import net.kuko.tutorialmod.TutorialMod;
import net.kuko.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);




    public static final RegistryObject<CreativeModeTab> TUTORIAL_SAPPHIRE_TAB = CREATIVE_MODE_TABS.register("sapphire_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativemodtab.sapphire_tab"))
                    //.withTabsBefore()
                    .displayItems((pParameters, pOutput) ->  {
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
        TutorialMod.LOGGER.info("ModCreativeTabs registering for " + TutorialMod.MOD_ID);
    }
}
