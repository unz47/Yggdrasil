package com.example.examplemod.entity.client;

import com.example.examplemod.Yggdrasil;
import com.example.examplemod.entity.GiantBeeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class GiantBeeModel extends EntityModel<GiantBeeEntity> {
    public static final ModelLayerLocation LAYER_LOCATION = 
        new ModelLayerLocation(new ResourceLocation(Yggdrasil.MODID, "giant_bee"), "main");
    
    private final ModelPart body;
    private final ModelPart wing_left;
    private final ModelPart wing_right;

    public GiantBeeModel(ModelPart root) {
        this.body = root.getChild("body");
        ModelPart wings = this.body.getChild("wings");
        this.wing_left = wings.getChild("wing_left");
        this.wing_right = wings.getChild("wing_right");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));

        PartDefinition thorax = body.addOrReplaceChild("thorax", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0F, -4.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

        PartDefinition abdomen = body.addOrReplaceChild("abdomen", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.0F, -4.0F, 12.0F, 10.0F, 14.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0).addBox(-4.0F, -4.0F, 10.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 10.0F));

        PartDefinition stinger = abdomen.addOrReplaceChild("stinger", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0).addBox(-0.5F, -1.0F, 4.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 16.0F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0).addBox(3.0F, -3.0F, -5.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0).addBox(-5.0F, -3.0F, -5.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0).addBox(1.0F, 2.0F, -8.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0).addBox(-3.0F, 2.0F, -8.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -6.0F));

        PartDefinition antenna_left = head.addOrReplaceChild("antenna_left", CubeListBuilder.create(), PartPose.offset(2.0F, -4.0F, -2.0F));
        antenna_left.addOrReplaceChild("antenna_tip_l_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -2.0F, 0.5236F, 0.0F, -0.1745F));
        antenna_left.addOrReplaceChild("antenna_base_l_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.3491F, 0.0F, -0.2618F));

        PartDefinition antenna_right = head.addOrReplaceChild("antenna_right", CubeListBuilder.create(), PartPose.offset(-2.0F, -4.0F, -2.0F));
        antenna_right.addOrReplaceChild("antenna_tip_r_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -2.0F, 0.5236F, 0.0F, 0.1745F));
        antenna_right.addOrReplaceChild("antenna_base_r_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.3491F, 0.0F, 0.2618F));

        PartDefinition wings = body.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 2.0F));

        PartDefinition wing_left = wings.addOrReplaceChild("wing_left", CubeListBuilder.create(), PartPose.offset(3.0F, 0.0F, 0.0F));
        wing_left.addOrReplaceChild("wing_back_l_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -4.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 6.0F, -0.0873F, -0.1745F, 0.1396F));
        wing_left.addOrReplaceChild("wing_front_l_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -4.0F, 13.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -0.0873F, 0.2618F, 0.1745F));

        PartDefinition wing_right = wings.addOrReplaceChild("wing_right", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.0F, 0.0F));
        wing_right.addOrReplaceChild("wing_back_r_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -1.0F, -4.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 6.0F, -0.0873F, 0.1745F, -0.1396F));
        wing_right.addOrReplaceChild("wing_front_r_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -1.0F, -4.0F, 13.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.0873F, -0.2618F, -0.1745F));

        PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 1.0F));

        PartDefinition leg_front_l = legs.addOrReplaceChild("leg_front_l", CubeListBuilder.create(), PartPose.offset(4.0F, 0.0F, -3.0F));
        leg_front_l.addOrReplaceChild("leg_fl_upper_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.5236F));

        PartDefinition leg_front_r = legs.addOrReplaceChild("leg_front_r", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, -3.0F));
        leg_front_r.addOrReplaceChild("leg_fr_upper_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.3491F, 0.0F, -0.5236F));

        PartDefinition leg_mid_l = legs.addOrReplaceChild("leg_mid_l", CubeListBuilder.create(), PartPose.offset(4.0F, 0.0F, 1.0F));
        leg_mid_l.addOrReplaceChild("leg_ml_upper_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

        PartDefinition leg_mid_r = legs.addOrReplaceChild("leg_mid_r", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 1.0F));
        leg_mid_r.addOrReplaceChild("leg_mr_upper_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition leg_back_l = legs.addOrReplaceChild("leg_back_l", CubeListBuilder.create(), PartPose.offset(4.0F, 0.0F, 5.0F));
        leg_back_l.addOrReplaceChild("leg_bl_upper_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.6109F));

        PartDefinition leg_back_r = legs.addOrReplaceChild("leg_back_r", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 5.0F));
        leg_back_r.addOrReplaceChild("leg_br_upper_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.3491F, 0.0F, -0.6109F));

        return LayerDefinition.create(meshdefinition, 16, 16);
    }

    @Override
    public void setupAnim(GiantBeeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float wingAngle = Mth.cos(ageInTicks * 2.0F) * 0.3F;
        this.wing_left.zRot = 0.1745F + wingAngle;
        this.wing_right.zRot = -0.1745F - wingAngle;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
