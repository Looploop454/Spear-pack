package models;

import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class initialize implements ModInitializer{

    public static final String MODID="spear";


    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM,new Identifier(MODID,"iron_spear"), new spearBase(new spear()));
    }
}
