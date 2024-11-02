package me.justmaya.disableitems.events;

import me.justmaya.disableitems.ConfigMessage;
import me.justmaya.disableitems.DisableItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;

public class TotemUseEvent implements Listener {
    private final DisableItems plugin;

    public TotemUseEvent(DisableItems plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onTotemUse(EntityResurrectEvent e) {
        if (e.getEntity() instanceof Player && !e.isCancelled()) {
            // disable totem use
            e.setCancelled(true);

            ConfigMessage c = new ConfigMessage(plugin);
            c.TotemDisableMessage((Player) e.getEntity());
        }
    }
}
