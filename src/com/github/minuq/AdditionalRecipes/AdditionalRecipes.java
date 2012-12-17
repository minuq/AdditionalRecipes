package com.github.minuq.AdditionalRecipes;

import java.io.File;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class AdditionalRecipes extends JavaPlugin
{
  public void onEnable()
  {
    if (!new File(getDataFolder(), "config.yml").exists()) {
      saveDefaultConfig();
    }
    reloadConfig();
    
    getLogger().info("AdditionalRecipes loaded");

    ShapedRecipe web = new ShapedRecipe(new ItemStack(Material.WEB, 1));
    web.shape(new String[] { "AAA", "AAA", "AAA" });
    web.setIngredient('A', Material.STRING);
    getServer().addRecipe(web);

    ShapelessRecipe string = new ShapelessRecipe(new ItemStack(Material.STRING, 2));
    string.addIngredient(Material.WOOL);
    getServer().addRecipe(string);

    ShapelessRecipe redstone = new ShapelessRecipe(new ItemStack(Material.REDSTONE, 9));
    redstone.addIngredient(Material.REDSTONE_ORE);
    getServer().addRecipe(redstone);

    ShapedRecipe redstoneBlock = new ShapedRecipe(new ItemStack(Material.REDSTONE_ORE, 1));
    redstoneBlock.shape(new String[] { "AAA", "AAA", "AAA" });
    redstoneBlock.setIngredient('A', Material.REDSTONE);
    getServer().addRecipe(redstoneBlock);

    ShapedRecipe netherBrick = new ShapedRecipe(new ItemStack(Material.NETHER_BRICK, 1));
    netherBrick.shape(new String[] { "AA ", "AA ", "   " });
    netherBrick.setIngredient('A', Material.NETHERRACK);
    getServer().addRecipe(netherBrick);

    ShapedRecipe mossyCobble = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE, 5));
    mossyCobble.shape(new String[] { "ABA", "BAB", "ABA" });
    mossyCobble.setIngredient('A', Material.COBBLESTONE);
    mossyCobble.setIngredient('B', Material.SEEDS);
    getServer().addRecipe(mossyCobble);

    ShapedRecipe iceBlock = new ShapedRecipe(new ItemStack(Material.ICE, 3));
    iceBlock.shape(new String[] { "AAA", "AAA", "AAA" });
    iceBlock.setIngredient('A', Material.SNOW_BALL);
    getServer().addRecipe(iceBlock);

    ShapedRecipe crackedStoneBrick = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 5, (short)0, Byte.valueOf((byte)2)));
    crackedStoneBrick.shape(new String[] { "ABA", "BAB", "ABA" });
    crackedStoneBrick.setIngredient('A', Material.SMOOTH_BRICK);
    crackedStoneBrick.setIngredient('B', Material.FLINT);
    getServer().addRecipe(crackedStoneBrick);

    ShapedRecipe mossyStoneBricks = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 5, (short)0, Byte.valueOf((byte)1)));
    mossyStoneBricks.shape(new String[] { "ABA", "BAB", "ABA" });
    mossyStoneBricks.setIngredient('A', Material.SMOOTH_BRICK);
    mossyStoneBricks.setIngredient('B', Material.SEEDS);
    getServer().addRecipe(mossyStoneBricks);

    ShapedRecipe chiseledStoneBrick = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 5, (short)0, Byte.valueOf((byte)3)));
    chiseledStoneBrick.shape(new String[] { "ABA", "BAB", "ABA" });
    chiseledStoneBrick.setIngredient('A', Material.SMOOTH_BRICK);
    chiseledStoneBrick.setIngredient('B', Material.STONE);
    getServer().addRecipe(chiseledStoneBrick);

    ShapedRecipe clayBlock = new ShapedRecipe(new ItemStack(Material.CLAY, 9));
    clayBlock.shape(new String[] { "AAA", "BBB", "CCC" });
    clayBlock.setIngredient('A', Material.SAND);
    clayBlock.setIngredient('B', Material.GRAVEL);
    clayBlock.setIngredient('C', Material.DIRT);
    getServer().addRecipe(clayBlock);

    
    if (getConfig().getBoolean("upgradeItems"))
    {

      ShapelessRecipe stoneAxe = new ShapelessRecipe(new ItemStack(Material.STONE_AXE, 1));
      stoneAxe.addIngredient(Material.WOOD_AXE);
      stoneAxe.addIngredient(3, Material.STONE);
      getServer().addRecipe(stoneAxe);

      ShapelessRecipe cobblestoneAxe = new ShapelessRecipe(new ItemStack(Material.STONE_AXE, 1));
      cobblestoneAxe.addIngredient(Material.WOOD_AXE);
      cobblestoneAxe.addIngredient(3, Material.COBBLESTONE);
      getServer().addRecipe(cobblestoneAxe);

      ShapelessRecipe ironAxe = new ShapelessRecipe(new ItemStack(Material.IRON_AXE, 1));
      ironAxe.addIngredient(Material.STONE_AXE);
      ironAxe.addIngredient(3, Material.IRON_INGOT);
      getServer().addRecipe(ironAxe);

      ShapelessRecipe goldAxe = new ShapelessRecipe(new ItemStack(Material.GOLD_AXE, 1));
      goldAxe.addIngredient(Material.STONE_AXE);
      goldAxe.addIngredient(3, Material.GOLD_INGOT);
      getServer().addRecipe(goldAxe);

      ShapelessRecipe ironDiamondAxe = new ShapelessRecipe(new ItemStack(Material.DIAMOND_AXE, 1));
      ironDiamondAxe.addIngredient(Material.IRON_AXE);
      ironDiamondAxe.addIngredient(3, Material.DIAMOND);
      getServer().addRecipe(ironDiamondAxe);

      ShapelessRecipe goldDiamondAxe = new ShapelessRecipe(new ItemStack(Material.DIAMOND_AXE, 1));
      goldDiamondAxe.addIngredient(Material.GOLD_AXE);
      goldDiamondAxe.addIngredient(3, Material.DIAMOND);
      getServer().addRecipe(goldDiamondAxe);

      ShapelessRecipe stoneHoe = new ShapelessRecipe(new ItemStack(Material.STONE_HOE, 1));
      stoneHoe.addIngredient(Material.WOOD_HOE);
      stoneHoe.addIngredient(2, Material.STONE);
      getServer().addRecipe(stoneHoe);

      ShapelessRecipe cobblestoneHoe = new ShapelessRecipe(new ItemStack(Material.STONE_HOE, 1));
      cobblestoneHoe.addIngredient(Material.WOOD_HOE);
      cobblestoneHoe.addIngredient(2, Material.COBBLESTONE);
      getServer().addRecipe(cobblestoneHoe);

      ShapelessRecipe ironHoe = new ShapelessRecipe(new ItemStack(Material.IRON_HOE, 1));
      ironHoe.addIngredient(Material.STONE_HOE);
      ironHoe.addIngredient(2, Material.IRON_INGOT);
      getServer().addRecipe(ironHoe);

      ShapelessRecipe goldHoe = new ShapelessRecipe(new ItemStack(Material.GOLD_HOE, 1));
      goldHoe.addIngredient(Material.STONE_HOE);
      goldHoe.addIngredient(2, Material.GOLD_INGOT);
      getServer().addRecipe(goldHoe);

      ShapelessRecipe ironDiamondHoe = new ShapelessRecipe(new ItemStack(Material.DIAMOND_HOE, 1));
      ironDiamondHoe.addIngredient(Material.IRON_HOE);
      ironDiamondHoe.addIngredient(2, Material.DIAMOND);
      getServer().addRecipe(ironDiamondHoe);

      ShapelessRecipe goldDiamondHoe = new ShapelessRecipe(new ItemStack(Material.DIAMOND_HOE, 1));
      goldDiamondHoe.addIngredient(Material.GOLD_HOE);
      goldDiamondHoe.addIngredient(2, Material.DIAMOND);
      getServer().addRecipe(goldDiamondHoe);

      ShapelessRecipe stoneSpade = new ShapelessRecipe(new ItemStack(Material.STONE_SPADE, 1));
      stoneSpade.addIngredient(Material.WOOD_SPADE);
      stoneSpade.addIngredient(Material.STONE);
      getServer().addRecipe(stoneSpade);

      ShapelessRecipe cobblestoneSpade = new ShapelessRecipe(new ItemStack(Material.STONE_SPADE, 1));
      cobblestoneSpade.addIngredient(Material.WOOD_SPADE);
      cobblestoneSpade.addIngredient(Material.COBBLESTONE);
      getServer().addRecipe(cobblestoneSpade);

      ShapelessRecipe ironSpade = new ShapelessRecipe(new ItemStack(Material.IRON_SPADE, 1));
      ironSpade.addIngredient(Material.STONE_SPADE);
      ironSpade.addIngredient(Material.IRON_INGOT);
      getServer().addRecipe(ironSpade);

      ShapelessRecipe goldSpade = new ShapelessRecipe(new ItemStack(Material.GOLD_SPADE, 1));
      goldSpade.addIngredient(Material.STONE_SPADE);
      goldSpade.addIngredient(Material.GOLD_INGOT);
      getServer().addRecipe(goldSpade);

      ShapelessRecipe ironDiamondSpade = new ShapelessRecipe(new ItemStack(Material.DIAMOND_SPADE, 1));
      ironDiamondSpade.addIngredient(Material.IRON_SPADE);
      ironDiamondSpade.addIngredient(Material.DIAMOND);
      getServer().addRecipe(ironDiamondSpade);

      ShapelessRecipe goldDiamondSpade = new ShapelessRecipe(new ItemStack(Material.DIAMOND_SPADE, 1));
      goldDiamondSpade.addIngredient(Material.GOLD_SPADE);
      goldDiamondSpade.addIngredient(Material.DIAMOND);
      getServer().addRecipe(goldDiamondSpade);

      ShapelessRecipe stonePickaxe = new ShapelessRecipe(new ItemStack(Material.STONE_PICKAXE, 1));
      stonePickaxe.addIngredient(Material.WOOD_PICKAXE);
      stonePickaxe.addIngredient(3, Material.STONE);
      getServer().addRecipe(stonePickaxe);

      ShapelessRecipe cobblestonePickaxe = new ShapelessRecipe(new ItemStack(Material.STONE_PICKAXE, 1));
      cobblestonePickaxe.addIngredient(Material.WOOD_PICKAXE);
      cobblestonePickaxe.addIngredient(3, Material.COBBLESTONE);
      getServer().addRecipe(cobblestonePickaxe);

      ShapelessRecipe ironPickaxe = new ShapelessRecipe(new ItemStack(Material.IRON_PICKAXE, 1));
      ironPickaxe.addIngredient(Material.STONE_PICKAXE);
      ironPickaxe.addIngredient(3, Material.IRON_INGOT);
      getServer().addRecipe(ironPickaxe);

      ShapelessRecipe goldPickaxe = new ShapelessRecipe(new ItemStack(Material.GOLD_PICKAXE, 1));
      goldPickaxe.addIngredient(Material.STONE_PICKAXE);
      goldPickaxe.addIngredient(3, Material.GOLD_INGOT);
      getServer().addRecipe(goldPickaxe);

      ShapelessRecipe ironDiamondPickaxe = new ShapelessRecipe(new ItemStack(Material.DIAMOND_PICKAXE, 1));
      ironDiamondPickaxe.addIngredient(Material.IRON_PICKAXE);
      ironDiamondPickaxe.addIngredient(3, Material.DIAMOND);
      getServer().addRecipe(ironDiamondPickaxe);

      ShapelessRecipe goldDiamondPickaxe = new ShapelessRecipe(new ItemStack(Material.DIAMOND_PICKAXE, 1));
      goldDiamondPickaxe.addIngredient(Material.GOLD_PICKAXE);
      goldDiamondPickaxe.addIngredient(3, Material.DIAMOND);
      getServer().addRecipe(goldDiamondPickaxe);

      ShapelessRecipe stoneSword = new ShapelessRecipe(new ItemStack(Material.STONE_SWORD, 1));
      stoneSword.addIngredient(Material.WOOD_SWORD);
      stoneSword.addIngredient(2, Material.STONE);
      getServer().addRecipe(stoneSword);

      ShapelessRecipe cobblestoneSword = new ShapelessRecipe(new ItemStack(Material.STONE_SWORD, 1));
      cobblestoneSword.addIngredient(Material.WOOD_SWORD);
      cobblestoneSword.addIngredient(2, Material.COBBLESTONE);
      getServer().addRecipe(cobblestoneSword);

      ShapelessRecipe ironSword = new ShapelessRecipe(new ItemStack(Material.IRON_SWORD, 1));
      ironSword.addIngredient(Material.STONE_SWORD);
      ironSword.addIngredient(2, Material.IRON_INGOT);
      getServer().addRecipe(ironSword);

      ShapelessRecipe goldSword = new ShapelessRecipe(new ItemStack(Material.GOLD_SWORD, 1));
      goldSword.addIngredient(Material.STONE_SWORD);
      goldSword.addIngredient(2, Material.GOLD_INGOT);
      getServer().addRecipe(goldSword);

      ShapelessRecipe ironDiamondSword = new ShapelessRecipe(new ItemStack(Material.DIAMOND_SWORD, 1));
      ironDiamondSword.addIngredient(Material.IRON_SWORD);
      ironDiamondSword.addIngredient(2, Material.DIAMOND);
      getServer().addRecipe(ironDiamondSword);

      ShapelessRecipe goldDiamondSword = new ShapelessRecipe(new ItemStack(Material.DIAMOND_SWORD, 1));
      goldDiamondSword.addIngredient(Material.GOLD_SWORD);
      goldDiamondSword.addIngredient(2, Material.DIAMOND);
      getServer().addRecipe(goldDiamondSword);
    }
  }
}