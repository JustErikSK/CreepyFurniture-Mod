package net.withrage.creepyfurniture.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.withrage.creepyfurniture.CreepyFurniture;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreepyFurniture.MOD_ID);

    public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
    }
}
