package net.autra.submerged.entity.layer;

import net.autra.submerged.Submerged;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer SHARK =
            new EntityModelLayer(new Identifier(Submerged.MOD_ID, "shark"), "main");
}
