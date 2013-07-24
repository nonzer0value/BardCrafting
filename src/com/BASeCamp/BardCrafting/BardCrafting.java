package com.BASeCamp.BardCrafting;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This is a custom build of BardCrafting. 
 *
 * Forked from https://github.com/BCProgramming/BardCrafting. Pray that it
 * works!
 *
 * @author nonzer0value
 */
public class BardCrafting extends JavaPlugin {

    ShapedRecipe ironBarding, goldBarding, diamondBarding, nameTag;

    @Override
    public void onDisable() {
        this.getLogger().log(Level.ALL, "BardCrafting Disabled.");
    }

    @Override
    public void onEnable() {
        // shaped recipes for Iron, Gold, and Diamond Armour:
        this.getLogger().log(Level.ALL, "BardCrafting Enabled.");

        // I = Iron Block
        // W = Wool
        // E = Emerald Block
        // G = Gold Block
        ironBarding = new ShapedRecipe(new ItemStack(Material.IRON_BARDING))
            .shape(   "IWI"
                    , "III"
                    , "GEG")
            .setIngredient('I', Material.IRON_BLOCK)
            .setIngredient('W', Material.WOOL)
            .setIngredient('E', Material.EMERALD_BLOCK)
            .setIngredient('G', Material.GOLD_BLOCK);

        // G = Gold Block
        // W = Wool
        // E = Emerald Block
        // D = Diamond Block
        goldBarding = new ShapedRecipe(new ItemStack(Material.GOLD_BARDING))
            .shape(   "GWG"
                    , "GGG"
                    , "DED")
            .setIngredient('G', Material.GOLD_BLOCK)
            .setIngredient('W', Material.WOOL)
            .setIngredient('E', Material.EMERALD_BLOCK)
            .setIngredient('D', Material.DIAMOND_BLOCK);

        // D = Diamond Block
        // W = Wool
        // L = Leather
        // E = Emerald Block
        diamondBarding = new ShapedRecipe(new ItemStack(Material.DIAMOND_BARDING))
            .shape(   "DWD"
                    , "DDD"
                    , "DED")
            .setIngredient('D', Material.DIAMOND_BLOCK)
            .setIngredient('W', Material.WOOL)
            .setIngredient('E', Material.EMERALD_BLOCK);

        // Barding recipes
        Bukkit.addRecipe(IronBarding);
        Bukkit.addRecipe(GoldBarding);
        Bukkit.addRecipe(DiamondBarding);
    }
}
