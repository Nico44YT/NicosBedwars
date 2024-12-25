package nazario.nicosbedwars;

import nazario.nicosbedwars.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;

public class NicosBedwars implements ModInitializer {

    @Override
    public void onInitialize() {
        BlockRegistry.init();
    }
}
