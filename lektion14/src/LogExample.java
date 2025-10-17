import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExample {
    private static final Logger logger =
                    LoggerFactory.getLogger(LogExample.class);

    public static void main(String[] args) {
        int someData = 3;
        logger.debug("Detta är debuginfo");
        logger.info("Detta är bra information");
        logger.warn("Detta är en varning med data: {}", 
                    someData);

        try {
            // ...
        }
        catch (NullPointerException ex) {
            logger.error("The user was null", ex);
        }
    }
}
