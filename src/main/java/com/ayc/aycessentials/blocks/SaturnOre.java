package com.ayc.aycessentials.blocks;


import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;


public class SaturnOre extends DropExperienceBlock {
    public SaturnOre() {
        super(
                Properties.of(Material.METAL)
                        .sound(SoundType.METAL)
                        .strength(5.0f)
                        .requiresCorrectToolForDrops()
                , UniformInt.of(3,7)

        );
    }

}
