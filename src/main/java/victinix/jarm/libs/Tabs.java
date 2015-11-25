package victinix.jarm.libs;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import victinix.jarm.items.ModItems;

public class Tabs {

    private static class CustomCreativeTab extends CreativeTabs {

        private ItemStack stack;

        public CustomCreativeTab(String label) {

            super(label);
        }

        @Override
        public Item getTabIconItem() {

            return stack.getItem();
        }

        public void setTabIconItemStack(ItemStack stack) {

            this.stack = stack;
        }

        @Override
        public ItemStack getIconItemStack() {

            return stack;
        }
    }

    public static final CustomCreativeTab tabRandom = new CustomCreativeTab("tabRandom");

    public static void postInit() {

        if(Configurations.randomGunRegister) {
            tabRandom.setTabIconItemStack(new ItemStack(ModItems.randomGun));
        }
        else {
            tabRandom.setTabIconItemStack(new ItemStack(Items.ender_eye));
        }
    }
}
