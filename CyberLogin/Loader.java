//Frankly I used this class in my pl for messages on the detect platform!

package eu.neku.cyberlogin.common;

import eu.neku.cyberlogin.common.utils.CyberLogger;
import eu.neku.cyberlogin.spigot.SpigotLoader;
import eu.neku.cyberlogin.bungee.BungeeLoader;
import eu.neku.cyberlogin.velocity.VelocityLoader;

public class Loader {

    private static Object platformInstance;

    public static void onEnable(Object instance) {
        CyberLogger.printBanner();
        platformInstance = instance;
        String platform = detectPlatform();

        if (platform != null) {
            CyberLogger.success("🌐 Detected " + platform);
        } else {
            CyberLogger.error("❌ No valid platform detected. Plugin disabled.");
        }
    }

    public static void onDisable() {
        if (platformInstance instanceof SpigotLoader spigotLoader) {
            spigotLoader.onDisable();
        } else if (platformInstance instanceof BungeeLoader bungeeLoader) {
            bungeeLoader.onDisable();
        } else if (platformInstance instanceof VelocityLoader velocityLoader) {
            velocityLoader.onDisable();
        }

        CyberLogger.warn("🔻 CyberLogin has been disabled.");
    }

    private static String detectPlatform() {
        String packageName = platformInstance.getClass().getPackageName().toLowerCase();

        if (packageName.contains("bungee")) {
            return "BungeeCord";
        } else if (packageName.contains("spigot") || packageName.contains("bukkit")) {
            return "Spigot";
        } else if (packageName.contains("velocity")) {
            return "Velocity";
        }
        return null;
    }
}
