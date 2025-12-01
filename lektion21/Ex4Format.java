import java.time.*;
import java.time.format.*;

public class Ex4Format {
    public static void main(String[] args) {
        String someDateText = "2019-10-30T12:22:00";

        LocalDateTime ldt = LocalDateTime.parse(someDateText, DateTimeFormatter.ISO_DATE_TIME);

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("hh:mm dd/MM -yy");

        String output = ldt.format(outputFormat);
        
        System.out.println(output);
    }
}
