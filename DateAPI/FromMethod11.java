
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FromMethod11 {
    public static void main(String[] args) {
        
        LocalDateTime localDateTime = LocalDateTime.of(2015,12,30,18,18);
        System.out.println(localDateTime);

        LocalDate localDate =LocalDate.from(localDateTime);
        System.out.println(localDate);
    }
}
