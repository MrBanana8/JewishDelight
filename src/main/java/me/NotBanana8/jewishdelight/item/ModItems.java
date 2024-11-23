package me.NotBanana8.jewishdelight.item;

import me.NotBanana8.jewishdelight.JewishDelight;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JewishDelight.MODID);

    public static final RegistryObject<Item> GEFILTE_FISH = ITEMS.register("gefilte_fish", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder().nutrition(3).build())));
    public static final RegistryObject<Item> SLICED_CARROT = ITEMS.register("sliced_carrot",()->new Item(new Item.Properties()
            .food(new FoodProperties.Builder().nutrition(1).build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
