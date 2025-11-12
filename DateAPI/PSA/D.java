import java.time.LocalDate;
import java.time.ZonedDateTime;

public class D {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate time = LocalDate.now();
        System.out.println(time);

        ZonedDateTime x = ZonedDateTime.now();
        System.out.println(x);
    }
}
