import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class B {
    public static void main(String[] args) throws ParseException {
        String dateString ="2100-09-26";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = dateFormat.parse(dateString);
        System.out.println(parsedDate);
    }
}
