//I want to give you an idea for making cute Loggers! Maybe you can take inspiration from here 😉(For [ASCII FONT](https://manytools.org/hacker-tools/ascii-banner/))


//Semplified Class
import java.util.logging.Level;
import java.util.logging.Logger;

public class CyberLogger {

    private static final Logger logger = Logger.getLogger("CyberLogin");

    private static final String PREFIX = "\u001B[36m[CyberLogin] \u001B[0m";
    private static final String ANSI_RESET = "\u001B[0m";

    private static final String[] COLORS = {
            "\u001B[31m",
            "\u001B[33m",
            "\u001B[32m",
            "\u001B[36m",
            "\u001B[34m",
            "\u001B[35m",
            "\u001B[91m",
            "\u001B[93m",
            "\u001B[92m",
            "\u001B[96m",
            "\u001B[94m",
            "\u001B[95m"
    };

    public static void printBanner() {
        System.out.println("\u001B[36m" +
                " _______   _______ ___________ _     _____ _____ _____ _   _  \n" +
                "/  __ \\ \\ / / ___ \\  ___| ___ \\ |   |  _  |  __ \\_   _| \\ | | \n" +
                "| /  \\/\\ V /| |_/ / |__ | |_/ / |   | | | | |  \\/ | | |  \\| | \n" +
                "| |     \\ / | ___ \\  __||    /| |   | | | | | __  | | | . ` | \n" +
                "| \\__/\\ | | | |_/ / |___| |\\ \\| |___\\ \\_/ / |_\\ \\_| |_| |\\  | \n" +
                " \\____/ \\_/ \\____/\\____/\\_| \\_\\_____/\\___/ \\____/\\___/\\_| \\_/ \n"
                + ANSI_RESET);
        printMadeWithLove();
    }

    public static void printMadeWithLove() {
        String text = "                          Made with the ♥ by TheNeku";
        StringBuilder animatedText = new StringBuilder();

        int colorIndex = 0;
        for (char c : text.toCharArray()) {
            if (c == '♥' || c == 'T' || c == 'h' || c == 'e' || c == 'N' || c == 'e' || c == 'k' || c == 'u') {
                animatedText.append(COLORS[colorIndex % COLORS.length]).append(c);
                colorIndex++;
            } else {
                animatedText.append("\u001B[97m").append(c);
            }
        }

        animatedText.append(ANSI_RESET);
        System.out.println(animatedText);
    }

    public static void info(String message) {
        logger.log(Level.INFO, "\u001B[36m" + PREFIX + message + ANSI_RESET);
    }

    public static void success(String message) {
        logger.log(Level.INFO, "\u001B[32m" + PREFIX + message + ANSI_RESET);
    }

    public static void warn(String message) {
        logger.log(Level.WARNING, "\u001B[33m" + PREFIX + message + ANSI_RESET);
    }

    public static void error(String message) {
        logger.log(Level.SEVERE, "\u001B[31m" + PREFIX + message + ANSI_RESET);
    }

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            printBanner();
            Thread.sleep(500);
        }
    }
}
