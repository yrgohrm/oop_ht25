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
public class ColorConsoleLogger implements Logger {

    @Override
    public void info(String message) {
        log(System.out, 32, "INFO", message);
    }

    @Override
    public void warn(String message) {
        log(System.out, 35, "WARN", message);
    }

    @Override
    public void error(String message) {
        log(System.err, 31, "ERROR", message);
    }

    // this is a helper method. A private method that makes the other
    // methods easier to write and with less duplicated code
    // this is not part of the logger interface and does not need to be
    private void log(PrintStream stream, int color, String level, String message) {
        String date = LocalDateTime.now().toString();
        stream.printf("%s \033[0;%dm[%s]\033[m - %s%n", date, color, level, message);
        stream.flush();
    }
}
