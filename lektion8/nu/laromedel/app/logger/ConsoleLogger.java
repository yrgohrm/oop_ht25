package nu.laromedel.app.logger;

import java.io.*;
import java.time.*;

/**
 * Logger that logs everything to the console. 
 * 
 * Using standard output for the less critical messages and standard error
 * for the errors.
 * 
 */
public class ConsoleLogger implements Logger {

    @Override
    public void info(String message) {
        log(System.out, "INFO", message);
    }

    @Override
    public void warn(String message) {
        log(System.out, "WARN", message);
    }

    @Override
    public void error(String message) {
        log(System.err, "ERROR", message);
    }

    // this is a helper method. A private method that makes the other
    // methods easier to write and with less duplicated code
    // this is not part of the logger interface and does not need to be
    private void log(PrintStream stream, String level, String message) {
        String date = LocalDateTime.now().toString();
        stream.printf("%s [%s] - %s%n", date, level, message);
        stream.flush();
    }
}
