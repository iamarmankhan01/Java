import java.util.Scanner;

public class EvenOrOddSum {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int positiveEvenSum = 0, positiveOddSum = 0, negativeEvenSum = 0, negativeOddSum = 0;
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scan.nextInt();
        }

        // Calculate the sums
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    positiveEvenSum += num;
                } else {
                    positiveOddSum += num;
                }
            } else {
                if (num % 2 == 0) {
                    negativeEvenSum += num;
                } else {
                    negativeOddSum += num;
                }
            }
        }

        // Print the results
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);
        System.out.println("Sum of negative even numbers: " + negativeEvenSum);
        System.out.println("Sum of negative odd numbers: " + negativeOddSum);

        // Close the scanner
        scan.close();
    }
}
