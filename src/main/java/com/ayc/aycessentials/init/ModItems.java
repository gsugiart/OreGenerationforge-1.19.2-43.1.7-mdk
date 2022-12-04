package com.ayc.aycessentials.init;

import com.ayc.aycessentials.AYCEssentialsMod;
import com.ayc.aycessentials.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS
            , AYCEssentialsMod.MODID);

    public static final RegistryObject<Item> SATURN = ITEMS.register("saturn"
            , ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.AYC_TAB)));


    public static final RegistryObject<Item> SATURN_ORE = ITEMS.register("saturn_ore"
            , ()-> new BlockItem(ModBlocks.SATURN_ORE.get()
                    , new Item.Properties().tab(ModCreativeModeTab.AYC_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
