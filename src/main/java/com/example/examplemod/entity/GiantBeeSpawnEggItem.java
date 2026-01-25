package com.example.examplemod.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class GiantBeeSpawnEggItem extends Item {
    public GiantBeeSpawnEggItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        if (level instanceof ServerLevel serverLevel) {
            BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
            GiantBeeEntity bee = ModEntities.GIANT_BEE.get().create(serverLevel);
            if (bee != null) {
                bee.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
                serverLevel.addFreshEntity(bee);
                context.getItemInHand().shrink(1);
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }
}
