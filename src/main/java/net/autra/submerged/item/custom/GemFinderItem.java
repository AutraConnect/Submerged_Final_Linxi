package net.autra.submerged.item.custom;

import net.autra.submerged.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GemFinderItem extends Item {

    public GemFinderItem(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + 64; i++){
                BlockState blockState = context.getWorld().getBlockState(positionClicked.down(i));
                Block block = blockState.getBlock();

                if(isGemBlock(blockState)){
                    outputSapphireLocation(positionClicked.down(i), player, block);
                    foundBlock = true;

                    break;
                }
            }

            if(!foundBlock){
                player.sendMessage(Text.translatable("item.submerged.gem_finder.no_gems"));
            }
        }

        context.getStack().damage(1, context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.submerged.gem_finder.tooltip.shift"));
        }else{
            tooltip.add(Text.translatable("tooltip.submerged.gem_finder.tooltip"));
        }
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    private void outputSapphireLocation(BlockPos position, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Gems Found " + block.getName().getString() + " at "+
                "("+position.getX()+", " + position.getY() + ", " + position.getZ()+")"));
    }

    private boolean isGemBlock(BlockState blockState) {
        return blockState.isIn(ModTags.Blocks.GEM_FINDER_ELIGIBLE_BLOCKS);
    }
}
