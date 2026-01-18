package com.example.examplemod.item.tool;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class ModToolTiers {
    public static final Tier ULTIMATE = new Tier() {
        @Override
        public int getUses() { 
            return 3000; 
        }
        
        @Override
        public float getSpeed() { 
            return 12.0f; 
        }
        
        @Override
        public float getAttackDamageBonus() { 
            return 0.0f; 
        }
        
        @Override
        public int getEnchantmentValue() { 
            return 18; 
        }
        
        @Override
        public Ingredient getRepairIngredient() { 
            return Ingredient.EMPTY; 
        }
        
        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
        }
    };
}
