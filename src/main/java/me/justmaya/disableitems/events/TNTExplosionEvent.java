package me.justmaya.disableitems.events;

import me.justmaya.disableitems.ConfigMessage;
import me.justmaya.disableitems.DisableItems;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityResurrectEvent;

public class TNTExplosionEvent implements Listener {


    @EventHandler
    public void onTNTExplode(EntityExplodeEvent e) {
        if (e.getEntity() instanceof TNTPrimed) {

            e.setCancelled(true); // Cancel the explosion
        }

    }

}
