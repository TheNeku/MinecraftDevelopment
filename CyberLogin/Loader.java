package eu.neku.cyberlogin.common;

import eu.neku.cyberlogin.common.utils.CyberLoginLogger;

public class Loader {
    public static void onEnable(Object pluginInstance) {
        String platform = detectPlatform();

        if (platform == null) {
            CyberLoginLogger.logError("Piattaforma non riconosciuta! Il plugin verrà disattivato.");
            return;
        }

        CyberLoginLogger.printStartupBanner(platform);
        loadPlatformClass(platform, pluginInstance);
    }

    private static String detectPlatform() {
        if (isClassPresent("org.bukkit.Bukkit")) {
            return "Spigot";
        } else if (isClassPresent("net.md_5.bungee.api.ProxyServer")) {
            return "BungeeCord";
        } else if (isClassPresent("com.velocitypowered.api.proxy.ProxyServer")) {
            return "Velocity";
        }
        return null;
    }

    private static void loadPlatformClass(String platform, Object pluginInstance) {
        String className = "eu.neku.cyberlogin." + platform.toLowerCase() + ".Loader" + platform;
        try {
            Class<?> clazz = Class.forName(className);
            Object instance = clazz.getDeclaredConstructor().newInstance();
            clazz.getMethod("enable", pluginInstance.getClass()).invoke(instance, pluginInstance);
        } catch (Exception e) {
            CyberLoginLogger.logError("Errore nel caricamento di " + className + ": " + e.getMessage());
        }
    }

    private static boolean isClassPresent(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException ignored) {
            return false;
        }
    }
}
