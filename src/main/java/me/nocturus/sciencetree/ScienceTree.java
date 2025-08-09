package me.nocturus.sciencetree;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;

public class ScienceTree extends JavaPlugin implements SlimefunAddon {

    private static ScienceTree instance;

    @Override
    public void onEnable() {
        instance = this;

        // Inicializa as categorias
        ItemCategory.setup(this);

        // Registra os itens
        Pack.setup(this);
    }

    public static ScienceTree getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {}

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }
}
