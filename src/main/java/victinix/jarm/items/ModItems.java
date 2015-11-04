package victinix.jarm.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import victinix.jarm.items.food.ItemCookedSquid;
import victinix.jarm.items.food.ItemCoolSquid;
import victinix.jarm.items.food.ItemHotdog;
import victinix.jarm.items.magic.ItemDitto;
import victinix.jarm.items.weapons.ItemDiamondHandbag;
import victinix.jarm.items.weapons.ItemEmeraldSword;
import victinix.jarm.items.weapons.ItemRandomGun;
import victinix.jarm.libs.Configurations;

public class ModItems {

    public static Item.ToolMaterial RANDOMEMERALD;

    public static Item cookedSquid;
    public static Item coolSquid;
    public static Item hotdog;

    public static Item ditto;

    public static Item diamondHandbag;
    public static Item emeraldSword;
    public static Item randomGun;

    public static void init() {

        RANDOMEMERALD = EnumHelper.addToolMaterial("RANDOMEMERALD", 4, Configurations.emeraldSwordDurability, 10f, Configurations.emeraldSwordDamage, 18);

        cookedSquid = new ItemCookedSquid(Configurations.cookedSquidHeal, Configurations.cookedSquidSaturation, true);
        coolSquid = new ItemCoolSquid(Configurations.coolSquidHeal, Configurations.coolSquidSaturation, true);
        hotdog = new ItemHotdog(Configurations.hotdogHeal, Configurations.hotdogSaturation, true);

        ditto = new ItemDitto();

        diamondHandbag = new ItemDiamondHandbag(Item.ToolMaterial.EMERALD);
        emeraldSword = new ItemEmeraldSword(ModItems.RANDOMEMERALD);
        randomGun = new ItemRandomGun();
    }
}
