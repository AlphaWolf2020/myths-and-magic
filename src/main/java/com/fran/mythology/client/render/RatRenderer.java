package com.fran.mythology.client.render;

import com.fran.mythology.MythMod;
import com.fran.mythology.client.model.RatModel;
import com.fran.mythology.entities.RatEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;


import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RatRenderer extends MobRenderer<RatEntity, RatModel> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MythMod.MOD_ID, "textures/entity/rat.png");

    public RatRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RatModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(RatEntity entity) {
        return TEXTURE;
    }
}
