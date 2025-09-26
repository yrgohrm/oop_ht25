package nu.laromedel.app;

import nu.laromedel.app.logger.*;

public class LoggerMain {
    public static void main(String[] args) {
        // This is an example that uses a logger, through an interface to
        // make it easy to switch between different implementations as needed.
        // This example is a bit silly since it switches between them at random
        // each run.

        // A logger is a tool that records events, errors, and informational
        // messages while your program is running. A logger is far more powerful
        // than a simple System.out.println-statement. You can assign different
        // severity levels to your messages (e.g., ERROR, INFO, WARN) and then
        // configure which levels get recorded and where they go, such as to
        // the console, a file, or even a remote server.

        // Get hold of a logger
        Logger logger = LoggerFactory.getInstance();

        // The code below represents any kind of program and we could switch the logger
        // above to any implementation of the Logger interface as we wish without having
        // to change the code below.

        // Use it. Whatever logger it might be.
        logger.info("The program started.");

        logger.warn("Seems to be a boring program.");

        logger.error("Too boring, quitting!");
    }
}
