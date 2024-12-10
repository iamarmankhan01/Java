
import java.time.Month;
import java.time.MonthDay;

public class MonthDayDemo7 {
    public static void main(String[] args) {
        MonthDay  md1 = MonthDay.of(Month.AUGUST, 25);
        MonthDay  md2 = MonthDay.of(Month.FEBRUARY, 29);

        if(md2.isValidYear(2020)){
            System.out.println(md2+ "  Leap year");
        }
        System.out.println(md1.getDayOfMonth());

    }
}
