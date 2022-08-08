import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateCalcs {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-08-08T15:14:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate plusWeekLocalDate = d04.plusDays(7);
        System.out.println(pastWeekLocalDate);
        System.out.println(plusWeekLocalDate);


        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime plusWeekLocalDateTime = d05.plusDays(7);
        System.out.println(pastWeekLocalDateTime);
        System.out.println(plusWeekLocalDateTime);


        Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant plusWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println(pastWeekLocalInstant);
        System.out.println(plusWeekLocalInstant);


        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t1 em minutos: " + t1.toMinutes());


        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("t2 em minutos: " + t2.toMinutes());


        Duration t3 = Duration.between(pastWeekLocalInstant, d06);
        System.out.println("t3 em minutos: " + t3.toMinutes());
    }
}
