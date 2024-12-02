import java.util.*;
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {
            String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            };
            System.out.println("Month is " + monthNames[month- 1]);
        } else {
            System.out.println("Hey! That's not a valid month");
        }
    }
}
