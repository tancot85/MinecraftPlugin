package recipie.recipie.handler;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import recipie.recipie.Recipie;

import java.util.Random;


public class OpRootedDirt implements Listener {

    public OpRootedDirt(Recipie plugin) {
        Bukkit.getPluginManager().registerEvents(this,plugin);
    }

    @EventHandler
    public void onRootedBlockBreak(BlockBreakEvent event){
        Block block = event.getBlock();
        if(block.getType() != Material.ROOTED_DIRT)
            return;
        Random random = new Random();
        ItemStack stack = new ItemStack(Material.DIAMOND,2);
        int randomNumber = random.nextInt(100);
        Bukkit.broadcastMessage("Random number generated is: "+randomNumber);
        if(randomNumber<10 && randomNumber>=0){
            int n = random.nextInt(3);
            stack = new ItemStack(Material.NETHERITE_INGOT,n);
        }
        else if(randomNumber>=10 && randomNumber<40){
            int n = random.nextInt(10);
            stack = new ItemStack(Material.NETHERITE_SCRAP,n);
        }
        else{
            int n = random.nextInt(12);
            stack = new ItemStack(Material.DIAMOND,n);
        }


        block.setType(Material.AIR);
        block.getWorld().dropItemNaturally(block.getLocation(),stack);
    }
}
