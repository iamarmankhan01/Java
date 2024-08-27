import java.util.Scanner;
public class DesendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int temp;
        int num[] = new int[n];
        System.out.println("Enter the value in array");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Output");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
    }
}
