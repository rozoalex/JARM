package victinix.jarm.lib;

import net.minecraftforge.common.config.Configuration;

public class Configurations {

    public static Configuration config;
    public static boolean configExists;

    public static boolean cookedSquidRegistry;
    public static boolean coolSquidRegistry;
    public static boolean hotdogRegistry;
    public static boolean diamondHandbagRegistry;
    public static boolean emeraldSwordRegistry;
    public static boolean randomGunRegistry;

    public static boolean diamondHandbagRecoil;
    public static int diamondHandbagRecoilChance;
    public static String randomGunText;

    public static boolean refreshConfig() {

        String category;

        category = "registry";
        cookedSquidRegistry = config.get(category, "cookedSquidRegistry", true).getBoolean(true);
        coolSquidRegistry = config.get(category, "coolSquidRegistry", true).getBoolean(true);
        hotdogRegistry = config.get(category, "hotdogRegistry", true).getBoolean(true);
        diamondHandbagRegistry = config.get(category, "diamondHandbagRegistry", true).getBoolean(true);
        emeraldSwordRegistry = config.get(category, "emeraldSwordRegistry", true).getBoolean(true);
        randomGunRegistry = config.get(category, "randomGunRegistry", true).getBoolean(true);

        category = "food";

        category = "weapons";
        diamondHandbagRecoil = config.get(category, "diamondHandbagRecoil", true, "Whether the Diamond Handbag gives recoil").getBoolean(true);
        diamondHandbagRecoilChance = config.get(category, "diamondHandRecoilChance", 50, "Chance of Diamond Handbag recoil", 1, 100).getInt();
        randomGunText = config.get(category, "randomGunText", "Hello world", "Text that appears when Random Gun is used.").getString();

        if(config.hasChanged()) {
            config.save();
        }

        return true;
    }
}
