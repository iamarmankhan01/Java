//public class FunctionCheck {
//     static void multiplation(int n){
//         for(int i=1;i<=10;i++){
//          System.out.format("%d X %d =%d \n",n,i,n*i);
//         }

//     }
//     public static void main (String args[]){
//         multiplation(7);
//     }

                       //________________-Star print______________

// static void pattern(){
//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

// }
// public static void main(String args[]){
// pattern();

// }

//---------------Natural numbber sum-----------------


//    static int sum(int n){
//    if(n==1){
//     return 1;
//    }
//    return n + sum(n-1);
// }

// public static void main(String args[]){
//     int c= sum(4);
//     System.out.println(c);
// }

    //---------------------Fibonacise Serise-------------------------
    //static int fab(int n){
        // if (n==1){
        //     return 0;
        // }
        // else if(n==2){
        //     return 1;
        // }
       /*  if (n==1 || n ==2){
            return n-1; */
//         }
//         else{
//             return fab(n-1)+fab(n-2);
//         }
//     }

// public static void main(String args[]){
//     int result = fab(7);
//     System.out.println(result);
// 

//}



// public class FunctionCheck {
// public static void main(String[] args) {
//     int a,b;
//     String s1,s2;
//     a=10;
//     b=20;
//     s1="10";
//     s2="20";
//     System.out.println(a+b);
//     System.out.println(s1+s2);
//     System.out.println(a-b);
//     System.out.println(-(a-b));
// }
// }
    

import java.util.*;

public class  FunctionCheck{
    // Method to find the larger of two numbers
    public static int Number(int a, int b) {
        return a > b ? a : b; // Ternary operator to find the larger number
    }

    // Method to find the largest among three numbers
    public static int Number(int a, int b, int c) {
        return (a > b ? (a > c ? a : c) : (b > c ? b : c)); // Nested ternary operator for three numbers
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the three numbers
        System.out.println("Enter the 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number:");
        int num2 = sc.nextInt();

        System.out.println("Enter the 3rd number:");
        int num3 = sc.nextInt();

        // Call the methods
        int largestTwo = Number(num1, num2);
        int largestThree = Number(num1, num2, num3);

        // Output results
        System.out.println("Largest of two numbers is: " + largestTwo);
        System.out.println("Largest of three numbers is: " + largestThree);
    }
}

