package pro.freeserver.plugin.alphakun.fstaskmanager.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import pro.freeserver.plugin.alphakun.fstaskmanager.gamesystem.ExamineHandler;

public class InventoryClick implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        Player p = (Player) e.getView().getPlayer();
        if (e.getClick().equals(ClickType.MIDDLE)) {
            ItemStack item = e.getCurrentItem();
            ExamineHandler.examineHandler(p,item);
        }
    }
}
