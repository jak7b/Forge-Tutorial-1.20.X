package net.kuko.tutorialmod.datagen;

import net.kuko.tutorialmod.TutorialMod;
import net.kuko.tutorialmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
//        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES) // <- Generate Tag from ModTags
//                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES); // <- Generate Tag Ore from forge

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE) // <- adds blocks into Mineable With Pickaxe Tag, makes them mineable with pick
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

//                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
//                .add(ModBlocks.SOUND_BLOCK.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL) // <- Requires Iron and Above
                .add(ModBlocks.SAPPHIRE_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL) // <- Requires Diamond and Above
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
//
//        this.tag(BlockTags.NEEDS_STONE_TOOL) // <- Requires Stone and Above
//                .add(ModBLocks.NETHER_SAPPHIRE_ORE.get());
//
//        this.tag(BlockTags.NEEDS_STONE_TOOL) // <- Requires Stone and Above
//                .add(ModBLocks.NETHER_SAPPHIRE_ORE.get());


    }

    public static void reg()
    {

    }
}
