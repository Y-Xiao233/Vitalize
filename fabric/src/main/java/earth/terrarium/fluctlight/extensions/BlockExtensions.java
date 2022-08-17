package earth.terrarium.fluctlight.extensions;

import earth.terrarium.fluctlight.Fluctlight;
import earth.terrarium.fluctlight.registry.FluctlightBlocks;
import earth.terrarium.fluctlight.util.extensions.ExtensionFor;
import earth.terrarium.fluctlight.util.extensions.ExtensionImplementation;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

@ExtensionFor(FluctlightBlocks.class)
public class BlockExtensions {

    @ExtensionImplementation
    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> item) {
        var register = Registry.register(Registry.BLOCK, new ResourceLocation(Fluctlight.MODID, id), item.get());
        return () -> register;
    }

    @ExtensionImplementation
    public static <E extends BlockEntity, T extends BlockEntityType<E>> Supplier<T> registerBlockEntity(String id, Supplier<T> item) {
        var register = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Fluctlight.MODID, id), item.get());
        return () -> register;
    }

    @ExtensionImplementation
    public static <E extends BlockEntity> BlockEntityType<E> createBlockEntityType(FluctlightBlocks.BlockEntityFactory<E> factory, Block... blocks) {
        return FabricBlockEntityTypeBuilder.create(factory::create, blocks).build(null);
    }
}