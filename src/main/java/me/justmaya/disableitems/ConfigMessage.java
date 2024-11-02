package me.justmaya.disableitems;

import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;

public class ConfigMessage {
    private final Configuration config;

    // configure the message
    public ConfigMessage(DisableItems plugin) {
        this.config = plugin.getConfig();
    }

    // send to the player that totem is disabled
    public void TotemDisableMessage(Player p) {
        String message = config.getString("totem-disable-message");

        assert message != null;
        p.sendMessage(message);
    }

    // send to the player that tnt explosion is disabled
    public void ElytraDisableMessage(Player p) {
        String message = config.getString("elytra-disable-message");

        assert message != null;
        p.sendMessage(message);
    }
}
