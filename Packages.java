import java.time.*;
import java.time.format.DateTimeFormatter;

public class Packages {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // date & time formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime time = LocalTime.now();
        System.out.println(time.format(formatter));
    }
}
