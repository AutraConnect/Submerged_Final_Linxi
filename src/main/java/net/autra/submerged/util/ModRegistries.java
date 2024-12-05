package net.autra.submerged.util;

import net.autra.submerged.item.ModItems;
import net.autra.submerged.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {

    public static void registerModRegistries(){
        registerFuels();
        registerCustomTrades();
    }

    private static void registerFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.IMBUED_SAPPHIRE,200);
    }

    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC,1,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD,2),
                        new ItemStack(ModItems.SAPPHIRE,2), 6, 2, 0.02f
                ));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BOOK,4),
                            new ItemStack(ModItems.SAPPHIRE,1), 6, 2, 0.02f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,17),
                            new ItemStack(ModItems.SAPPHIRE_SWORD,1), 2, 8, 0.02f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,19),
                            new ItemStack(ModItems.SAPPHIRE_PICKAXE,1), 2, 8, 0.02f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PAPER,12),
                            new ItemStack(Items.GLOWSTONE_DUST,2),
                            new ItemStack(ModItems.SAPPHIRE_PICKAXE,1), 8, 2, 0.02f
                    ));
                });

        //Custom Villager Trades
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModItems.SAPPHIRE,2), 8, 2, 0.02f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AMETHYST_SHARD,8),
                            new ItemStack(ModItems.SAPPHIRE,2), 8, 2, 0.02f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.SAPPHIRE,4),
                            new ItemStack(Items.DIAMOND,1), 4, 4, 0.04f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND,2),
                            new ItemStack(ModItems.SAPPHIRE,9), 3, 4, 0.04f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(ModItems.SAPPHIRE,9), 8, 2, 0.02f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,5),
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(ModItems.GEM_FINDER,1), 2, 2, 0.02f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.SAPPHIRE,1),
                            new ItemStack(Items.ENDER_EYE, 4),
                            new ItemStack(ModItems.EMPOWERED_SAPPHIRE,1), 2, 2, 0.02f
                    ));
                });
    }
}
