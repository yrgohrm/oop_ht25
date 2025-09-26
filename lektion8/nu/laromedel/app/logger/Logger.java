package nu.laromedel.app.logger;

/**
 * Interface for a logger that logs messages.
 * 
 */
public interface Logger {
    /**
     * Log a message with the INFO logging level.
     * 
     * Suitable for information that isn't critical.
     * 
     * @param message the message to log
     */
    void info(String message);

    /**
     * Log a message with the WARN logging level.
     * 
     * Suitable for things that could turn into an error in the future if left unchecked.
     * 
     * @param message the message to log
     */
    void warn(String message);

    /**
     * Log a message with the ERROR logging level.
     * 
     * Suitable for errors that needs to be handled.
     * 
     * @param message the message to log
     */
    void error(String message);
}

