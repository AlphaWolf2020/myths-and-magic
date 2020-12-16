/* package com.fran.mythology.client.model;

import com.fran.mythology.entities.RatEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class RatModel extends EntityModel<RatEntity> implements dRatModel {
        private final ModelRenderer bb_main;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer cube_r3;
        private final ModelRenderer cube_r4;
        private final ModelRenderer cube_r5;
        private final ModelRenderer cube_r6;
        private final ModelRenderer cube_r7;
        private final ModelRenderer cube_r8;

        public RatModel() {
            textureWidth = 32;
            textureHeight = 32;

            bb_main = new ModelRenderer(this);
            bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
            bb_main.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -7.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
            bb_main.setTextureOffset(17, 0).addBox(-4.0F, -4.0F, -6.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            bb_main.setTextureOffset(0, 17).addBox(1.0F, -4.0F, -6.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            bb_main.setTextureOffset(21, 8).addBox(2.0F, -1.0F, -5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            bb_main.setTextureOffset(7, 11).addBox(-4.0F, -1.0F, -5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            bb_main.setTextureOffset(12, 12).addBox(-2.0F, -5.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
            bb_main.setTextureOffset(7, 17).addBox(-3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.setTextureOffset(0, 3).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.setTextureOffset(4, 23).addBox(1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            bb_main.setTextureOffset(0, 23).addBox(-3.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            bb_main.setTextureOffset(19, 22).addBox(-2.0F, -4.0F, -8.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            bb_main.setTextureOffset(21, 12).addBox(0.0F, -4.0F, -8.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            bb_main.setTextureOffset(0, 11).addBox(-1.0F, -4.0F, -8.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r1 = new ModelRenderer(this);
            cube_r1.setRotationPoint(-0.5282F, -1.9922F, 5.9655F);
            bb_main.addChild(cube_r1);
            setRotationAngle(cube_r1, -0.1134F, 0.0F, 1.1345F);
            cube_r1.setTextureOffset(0, 0).addBox(0.0F, -3.0F, -2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);

            cube_r2 = new ModelRenderer(this);
            cube_r2.setRotationPoint(-0.8217F, -1.2857F, 5.9655F);
            bb_main.addChild(cube_r2);
            setRotationAngle(cube_r2, -0.1134F, 0.0F, -1.309F);
            cube_r2.setTextureOffset(0, 3).addBox(0.0F, -3.0F, -2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);

            cube_r3 = new ModelRenderer(this);
            cube_r3.setRotationPoint(0.0F, -1.0F, 7.0F);
            bb_main.addChild(cube_r3);
            setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
            cube_r3.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r4 = new ModelRenderer(this);
            cube_r4.setRotationPoint(0.0F, -3.2484F, -12.8291F);
            bb_main.addChild(cube_r4);
            setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
            cube_r4.setTextureOffset(0, 11).addBox(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

            cube_r5 = new ModelRenderer(this);
            cube_r5.setRotationPoint(0.0F, -2.2155F, -8.9765F);
            bb_main.addChild(cube_r5);
            setRotationAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
            cube_r5.setTextureOffset(10, 18).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r6 = new ModelRenderer(this);
            cube_r6.setRotationPoint(0.8408F, -3.7905F, 4.8739F);
            bb_main.addChild(cube_r6);
            setRotationAngle(cube_r6, -0.1134F, 0.0F, 0.1309F);
            cube_r6.setTextureOffset(4, 0).addBox(0.0F, -3.0F, -2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);

            cube_r7 = new ModelRenderer(this);
            cube_r7.setRotationPoint(-2.773F, -3.6249F, 4.8739F);
            bb_main.addChild(cube_r7);
            setRotationAngle(cube_r7, -0.1134F, 0.0F, -0.1745F);
            cube_r7.setTextureOffset(4, 3).addBox(0.0F, -3.0F, -2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);

            cube_r8 = new ModelRenderer(this);
            cube_r8.setRotationPoint(0.0F, -1.0F, 6.0F);
            bb_main.addChild(cube_r8);
            setRotationAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
            cube_r8.setTextureOffset(16, 18).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
        }

    @Override
    public void setRotationAngles(RatEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.cube_r1.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.cube_r2.rotateAngleY = netHeadYaw * ((float)Math.PI / 180);
        this.cube_r3.rotateAngleX = ((float)Math.PI /2F);
        this.cube_r4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.cube_r5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.cube_r6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.cube_r7.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

    }

    @Override
    public void setRotationAngles(float entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.cube_r1.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.cube_r2.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.cube_r3.rotateAngleX = ((float)Math.PI / 2F);
        this.cube_r4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.cube_r5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.cube_r6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.cube_r7.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }*/
        /*@Override
        public void setRotationAngles(T Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
            this.bb_main.rotateAngleX = headPitch * ((float)Math.PI / 180F);
            this.cube_r1.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
            this.cube_r2.rotateAngleX = ((float)Math.PI / 2F);
            this.cube_r3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.cube_r4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.cube_r5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.cube_r6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        }

        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
    }*/