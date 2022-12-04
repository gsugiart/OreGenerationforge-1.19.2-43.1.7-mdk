package com.ayc.aycessentials.init;

import com.ayc.aycessentials.AYCEssentialsMod;
import com.ayc.aycessentials.blocks.SaturnOre;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, AYCEssentialsMod.MODID);

    public static final RegistryObject<Block> SATURN_ORE = BLOCKS.register("saturn_ore", SaturnOre::new);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
