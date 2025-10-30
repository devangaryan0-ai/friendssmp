package me.aryan.friendssmp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("FriendsSMP Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("FriendsSMP Plugin Disabled!");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.sendMessage(ChatColor.AQUA + "Welcome to Friends SMP, " + p.getName() + "!");
        p.sendTitle(ChatColor.GOLD + "✨ Welcome ✨", ChatColor.GREEN + "Enjoy your stay!", 10, 70, 20);
    }
}
