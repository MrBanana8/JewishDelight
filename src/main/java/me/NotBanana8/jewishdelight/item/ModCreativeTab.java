package me.NotBanana8.jewishdelight.item;

import me.NotBanana8.jewishdelight.JewishDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JewishDelight.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("jewishdelight_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.GEFILTE_FISH.get()))
                    .title(Component.translatable("creativetab.jewishdelight_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GEFILTE_FISH.get());
                        output.accept(ModItems.SLICED_CARROT.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
