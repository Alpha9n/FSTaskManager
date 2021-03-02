package pro.freeserver.plugin.alphakun.fstaskmanager.gamesystem;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.scheduler.BukkitRunnable;
import pro.freeserver.plugin.alphakun.fstaskmanager.Fstaskmanager;

public class ExamineHandler {
    public static void examineHandler(Player p, ItemStack item, int slot, long etime){
        NamespacedKey examinekey = new NamespacedKey(Fstaskmanager.plugin,"examinekey");
        String itemdata = item.getItemMeta().getPersistentDataContainer().get(examinekey,PersistentDataType.STRING);
        ItemStack exmineddata = new ItemStack(Material.valueOf(itemdata));
        new BukkitRunnable(){
            @Override
            public void run() {
                p.getOpenInventory().setItem(slot, exmineddata);
            }
        }.runTaskLater(Fstaskmanager.plugin,etime);
    }
}
