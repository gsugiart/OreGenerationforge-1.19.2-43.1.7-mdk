package com.ayc.aycessentials.world.features;

import com.ayc.aycessentials.AYCEssentialsMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlaceFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, AYCEssentialsMod.MODID);

    public static final RegistryObject<PlacedFeature> SATURN_ORE_PLACED = PLACED_FEATURES.register("saturn_ore_place",
            () -> new PlacedFeature(ModConfiguredFeatures.SATURN_ORE.getHolder().get(),
                    commonOrePlacement(50, // VeinsPerChunk
                            HeightRangePlacement.uniform(
                                    VerticalAnchor.bottom(),
                                    VerticalAnchor.top()))));

    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier height) {
        return List.of(count, InSquarePlacement.spread(), height, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height) {
        return orePlacement(CountPlacement.of(countPerChunk), height);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
