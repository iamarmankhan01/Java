import java.util.Scanner;

public class maxminNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array");
        int size = sc.nextInt();
        int n[] = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
            if (n[i] > max) {
                max = n[i];
            }
        }
        System.out.println("Max number is" + max);
        System.out.println("min number is" + min);
    }
}
