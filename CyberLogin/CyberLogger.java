//I want to give you an idea for making cute Loggers! Maybe you can take inspiration from here 😉(For [ASCII FONT](https://manytools.org/hacker-tools/ascii-banner/))


// Logger Class, is a semplified version!

import java.util.logging.*;

public class CyberLogger {

    private static final Logger logger = Logger.getLogger("CyberLogin");

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String WHITE = "\u001B[97m";
    private static final String CYAN = "\u001B[36m";
    private static final String GRAY = "\u001B[90m";
    private static final String SUCCESS_COLOR = "\u001B[92m";
    private static final String WARN_COLOR = "\u001B[93m";
    private static final String ERROR_COLOR = "\u001B[91m";

    private static final String[] COLORS = {
            "\u001B[31m", "\u001B[33m", "\u001B[32m", "\u001B[36m",
            "\u001B[34m", "\u001B[35m", "\u001B[91m", "\u001B[93m",
            "\u001B[92m", "\u001B[96m", "\u001B[94m", "\u001B[95m"
    };

    static {
        logger.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                String timestamp = formatTimestamp(record.getMillis());
                String levelColor = getLevelColor(record.getLevel());
                String level = record.getLevel().getName();
                String message = record.getMessage();
                return String.format("%s[%s] %s%s%s%s%n", WHITE + timestamp, levelColor + level + WHITE, levelColor, message, ANSI_RESET, "");
            }
        });
        logger.addHandler(handler);
    }

    private static String formatTimestamp(long millis) {
        java.time.LocalTime time = java.time.Instant.ofEpochMilli(millis)
                .atZone(java.time.ZoneId.systemDefault()).toLocalTime();
        return String.format("[%02d:%02d:%02d]", time.getHour(), time.getMinute(), time.getSecond());
    }

    private static String getLevelColor(Level level) {
        if (level == Level.WARNING) return WARN_COLOR;
        if (level == Level.SEVERE) return ERROR_COLOR;
        return WHITE;
    }

    public static void printBanner() {

        String[] banner = {
                " _______   _______ ___________ _     _____ _____ _____ _   _  ",
                "/  __ \\ \\ / / ___ \\  ___| ___ \\ |   |  _  |  __ \\_   _| \\ | | ",
                "| /  \\/\\ V /| |_/ / |__ | |_/ / |   | | | | |  \\/ | | |  \\| | ",
                "| |     \\ / | ___ \\  __||    /| |   | | | | | __  | | | . ` | ",
                "| \\__/\\ | | | |_/ / |___| |\\ \\| |___\\ \\_/ / |_\\ \\_| |_| |\\  | ",
                " \\____/ \\_/ \\____/\\____/\\_| \\_\\_____/\\___/ \\____/\\___/\\_| \\_/ ",
                ""
        };

        for (String line : banner) {
            System.out.println(CYAN + line + ANSI_RESET);
        }

        printDesc();
    }



    public static void printDesc() {
        String madeBy = "                       Made with the ♥ by TheNeku";
        String licence = "                       LICENCED BY AKIRA STUDIOS";
        int colorIndex = 0;
        StringBuilder madeByLine = new StringBuilder();
        for (char c : madeBy.toCharArray()) {
            madeByLine.append(c != ' ' ? COLORS[colorIndex++ % COLORS.length] + c : WHITE + c);
        }
        StringBuilder licenceLine = new StringBuilder();
        for (char c : licence.toCharArray()) {
            licenceLine.append(c != ' ' ? COLORS[colorIndex++ % COLORS.length] + c : GRAY + c);
        }
        System.out.println(madeByLine + ANSI_RESET);
        System.out.println(licenceLine + ANSI_RESET);
    }

    public static void info(String message) {
        logger.log(Level.INFO, message);
    }

    public static void success(String message) {
        logger.log(Level.INFO, SUCCESS_COLOR + message + ANSI_RESET);
    }

    public static void warn(String message) {
        logger.log(Level.WARNING, message);
    }

    public static void error(String message) {
        logger.log(Level.SEVERE, message);
    }
}
