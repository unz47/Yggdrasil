package com.example.examplemod.entity.client;

import com.example.examplemod.Yggdrasil;
import com.example.examplemod.entity.GiantBeeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GiantBeeRenderer extends MobRenderer<GiantBeeEntity, GiantBeeModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Yggdrasil.MODID, "textures/entity/giant_bee.png");

    public GiantBeeRenderer(EntityRendererProvider.Context context) {
        super(context, new GiantBeeModel(context.bakeLayer(GiantBeeModel.LAYER_LOCATION)), 2.0f);
    }

    @Override
    protected void scale(GiantBeeEntity entity, PoseStack poseStack, float partialTicks) {
        poseStack.scale(2.0f, 2.0f, 2.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(GiantBeeEntity entity) {
        return TEXTURE;
    }
}
