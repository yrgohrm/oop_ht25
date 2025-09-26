package nu.laromedel.app.logger;

public final class LoggerFactory {
    private LoggerFactory() {
    }

    /**
     * Get some kind of logger...
     * 
     * @return a logger of some kind
     */
    @SuppressWarnings("java:S2140")
    public static final Logger getInstance() {
        // it's random which logger you get...
        // but all instances are loggers and can be used the same way
        int random = (int) (Math.random() * 3);
        return switch (random) {
            case 0 -> new ConsoleLogger();
            case 1 -> new FileLogger();
            default -> new ColorConsoleLogger();
        };
    }
}
