package victinix.jarm.events;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import victinix.jarm.items.ModItems;

import java.util.Arrays;

public class EventWandMalfunction {

    @SubscribeEvent
    public void eventWandMalfunction(PlayerInteractEvent event) {

        Block[] canCrush = ModItems.canCrush.toArray(new Block[ModItems.canCrush.size()]);
        boolean malfunction = true;

        if(event.entityPlayer.getHeldItem() != null && event.entityPlayer.getHeldItem().getItem() == ModItems.crushing_wand) {
            if(event.action != null && event.action == PlayerInteractEvent.Action.LEFT_CLICK_BLOCK) {
                for (int i = 0; i < canCrush.length; i++) {
                    if(event.world.getBlockState(event.pos).getBlock() == canCrush[i]) {
                        malfunction = false;
                    }
                }
                if(malfunction) {
                    event.world.setRainStrength(1f);
                    event.world.addWeatherEffect(new EntityLightningBolt(event.world, (int) event.entityPlayer.posX, (int) event.entityPlayer.posY, (int) event.entityPlayer.posZ));
                    event.setCanceled(true);
                }
            }
        }
    }
}