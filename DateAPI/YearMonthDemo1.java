
import java.time.Month;
import java.time.YearMonth;

public class YearMonthDemo1 {
    public static void main(String[] args) {
        YearMonth ym1 = YearMonth.of(2022, Month.NOVEMBER);

        int monthLen = ym1.lengthOfMonth();
        System.out.println(monthLen);

        int yearLen = ym1.lengthOfYear();
        System.out.println(yearLen);
    }
}
