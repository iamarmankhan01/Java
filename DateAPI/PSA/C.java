import java.text.ParseException;
import java.util.Calendar;

public class C {
    public static void main(String[] args)throws ParseException {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        int year = cal.get(Calendar.YEAR);
        System.out.println("Current Year: " + year);


        int month = cal.get(Calendar.MONTH);
        System.out.println("Current month: "+month);

    }
}
