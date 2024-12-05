package net.autra.submerged.villager;
import com.google.common.collect.ImmutableSet;
import net.autra.submerged.Submerged;
import net.autra.submerged.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> GEM_POI_KEY = registerPoikey("gempoi");
    public static final PointOfInterestType GEM_POI = registerPoi("gempoi", ModBlocks.SAPPHIRE_BLOCK);
    public static final VillagerProfession GEM_CUTTER = registerProfession("gemcutter", GEM_POI_KEY);

   private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
       return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(Submerged.MOD_ID, name),
               new VillagerProfession(name, entry-> true, entry -> entry.matchesKey(type),
                       ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_CLERIC));
   }

   private static PointOfInterestType registerPoi(String name, Block block){
       return PointOfInterestHelper.register(new Identifier(Submerged.MOD_ID, name),
               1, 1, block);
   }

    private static RegistryKey<PointOfInterestType> registerPoikey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(Submerged.MOD_ID, name));
    }

    public static void registerVillagers(){
        Submerged.LOGGER.info("Registering Villagers!");
    }
}
