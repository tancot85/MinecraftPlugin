package recipie.recipie.handler;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class OpEnchants {
    private int damageAllLevel = 3;
    private int lootingMobBonusLevel = 2;
    private int sweepingEdgeLevel = 1;
    private int lootingBlockBonusLevel=1;
    private int digSpeedLevel = 3;

    private void enchantWeapon(Material m, String s,int enchantLevel) {
        //encahntLevel breakdownd={1:wood, 2:stone, 3:iron, 4:gold, 5:diamond, 6:netherite}
        ItemStack item = new ItemStack(m, 1);
        ItemMeta meta = item.getItemMeta();
        switch(enchantLevel){
            case 1:
                break;
            case 2:
                this.lootingMobBonusLevel=2;
                this.damageAllLevel = 4;
                this.sweepingEdgeLevel=1;
                break;
            case 3:
                this.lootingMobBonusLevel=3;
                this.damageAllLevel = 4;
                this.sweepingEdgeLevel=2;
                break;
            case 4:
                this.lootingMobBonusLevel=3;
                this.damageAllLevel = 5;
                this.sweepingEdgeLevel=2;
                break;
            case 5:
                this.lootingMobBonusLevel=4;
                this.damageAllLevel = 6;
                this.sweepingEdgeLevel=3;
                break;
            case 6:
                this.lootingMobBonusLevel=4;
                this.damageAllLevel = 7;
                this.sweepingEdgeLevel=3;
                break;
            default:
                break;
        }
        meta.addEnchant(Enchantment.DAMAGE_ALL, damageAllLevel, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
        meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, lootingMobBonusLevel, true);
        meta.addEnchant(Enchantment.SWEEPING_EDGE, sweepingEdgeLevel, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        item.setItemMeta(meta);

//        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft(s), item);
//
//        sr.shape(
//                "A  ",
//                " M ",
//                "   "
//        );
//        sr.setIngredient('A', Material.AMETHYST_BLOCK);
//        sr.setIngredient('M', m);
        ShapelessRecipe sr = new ShapelessRecipe(NamespacedKey.minecraft(s),item);
        sr.addIngredient(m);
        sr.addIngredient(Material.AMETHYST_BLOCK);
        sr.addIngredient(Material.AMETHYST_SHARD);
        sr.addIngredient(Material.NETHER_WART);
        sr.addIngredient(Material.BLAZE_ROD);
        sr.addIngredient(Material.WITHER_ROSE);
        Bukkit.getServer().addRecipe(sr);
    }

    private void enchantTool(Material m, String s,int enchantLevel) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta meta = item.getItemMeta();

        switch(enchantLevel){
            case 1:
                break;
            case 2:
                this.lootingBlockBonusLevel=2;
                this.damageAllLevel = 4;
                this.digSpeedLevel=3;
                break;
            case 3:
                this.lootingBlockBonusLevel=3;
                this.damageAllLevel = 4;
                this.digSpeedLevel=4;
                break;
            case 4:
                this.lootingBlockBonusLevel=3;
                this.damageAllLevel = 5;
                this.digSpeedLevel=5;
                break;
            case 5:
                this.lootingBlockBonusLevel=4;
                this.damageAllLevel = 6;
                this.digSpeedLevel=6;
                break;
            case 6:
                this.lootingBlockBonusLevel=4;
                this.damageAllLevel = 7;
                this.digSpeedLevel=7;
                break;
            default:
                break;
        }

        meta.addEnchant(Enchantment.DAMAGE_ALL, damageAllLevel, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, lootingBlockBonusLevel ,true);
        meta.addEnchant(Enchantment.DIG_SPEED, digSpeedLevel, true);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        item.setItemMeta(meta);
//        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft(s), item);

//        sr.shape(
//                "A  ",
//                " M ",
//                "   "
//        );
//        sr.setIngredient('A', Material.AMETHYST_BLOCK);
//        sr.setIngredient('M', m);
        ShapelessRecipe sr = new ShapelessRecipe(NamespacedKey.minecraft(s),item);
        sr.addIngredient(m);
        sr.addIngredient(Material.AMETHYST_BLOCK);
        sr.addIngredient(Material.AMETHYST_SHARD);
        sr.addIngredient(Material.NETHER_WART);
        sr.addIngredient(Material.BLAZE_ROD);
        sr.addIngredient(Material.WITHER_ROSE);
        Bukkit.getServer().addRecipe(sr);
    }

    private void addRecipes() {
        this.enchantWeapon(Material.WOODEN_SWORD, "op_wooden_sword",1);
        this.enchantWeapon(Material.STONE_SWORD, "op_stone_sword",2);
        this.enchantWeapon(Material.IRON_SWORD, "op_iron_sword",3);
        this.enchantWeapon(Material.GOLDEN_SWORD, "op_golden_sword",4);
        this.enchantWeapon(Material.DIAMOND_SWORD, "op_diamond_sword",5);
        this.enchantWeapon(Material.NETHERITE_SWORD, "op_netherite_sword",6);
//
        this.enchantTool(Material.WOODEN_PICKAXE, "op_wooden_pickaxe",1);
        this.enchantTool(Material.STONE_PICKAXE, "op_stone_pickaxe",1);
        this.enchantTool(Material.IRON_PICKAXE, "op_iron_pickaxe",3);
        this.enchantTool(Material.GOLDEN_PICKAXE, "op_golden_pickaxe",4);
        this.enchantTool(Material.DIAMOND_PICKAXE, "op_diamond_pickaxe",5);
        this.enchantTool(Material.NETHERITE_PICKAXE, "op_netherite_pickaxe",6);
//
        this.enchantTool(Material.WOODEN_AXE, "op_wooden_axe",1);
        this.enchantTool(Material.STONE_AXE, "op_stone_axe",1);
        this.enchantTool(Material.IRON_AXE, "op_iron_axe",3);
        this.enchantTool(Material.GOLDEN_AXE, "op_golden_axe",4);
        this.enchantTool(Material.DIAMOND_AXE, "op_diamond_axe",5);
        this.enchantTool(Material.NETHERITE_AXE, "op_netherite_axe",6);
//
        this.enchantTool(Material.WOODEN_SHOVEL, "op_wooden_shovel",1);
        this.enchantTool(Material.STONE_SHOVEL, "op_stone_shovel",1);
        this.enchantTool(Material.IRON_SHOVEL, "op_iron_shovel",3);
        this.enchantTool(Material.GOLDEN_SHOVEL, "op_golden_shovel",4);
        this.enchantTool(Material.DIAMOND_SHOVEL, "op_diamond_shovel",5);
        this.enchantTool(Material.NETHERITE_SHOVEL, "op_netherite_shovel",6);
    }

    public void init() {
        this.addRecipes();
    }
}
