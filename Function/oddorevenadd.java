import java.io.*;
import java.util.*;
 
public class oddorevenadd {
 
    // Function to find the sum of even numbers
    static int sumOfEvenNums(int n) {
         return n * (n + 1);
         }
 
    // Function to find the sum of odd numbers.
    static int sumOfOddNums(int n) { 
        return n * n;
     }
 
    // Driver function
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int evenSum = sumOfEvenNums(n);
        int oddSum = sumOfOddNums(n);
 
        // Sum of even numbers
        System.out.println("Sum of First " + n + " Even numbers = " + evenSum);
 
        // sum of odd numbers
        System.out.println("Sum of First " + n + " Odd numbers = " + oddSum);
    }
}