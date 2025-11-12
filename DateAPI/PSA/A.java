import java.text.SimpleDateFormat;
import java.util.Date;

public class A {
    public static void main(String[] args) {

        Date d=new Date(200, 1,24);
        System.out.println(d);

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = s.format(d);
        System.out.println(formatDate);
    }
}
