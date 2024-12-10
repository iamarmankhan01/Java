//-----Question 1 --------- WAP to find the factor of a Number---------

// import java.util.*;
// public class AllofOne {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the factor number");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; ++i) {
//             if (n % i == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

//------------Question 2-- WAP to find sum of factors of a number-----------

// import java.util.*;
// public class AllofOne {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);     
//         System.out.println("Enter a number");
//         int n = sc.nextInt(); 
//         System.out.println("The Factor of is  "+n);       
//         int sum = 0;       
//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 System.out.println(i);
//                 sum += i;
//             }
//         }       
//         System.out.println("Sum of factors : " + sum);
//     }
// }

// --Question-3----------WAP to find and print of even factor----------------

// import java.util.Scanner;
// public class AllofOne {
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number ");
//         int n = sc.nextInt();
//         for (int i = 2; i <= n; i++) {
//             if (n % i == 0 && i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

//-----Question-4. WAP to print the odd factor of a no.------------------

// import java.util.Scanner;
// public class AllofOne {
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number ");
//         int n = sc.nextInt();
//         for (int i =1; i <= n; i++) {
//             if (n%i == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

//---------Question-5 WAP to find the sum of even factors of a no.

// import java.util.Scanner;
// public class AllofOne {
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number  ");
//         int n = sc.nextInt();
//         int sum=0;
//         for (int i = 2; i <= n; i++) {
//             if (n % i == 0 && i % 2 == 0) {
//                 sum +=i;
//                 System.out.println(i);              
//             }            
//         }
//         System.out.println("The sum of even factors is:  "+sum);
//     }
// }

//-------Question-6 WAP to find sum of odd factors of a no.------------------------

//   import java.util.Scanner;
// public class AllofOne {
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number ");
//         int n = sc.nextInt();
//         int sum =0;
//         for (int i =1; i <= n; i++) {
//             if (n%i == 0) {
//                 System.out.println(i);
//                sum +=i;
//             }
//         }
//         System.out.println("The sum of odd factorial is "+sum);
//     }
// }

//----Question-7 WAP to input a Number and cheek whether it is perfect on not--------------------

// import java.util.*;
// public class AllofOne {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the factor number");
//         int n = sc.nextInt();
//         int sum=0;
//         for (int i = 1; i <n; ++i) {
//             if (n % i == 0) {
//                 System.out.println(i + " ");
//                 sum = sum+i;

//             }
//         }
//            System.out.println("The sum value is :"+sum);
//            if (sum==n) {
//             System.out.println("Perfact Number ");
//         } else {
//             System.out.println("Not a Perfact Number");
//         }
//     }
// }

//----Question-8. WAP to input a no and cheek whether it is prime are not.-------

// import java.util.*;
// public class AllofOne {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the  number");
//         int n =sc.nextInt();
//         int count=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 count++;
//             }
//         }
//         if(count==2){
//             System.out.println("Number is prime");
//         }else{
//             System.out.println("Number is not prime");
//         }
//     }
// }

//----Question-9. WAP to print the factors, which are prime.-------------------------


// import java.util.*;
// public class AllofOne {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the  number");
//         int n = sc.nextInt();
//         int count = 0;
//         for (int i = 2; i <= n; i++) {
//             if (n % i == 0) {
//                 System.out.println(i);
//                 n = n / i;
//             }
//         }
//         if (count == 2) {
//             System.out.println("Number is prime  " +n);
//          }
//     }
// }


//Question-10. WAP to count the no even factors of a no---------------------

// import java.util.*;
// public class AllofOne {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the factor number:");
//         int n =sc.nextInt();
//            int count=0;
//         for (int i = 1; i <= n; ++i) {
//             if (n % i == 0 && i%2==0) {
//                 System.out.println("\n"+i);
//                count++;
//             }
//         }
//         System.out.println("Number is even factors count:\n "+count);
//     }
// }

//Question-11. WAP to count the no of odd factors of a no..==========================

// import java.util.*;
// public class AllofOne{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the factor number");
//         int n =sc.nextInt();
//            int count=0;
//         for (int i = 1; i <= n; ++i) {
//             if (n % i == 0 && i%2 !=0) {
//                 System.out.println(i);
//                 count++;
//             }
//         }
//         System.out.println("Number is odd factors count : "+count);
//     }
// }


// import java.util.*;
// public class AllofOne {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter the factorial number");
// int n = sc.nextInt();
// int fact =1;
// for(int i =1;i<=n;i++){
// fact = fact*i;
// }
// System.out.println("The factorial value is "+fact);
// }
// }
// -------Question 2-- WAP to find sum of factors of a number-----------

// import java.util.*;
// public class AllofOne {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter the factorial number");
// int n = sc.nextInt();
// int fact =1;
// int sum=0;
// for(int i =1;i<=n;i++){
// fact = fact*i;
// sum=sum+(fact*i);
// }
// System.out.println(sum);
// System.out.println("The factorial value is "+fact);
// }
// }

// ------------WAP to find and print of even factor--------
// import java.util.*;

// public class AllofOne {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the factorial number");
// int n = sc.nextInt();
// for (int j = 1; j <= n; j++) {
// if (n % 2 == 0) {
// int fact = 1;
// for (int i = 1; i <= n; i++) {
// fact = fact * i;
// // System.out.println(fact);
// }
// System.out.println("The factorial value is " + fact);
// }

// }
// }

// }

// import java.util.*;
// public class AllofOne {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter the factorial number");
// int n = sc.nextInt();
// if(n%2==0){
// System.out.println("even number");
// }
// else{
// System.out.println("odd number");
// }

// }
// }
