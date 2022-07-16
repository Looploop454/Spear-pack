package models;
import net.minecraft.item.*;
import net.minecraft.item.TridentItem;
public class spearBase extends SwordItem{
    public spearBase(ToolMaterial toolMaterial1){
        super(toolMaterial1,-1,-1,new Item.Settings().group(ItemGroup.COMBAT));
    }
}
