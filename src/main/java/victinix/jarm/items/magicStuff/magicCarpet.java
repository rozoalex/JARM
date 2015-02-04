package victinix.jarm.items.magicStuff;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import victinix.jarm.libs.Data;
import victinix.jarm.libs.Tabs;

import javax.annotation.Nullable;

public class magicCarpet extends Item {

    private String name = "magicCarpet";

    public magicCarpet() {

        super();
        setUnlocalizedName(Data.MODID + ":" + name);
        setTextureName(Data.MODID + ":" + name);
        setCreativeTab(Tabs.tabRandom);
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean flag) {

        @Nullable

        EntityPlayer entityPlayer = (EntityPlayer) entity;

        if(entityPlayer.getHeldItem() != null && entityPlayer.getHeldItem().getItem() == this)
            entityPlayer.capabilities.allowFlying = true;
        if(entityPlayer.getHeldItem().getItem() != null && entityPlayer.getHeldItem().getItem() != this && !entityPlayer.capabilities.isCreativeMode) {
            entityPlayer.capabilities.allowFlying = false;
            if(entityPlayer.capabilities.isFlying)
                entityPlayer.capabilities.isFlying = false;
        }
    }
}