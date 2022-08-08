import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateConvert {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-08-08T15:14:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // duas formas de chamar o formatar data
        System.out.println("d04: " + d04.format(fmt1));
        System.out.println("d04: " + fmt1.format(d04));

        System.out.println("------------------------");

        System.out.println("d05: " + d05.format(fmt2));
        System.out.println("d05: " + fmt2.format(d05));

        System.out.println("------------------------");

        System.out.println("d06: " + fmt3.format(d06));
    }
}
