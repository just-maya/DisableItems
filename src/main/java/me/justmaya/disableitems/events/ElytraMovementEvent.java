package me.justmaya.disableitems.events;

import me.justmaya.disableitems.ConfigMessage;
import me.justmaya.disableitems.DisableItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class ElytraMovementEvent implements Listener {
    private final DisableItems plugin;

    public ElytraMovementEvent(DisableItems plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerMovement(PlayerMoveEvent e) {
        if (e.getPlayer().isGliding()) {
            // disable gliding
            e.getPlayer().setGliding(false);

            ConfigMessage c = new ConfigMessage(plugin);
            c.ElytraDisableMessage(e.getPlayer());
        }
    }
}
