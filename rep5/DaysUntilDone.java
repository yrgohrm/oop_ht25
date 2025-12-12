import java.time.*;
import java.time.temporal.*;

public class DaysUntilDone {
    public static void main(String[] args) {
        // sista skoldag: 2027-06-04
        LocalDate today = LocalDate.now();
        LocalDate graduation = LocalDate.of(2027, 6, 4);

        long days = ChronoUnit.DAYS.between(today, graduation);
        System.out.println("Antal dagar till examen: " + days);

        long months = ChronoUnit.MONTHS.between(today, graduation);
        System.out.println("Antal månader: " + months);

        Period p = Period.between(today, graduation.plusDays(1));
        System.out.println(p);

        Duration d = Duration.between(today.atStartOfDay(), graduation.atStartOfDay());
        System.out.println(d);
    }
}
