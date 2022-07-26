package recipie.recipie;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import recipie.recipie.handler.OpEnchants;
import recipie.recipie.handler.OpRootedDirt;

public final class Recipie extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("hello there");
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
