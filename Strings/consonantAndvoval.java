import java.util.*;

public class consonantAndvoval{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("voval");
                break;
            default:
                System.out.println("consonant");
        }
    }
}


/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class consonantAndvoval {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Prompt user to enter a character
        System.out.println("Enter a character:");
        char ch = br.readLine().charAt(0); // Read the first character of input
        
        // Normalize input to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a vowel or consonant
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println("Consonant");
                } else {
                    System.out.println("Invalid input. Please enter an alphabet.");
                }
        }
    }
}

*/


/*

import java.util.Scanner;
public class consonantAndvoval {
    public static void main(String args[]){
 System.out.println("Enter the charecter ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Character");
        char ch = sc.next().charAt(0);
        if (ch =='a'||ch =='e'||ch == 'i'||ch =='o'||ch =='u'){
            System.out.println(ch +" is vowel");
        }
        else{
            System.out.println(ch +" is consonant");
        }
}
}
  */
