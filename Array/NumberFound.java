import java.util.Scanner;

public class NumberFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array lenght :");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter the array number");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the found number ");
        int x = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("the number is :" + x);
            }
           
        }        

    }
}
