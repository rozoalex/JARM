package victinix.jarm.items.food;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;
import victinix.jarm.libs.Configurations;
import victinix.jarm.libs.Data;
import victinix.jarm.libs.Tabs;

public class ItemCookedSquid extends ItemFood {

    private String name = "cookedSquid";

    public ItemCookedSquid(int heal, float saturation, boolean wolfMeat) {

        super(heal, saturation, wolfMeat);
        setUnlocalizedName(Data.MODID + ":" + name);
        setTextureName(Data.MODID + ":" + name);
        setCreativeTab(Tabs.tabRandom);
        if(Configurations.cookedSquidRegister && Configurations.cookedSquidRegister)
            GameRegistry.registerItem(this, name);
    }
}
