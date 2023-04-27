package net.stayer.bradcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class ImpostorEntity extends PathAwareEntity {

        public ImpostorEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
            super(entityType, world);
        }
}
