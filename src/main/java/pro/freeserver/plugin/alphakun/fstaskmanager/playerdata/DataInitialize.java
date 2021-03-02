package pro.freeserver.plugin.alphakun.fstaskmanager.playerdata;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class DataInitialize {
    public static HashMap<UUID, Long> playerexaminetime = new HashMap<>();

    public void playerdatainit(Player p){
        playerexaminetime.put(p.getUniqueId(),60L);
    }
}
