package models;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class spear implements ToolMaterial {
    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0f;
    }

    @Override
    public float getAttackDamage() {

        return 2.0f;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }



    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
}
