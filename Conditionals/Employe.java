import java.util.*;
public class Employe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Code: ");
        int employeeCode = sc.nextInt();
        int bonus = 0;   
        switch (employeeCode) {
            case 100:
                bonus = 5;
                break;
            case 200:
                bonus = 1;
                break;
            case 300:
                bonus = 2;
                break;
            case 400:
                bonus = 25;
                break;
            default:
                System.out.println("Invalid Employee Code");             
        }
        if (bonus > 0) {
            System.out.println("Bonus: " + bonus + "%");
        }
    }
}
