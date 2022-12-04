package com.ayc.aycessentials.item;

import com.ayc.aycessentials.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static CreativeModeTab AYC_TAB = new CreativeModeTab("aycessentials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SATURN.get());
        }
    };
}
