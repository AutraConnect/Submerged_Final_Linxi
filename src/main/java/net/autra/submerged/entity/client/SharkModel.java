package net.autra.submerged.entity.client;

import net.autra.submerged.entity.animations.ModAnimations;
import net.autra.submerged.entity.custom.SharkEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SharkModel<T extends SharkEntity> extends SinglePartEntityModel<T> {

    private final ModelPart midbody;
    private final ModelPart tail;
    private final ModelPart mainbody;
    private final ModelPart head;
    private final ModelPart jaw;

    public SharkModel(ModelPart root) {
        this.midbody = root.getChild("midbody");
        this.tail = root.getChild("tail");
        this.mainbody = root.getChild("mainbody");
        this.head = root.getChild("head");
        this.jaw = root.getChild("jaw");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData midbody = modelPartData.addChild("midbody", ModelPartBuilder.create().uv(0, 18).cuboid(6.0F, -7.0F, -4.0F, 9.0F, 6.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData tail = modelPartData.addChild("tail", ModelPartBuilder.create().uv(34, 28).cuboid(-6.0F, -2.0F, -2.0F, 6.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(21.0F, 20.0F, -1.0F));

        ModelPartData bottomtailfin_r1 = tail.addChild("bottomtailfin_r1", ModelPartBuilder.create().uv(46, 46).cuboid(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.1817F));

        ModelPartData toptailfin_r1 = tail.addChild("toptailfin_r1", ModelPartBuilder.create().uv(36, 46).cuboid(-1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

        ModelPartData mainbody = modelPartData.addChild("mainbody", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -2.0F, -7.0F, 14.0F, 8.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 18.0F, 2.0F));

        ModelPartData rightfin_r1 = mainbody.addChild("rightfin_r1", ModelPartBuilder.create().uv(0, 44).cuboid(-1.0F, 1.0F, -8.0F, 4.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 4.0F, 10.0F, -0.3054F, 0.2182F, 0.0F));

        ModelPartData leftfin_r1 = mainbody.addChild("leftfin_r1", ModelPartBuilder.create().uv(34, 38).cuboid(-1.0F, 1.0F, 1.0F, 4.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 4.0F, -14.0F, 0.3054F, -0.2182F, 0.0F));

        ModelPartData dorsalfin_r1 = mainbody.addChild("dorsalfin_r1", ModelPartBuilder.create().uv(22, 46).cuboid(-1.0F, -9.0F, -3.0F, 5.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 32).cuboid(-16.0F, -7.0F, -4.0F, 9.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData jaw = modelPartData.addChild("jaw", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData jaw_r1 = jaw.addChild("jaw_r1", ModelPartBuilder.create().uv(34, 18).cuboid(-15.0F, -4.0F, -4.0F, 10.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        midbody.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        tail.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        mainbody.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        jaw.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return null;
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}
