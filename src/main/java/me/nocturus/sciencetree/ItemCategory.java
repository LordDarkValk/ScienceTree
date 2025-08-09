package me.nocturus.sciencetree;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public class ItemCategory {

    public static NestedItemGroup MAIN_CATEGORY;
    public static SubItemGroup PACK_CATEGORY;
    public static SubItemGroup MACHINE_CATEGORY;
    public static SubItemGroup COMPONENTES_CATEGORY;
    public static SubItemGroup OTHERS_CATEGORY;

    public static void setup(JavaPlugin plugin) {
        // Categoria principal
        NamespacedKey categoryKey = new NamespacedKey(plugin, "sciencetree_category");
        CustomItemStack mainIcon = new CustomItemStack(Material.OAK_SAPLING, "&5ScienceTree");
        MAIN_CATEGORY = new NestedItemGroup(categoryKey, mainIcon);

        // Subcategoria Pacotes (com cabeça personalizada)
        NamespacedKey packKey = new NamespacedKey(plugin, "pack_category");
        SlimefunItemStack packIcon = new SlimefunItemStack(
                "PACKAGE_HEAD_ICON",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmQ0YTMyNTdmMzQ0NmMzODQxYmY3NzA4YjQxYmIzNzM1ZGI1ZmU3NTI1MzQ3ZGE3ZGE2ZTU1M2QyMjA4NWQ1NCJ9fX0=",
                "&4Pacotes"
        );
        PACK_CATEGORY = new SubItemGroup(packKey, MAIN_CATEGORY, packIcon);

        // Subcategoria Máquinas
        NamespacedKey machineKey = new NamespacedKey(plugin, "machine_category");
        CustomItemStack machineIcon = new CustomItemStack(Material.IRON_BLOCK, "&6Máquinas");
        MACHINE_CATEGORY = new SubItemGroup(machineKey, MAIN_CATEGORY, machineIcon);

        // Subcategoria Componentes
        NamespacedKey componentesKey = new NamespacedKey(plugin, "componentes_category");
        CustomItemStack componentesIcon = new CustomItemStack(Material.REDSTONE, "&bComponentes");
        COMPONENTES_CATEGORY = new SubItemGroup(componentesKey, MAIN_CATEGORY, componentesIcon);

        // Subcategoria Outros (com cabeça personalizada)
        NamespacedKey othersKey = new NamespacedKey(plugin, "others_category");
        SlimefunItemStack othersIcon = new SlimefunItemStack(
                "GLOBE_HEAD_ICON",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmM2MjExMGQ4MTg4NDQxZDIxNzk0NDM0ZjY3ZDEyYTAyMWI3NDAyYzhkYWE0MmQ0ZmVhMzIzZTdlMTllMGJiNyJ9fX0=",
                "&aOutros"
        );
        OTHERS_CATEGORY = new SubItemGroup(othersKey, MAIN_CATEGORY, othersIcon);
    }
}
