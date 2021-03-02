package pro.freeserver.plugin.alphakun.fstaskmanager;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import pro.freeserver.plugin.alphakun.fstaskmanager.events.InventoryClick;

public final class Fstaskmanager extends JavaPlugin {

    public static Plugin plugin;

    @Override
    public void onEnable() {
        eventRegister();
        plugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void eventRegister() {
        getServer().getPluginManager().registerEvents(new InventoryClick(),plugin);
    }
}
