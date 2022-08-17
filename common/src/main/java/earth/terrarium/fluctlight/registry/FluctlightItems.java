package earth.terrarium.fluctlight.registry;

import earth.terrarium.fluctlight.item.CubedExperience;
import earth.terrarium.fluctlight.util.extensions.ExtensionDeclaration;
import me.codexadrian.spirit.Spirit;
import net.minecraft.world.item.Item;
import org.apache.commons.lang3.NotImplementedException;

import java.util.function.Supplier;

public class FluctlightItems {

    public static final Supplier<Item> EXPERIENCE_CUBED = register("experience_cubed", () -> new CubedExperience(new Item.Properties().tab(Spirit.SPIRIT)));

    @ExtensionDeclaration
    public static Supplier<Item> register(String id, Supplier<Item> item) {
        throw new NotImplementedException("Item Registration ain't implemented");
    }

    public static void register() {

    }
}