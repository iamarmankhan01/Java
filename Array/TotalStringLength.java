import java.util.*;

public class TotalStringLength {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of strings
        System.out.println("Enter the number of strings:");
        int size = sc.nextInt();
        
        // Initialize an array to store the strings
        String array[] = new String[size];
        int totLength = 0;
        

        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totLength += array[i].length(); // Add the length of each string
        }
        // Display the total length of all strings
        System.out.println("Total length of all strings: " + totLength);
    
    }
}

