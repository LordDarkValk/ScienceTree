package me.nocturus.sciencetree;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Pack {

    public static void setup(JavaPlugin plugin) {
        // Receita
        ItemStack[] recipe = {
                new ItemStack(Material.DIAMOND), null, new ItemStack(Material.DIAMOND),
                null, SlimefunItems.CARBONADO, null,
                new ItemStack(Material.DIAMOND), null, new ItemStack(Material.DIAMOND)
        };

        // Item 1: Primitivo
        SlimefunItemStack primitivePack = new SlimefunItemStack(
                "PRIMITIVE_PACK_ITEM",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWNjODMzYmE4YzE0NmJmMTU4MGM2MDEwOTBhODNlYmNkZDczYTlmMzJlZmY0ZDgzM2E3N2FhMTBlY2U2NjYzNyJ9fX0=",
                "&aPacote Primitivo",
                "",
                "&7Feito com recursos primitivos, para ser usado no uploader!"
        );

        // Item 2: Básico
        SlimefunItemStack basicPack = new SlimefunItemStack(
                "BASIC_PACK_ITEM",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWQ5MzU4YTZlNGU5ZTRlOGZjNjQ4M2MwNjJkNzU5ZjE3NmMwY2Q1NmEzOTExYjU3ZDkwYTI3NjMzZWU0NmIzMyJ9fX0=",
                "&aPacote Básico",
                "",
                "&7Feito com recursos básicos, para ser usado no uploader!"
        );

        // Item 3: Tech Básico
        SlimefunItemStack techbasicPack = new SlimefunItemStack(
                "TECH_BASIC_PACK_ITEM",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTAxYzYzYzIwM2ExODQxZGUyN2EwZTA5YTI5NWY1Yjg3MzM2MjcwMjRmMTY2OGEwMWQyMDE4NmEzZjg2MzA0MCJ9fX0=",
                "&aPacote de Tecnologia Básico",
                "",
                "&7Feito com recursos básicos de tecnologia, para ser usado no uploader!"
        );
        
        // Item 4: Magic Básico
        SlimefunItemStack magicbasicPack = new SlimefunItemStack(
                "MAGIC_BASIC_PACK_ITEM",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjEwMzhjZGM4NDIzNGI1YWZiM2FlYTg1M2JmM2QwNTE3NWQxOWFlN2I0ODc1YTkxYjUyZjc2NmMwN2IzZGIwYiJ9fX0=",
                "&aPacote de Magia Básico",
                "",
                "&7Feito com recursos básicos de magia, para ser usado no uploader!"
        );
        
        // Item 5: Avançado
        SlimefunItemStack advancedPack = new SlimefunItemStack(
                "ADVANCED_PACK_ITEM",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTUxYjQ5MjE2MzNiMTFiYjNmZTU0MzlhNjg4MzkwZmE5YmU3NWFjOWVjOGFjM2ZmNzBlYzNlMmMzNDNkZjU1OSJ9fX0=",
                "&aPacote Avançado",
                "",
                "&7Feito com recursos avançados, para ser usado no uploader!"
        );
                
        // Item 6: Tech Avançado
        SlimefunItemStack techadvancedPack = new SlimefunItemStack(
                "TECH_ADVANCED_PACK_ITEM",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGMwYzQ5ZDRkMjJhZjhjZDc1Y2M2YzhhYjE4ZWE0OTQwYjY4NzViOGVlMDM2OTcwYjY5MjcyMjA4M2Y2OGNmYiJ9fX0=",
                "&aPacote de Technologia Avançado",
                "",
                "&7Feito com recursos technologicos avançados, para ser usado no uploader!"
        );
        
        // Item 7: Magic Avançado
        SlimefunItemStack magicadvancedPack = new SlimefunItemStack(
                "MAGIC_ADVANCED_PACK_ITEM",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWI0MjdlM2E0NzI1NTI2MjQ2NzhiMzM5ZjQwODk2YjQ4ZWUzMGNjMWM5OGIyZjAyZTZiYTg2NTMzOWVjM2U5OSJ9fX0=",
                "&aPacote de Magia Avançado",
                "",
                "&7Feito com recursos magicos avançados, para ser usado no uploader!"
        );
        
        // Item 8: Droid
        SlimefunItemStack droidPack = new SlimefunItemStack(
                "DROID_PACK_ITEM",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRiYjZjNjJkYjhhYTIxYzMzNDFmOTVhYjdjMzI3Nzc1NTFiMjZmNmRlZDUwZmJkOWUxM2Y1YTI0MmZlM2EzMiJ9fX0=",
                "&aPacote Droid",
                "",
                "&7Feito com recursos technologicos de androids, para ser usado no uploader!"
        );
        
        // Item 9: MK
        SlimefunItemStack MKPack = new SlimefunItemStack(
                "TECH_ADVANCED_PACK_ITEM",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY2M2ExNzg2Mzg0MDBmMTZjNzA3M2M2M2ZlZjEzNTcyZmFiOWI2ZjQyZGY5ZWEwMzljM2IzZjY3NzNmYWY5NCJ9fX0=",
                "&aPacote de Technologia Avançado",
                "",
                "&7Feito com recursos technologicos para expandir as technologias MK's, para ser usado no uploader!"
        );

        new SlimefunItem(ItemCategory.PACK_CATEGORY, primitivePack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register((SlimefunAddon) plugin);
        new SlimefunItem(ItemCategory.PACK_CATEGORY, basicPack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register((SlimefunAddon) plugin);
        new SlimefunItem(ItemCategory.PACK_CATEGORY, techbasicPack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register((SlimefunAddon) plugin);
        new SlimefunItem(ItemCategory.PACK_CATEGORY, magicbasicPack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register((SlimefunAddon) plugin);
        new SlimefunItem(ItemCategory.PACK_CATEGORY, advancedPack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register((SlimefunAddon) plugin);
        new SlimefunItem(ItemCategory.PACK_CATEGORY, techadvancedPack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register((SlimefunAddon) plugin);
        new SlimefunItem(ItemCategory.PACK_CATEGORY, magicadvancedPack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register((SlimefunAddon) plugin);
        new SlimefunItem(ItemCategory.PACK_CATEGORY, droidPack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register((SlimefunAddon) plugin);
        new SlimefunItem(ItemCategory.PACK_CATEGORY, MKPack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register((SlimefunAddon) plugin);

    }
}
