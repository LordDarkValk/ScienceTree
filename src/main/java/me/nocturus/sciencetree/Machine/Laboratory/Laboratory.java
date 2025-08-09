public void loadMachineConfigs() {
    File machineFolder = new File(getDataFolder(), "Machines/MyMachine");

    for (String mk : Arrays.asList("MK1", "MK2", "MK3")) {
        File mkFolder = new File(machineFolder, mk);

        File configFile = new File(mkFolder, mk + ".yml");
        File recipeFile = new File(mkFolder, "Recipe.yml");

        if (configFile.exists()) {
            YamlConfiguration config = YamlConfiguration.loadConfiguration(configFile);
            // Lê dados do MK(N)
            int energyUse = config.getInt("energy-use");
            String block = config.getString("block");

            // Aqui você registra a máquina com esses dados...
        }

        if (recipeFile.exists()) {
            YamlConfiguration recipe = YamlConfiguration.loadConfiguration(recipeFile);
            // Lê e registra receita
        }
    }
}

