package jaiz.plantsjunk.entity.client;

import jaiz.plantsjunk.PlantsJunk;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {

    public static final EntityModelLayer BUTTERFLY =
            new EntityModelLayer(new Identifier(PlantsJunk.MOD_ID, "butterfly"), "main");

    public static final EntityModelLayer CATERPILLAR =
            new EntityModelLayer(new Identifier(PlantsJunk.MOD_ID, "caterpillar"), "main");

    public static final EntityModelLayer DRAGONFLY =
            new EntityModelLayer(new Identifier(PlantsJunk.MOD_ID, "dragonfly"), "main");

    public static final EntityModelLayer FIRE_FLY_SWARM =
            new EntityModelLayer(new Identifier(PlantsJunk.MOD_ID, "fire_fly_swarm"), "main");

}
