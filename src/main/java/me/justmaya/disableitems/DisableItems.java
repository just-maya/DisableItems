package me.justmaya.disableitems;

import me.justmaya.disableitems.events.DisableTotem;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DisableItems extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        // register the events
        registerEvents();
    }

    private void registerEvents() {
        Bukkit.getServer().getPluginManager().registerEvents(new DisableTotem(this), this);
    }
}
