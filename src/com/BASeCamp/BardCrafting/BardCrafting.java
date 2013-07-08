package com.BASeCamp.BardCrafting;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class BardCrafting extends JavaPlugin {

	ShapedRecipe IronBarding,GoldBarding,DiamondBarding,NameTag;
	
	
	@Override
	public void onDisable(){
		this.getLogger().log(Level.ALL, "BardCrafting Disabled.");
		
		
		
	}
	@Override
	public void onEnable(){
		//shaped recipes for Iron, Gold, and Diamond Armour:
		this.getLogger().log(Level.ALL, "BardCrafting Enabled.");
		
		/*
		 * IWI
		 * III
		 * LLL
		 * 
		 * I is material block, W is wool, L is leather.
		 */
		
		
		
		IronBarding = new ShapedRecipe(new ItemStack(Material.IRON_BARDING));
		IronBarding.shape("IWI","III","LGL");
		IronBarding.setIngredient('I', Material.IRON_BLOCK);
		IronBarding.setIngredient('W', Material.WOOL);
		IronBarding.setIngredient('L', Material.LEATHER);
		IronBarding.setIngredient('G', Material.GOLD_BLOCK);
		
		GoldBarding = new ShapedRecipe(new ItemStack(Material.GOLD_BARDING));
		GoldBarding.shape("GWG","GGG","LDL");
		GoldBarding.setIngredient('G', Material.GOLD_BLOCK);
		GoldBarding.setIngredient('W', Material.WOOL);
		GoldBarding.setIngredient('L', Material.LEATHER);
		GoldBarding.setIngredient('D', Material.DIAMOND_BLOCK);
		
		DiamondBarding = new ShapedRecipe(new ItemStack(Material.DIAMOND_BARDING));
		DiamondBarding.shape("DWD","DDD","LEL");
		DiamondBarding.setIngredient('D', Material.DIAMOND_BLOCK);
		DiamondBarding.setIngredient('W', Material.WOOL);
		DiamondBarding.setIngredient('L', Material.LEATHER);
		DiamondBarding.setIngredient('E', Material.EMERALD_BLOCK);
		
		//nametag
		/*
		 * 
		 * E
		 * III
		 *   L
		 * 
		 * E=Emerald, I=Iron Block, L= Leash
		 */
		NameTag = new ShapedRecipe(new ItemStack(Material.NAME_TAG));
		NameTag.shape("  L","III","E  ");
		NameTag.setIngredient('E', Material.EMERALD);
		NameTag.setIngredient('I', Material.IRON_BLOCK);
		NameTag.setIngredient('L', Material.LEASH);
		
		
		
		
		//Barding recipes
		Bukkit.addRecipe(IronBarding);
		Bukkit.addRecipe(GoldBarding);
		Bukkit.addRecipe(DiamondBarding);
		//NameTag
		Bukkit.addRecipe(NameTag);
		
		
		
	}
	
}
