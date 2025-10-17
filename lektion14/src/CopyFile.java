import java.io.*;
import java.nio.file.*;

import org.slf4j.*;

public class CopyFile {
    private static final Logger logger =
                    LoggerFactory.getLogger(CopyFile.class);


    public static void main(String[] args) throws IOException {
        Path in = Path.of("shortstorypassword1.jpg");
        Path out = Path.of("out.jpg");

        // copyFile(in, out);

        Files.copy(in, out);
    }

    private static void copyFile(Path in, Path out) throws IOException {
        logger.debug("copying files");

        try (BufferedInputStream is = new BufferedInputStream(Files.newInputStream(in));
             BufferedOutputStream os = new BufferedOutputStream(Files.newOutputStream(out))) {

            byte[] buff = new byte[1024];

            int length;
            while ((length = is.read(buff)) != -1) {
                os.write(buff, 0, length);
            }

            logger.debug("copy successful");
        }
    }
}
