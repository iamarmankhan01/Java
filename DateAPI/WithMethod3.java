
import java.time.LocalDate;
import java.time.Month;

public class WithMethod3 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2020, Month.FEBRUARY,15);
        System.out.println(localDate1);

        LocalDate localDate2 = localDate1.withYear(2020);
        System.out.println(localDate2);

        LocalDate localDate3 = localDate1.withYear(2016).withMonth(8);
        System.out.println(localDate3);

    }
}
