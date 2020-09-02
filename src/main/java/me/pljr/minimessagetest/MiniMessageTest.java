package me.pljr.minimessagetest;

import org.bukkit.plugin.java.JavaPlugin;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public final class MiniMessageTest extends JavaPlugin {
    private static BukkitAudiences bukkitAudiences;

    @Override
    public void onEnable() {
        // Plugin startup logic
        bukkitAudiences = BukkitAudiences.create(this);
        getCommand("minimessagetest").setExecutor(new Command());
    }

    public static BukkitAudiences getBukkitAudiences() {
        return bukkitAudiences;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
