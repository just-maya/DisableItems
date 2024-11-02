package me.justmaya.disableitems;

import me.justmaya.disableitems.events.ElytraMovementEvent;
import me.justmaya.disableitems.events.TNTExplosionEvent;
import me.justmaya.disableitems.events.TotemUseEvent;
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
        Bukkit.getServer().getPluginManager().registerEvents(new TotemUseEvent(this), this);
        Bukkit.getServer().getPluginManager().registerEvents(new TNTExplosionEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new ElytraMovementEvent(this), this);
    }
}
