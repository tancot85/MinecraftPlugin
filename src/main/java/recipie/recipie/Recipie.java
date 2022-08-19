package recipie.recipie;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import recipie.recipie.handler.OpEnchants;
import recipie.recipie.handler.OpRootedDirt;

public final class Recipie extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("hello there");

        Material[]  mlist = Material.values();
        for(int i=0;i<10;i++){
            ItemStack stack = new ItemStack(mlist[i],1);
            ItemMeta meta = stack.getItemMeta();

            Bukkit.getLogger().info(meta.getAsString());
        }
        OpEnchants opEnchants = new OpEnchants();
        opEnchants.init();
        new OpRootedDirt(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("shutting down");
    }
}
