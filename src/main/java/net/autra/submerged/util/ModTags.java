package net.autra.submerged.util;

import net.autra.submerged.Submerged;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> GEM_FINDER_ELIGIBLE_BLOCKS =
                createBlockTag("gem_finder_eligible_blocks");

        private static TagKey<Block> createBlockTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Submerged.MOD_ID, name));
        }

        private static TagKey<Block> createCommonBlockTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items {
        private static TagKey<Item> createItemTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Submerged.MOD_ID, name));
        }

        private static TagKey<Item> createCommonItemTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }
}
