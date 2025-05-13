package net.kuko.tutorialmod.datagen;

import net.kuko.tutorialmod.TutorialMod;
import net.kuko.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SAPPHIRE); /// <- Creates normale json for item model, nothing complex, I fink.
        simpleItem(ModItems.RAW_SAPPHIRE);
//
//        simpleItem(ModItems.METAL_DETECTOR);
//        simpleItem(ModItems.PINE_CONE);
//        simpleItem(ModItems.STRAWBERRY);


    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) { // <- Adds a simple item model into Assets/Namespace/Models/Item
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0", // <- originally: new ResourceLocation(...) but it got flagged for being outdated.
                ResourceLocation.tryBuild(TutorialMod.MOD_ID, "item/" + item.getId().getPath())); // <- originally: new ResourceLocation(...) but it got flagged for being outdated.
    }
}
