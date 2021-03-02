package pro.freeserver.plugin.alphakun.fstaskmanager.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import pro.freeserver.plugin.alphakun.fstaskmanager.gamesystem.ExamineHandler;
import pro.freeserver.plugin.alphakun.fstaskmanager.playerdata.DataInitialize;

public class InventoryClick implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        Player p = (Player) e.getView().getPlayer();
        long etime = DataInitialize.playerexaminetime.get(p.getUniqueId());
        if (e.getClick().equals(ClickType.MIDDLE)) {
            ItemStack item = e.getCurrentItem();
            if(item == null) return;
            int slot = e.getRawSlot();
            ExamineHandler.examineHandler(p,item,slot,etime);
        }
    }
}
