package nazario.nicosbedwars.common;

import net.minecraft.item.ItemStack;

public class GeneratorMaterialKey {

    private final ItemStack stack;
    final int INITIAL_COOLDOWN;
    int cooldown;

    public GeneratorMaterialKey(ItemStack stack, final int cooldown) {
        this.stack = stack;
        this.cooldown = cooldown;
        this.INITIAL_COOLDOWN = cooldown;
    }

    public ItemStack getStack() {
        return this.stack;
    }

    public int getCooldown() {
        return this.cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public void decrementCooldown() {
        this.cooldown--;
    }

    public void resetCooldown() {
        this.cooldown = this.INITIAL_COOLDOWN;
    }
}
