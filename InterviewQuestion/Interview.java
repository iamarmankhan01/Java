

public class Interview {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // int n[] = {1,2,3,4,5,7,8,9,10};
        // int len = n.length+1;
        // int sum=0;
        // int totalSum = len*(len+1)/2;

        // for(int i=0;i<n.length;i++){
        //     sum = sum + n[i];
        // }

        // int res = totalSum-sum;
        // System.out.println("Res: "+res);





        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<==Factorial Number==>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //  System.out.println("Enter the factorial number: ");
        //  int number = sc.nextInt();
        //  int fact =1;
        //  for(int i=1;i<number;i++){
        //     fact = fact*i;
        //  }
        //  System.out.println("The factorial number is :"+fact);



        // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<==Sum of digit===>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // System.out.println("Enter the number :");
        // int number = sc.nextInt();
        // int sum=0 ,rem;
        // while (number>0) {
        //    rem = number%10;
        //    sum=sum+rem;
        //    number=number/10; 
        // }
        // System.out.println("The number is sum is : "+sum);



        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<==Prime Numbere Check===>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // System.out.println("Enter the number:");
        // int number = sc.nextInt();
        // int count=0;
        // for(int i=1;i<=number;i++){
        //     if(number%i==0){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.println(number+" Number is prime:");
        // }else{
        //     System.out.println(number+" Number is Not prime:");
        // }
      


        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<==Armstrong Number===>>>>>>>>>>>>>>>>>>>>>
        
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int sum=0,r;  
        // int m=n;
        // while (n>0) {
        //  r=n%10;
        //  sum=sum+r*r*r;
        //  n=n/10;
        // }
        // if(m==sum){
        //  System.out.println("The Number is Armstrong Number: "+m);
        // }else{
        //  System.out.println("The Number is Not Armstrong Number: "+m);
        // }
        /*Output
                     Enter the number:153
                     The Number is Armstrong Number: 153 */



//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<==Fibonacci Series===>>>>>>>>>>>>>>>>>>>>>>>>>

        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int n1=0, n2=1,n3;
        // System.out.print(n1+ " "+n2);
        // for(int i=2;i<n;++i){
        //  n3 =n1+n2;
        //  System.out.print(" "+n3);
        //  n1=n2;
        //  n2=n3;
        // }

        /* Output: 
                           Enter the number:10
                           0 1 1 2 3 5 8 13 21 34 */


        //   System.out.println("Enter the Number");
        //   int n = sc.nextInt();
        //   int a =0 ,b =1;
        //   System.out.print("  "+a);
        //   if (n>1){
        //       for (int i =2; i<n;i++){
        //           System.out.println(" "+b);
        //           int tem = b;
        //           b = a+b;
        //           a = tem;
        //       }
        //       System.out.println( );
        //   }      
        
        

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<==Reverse Number===>>>>>>>>>>>>>>>>>>>>>>>

        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int reverseNumber=0;
        // while (n>0) {
        //     int rem = n%10;
        //     reverseNumber=reverseNumber*10+rem;
        //     n=n/10;
        // }
        // System.out.println("The reverse Number is :"+reverseNumber);

        /*Output
                          Enter the number:123456789
                          The reverse Number is :987654321
         */
        //Both are same . some condition are apply to  a palindromes




        //===================Reverse Number With Method========================

// public class Interview {
//     static void NumberRev(int n){
//             if(n<10){
//             System.out.println(n);
//             return ;
//         }else{
//             System.out.print(n%10);
//             NumberRev(n/10);
//         }  
//     }
//     public static void main(String[] args) {
//      int num =789;
//      NumberRev(num);
//     }
// }

//<<<<<<<<<<<<<<<<<<<<<<<<<===Palindrome Number===>>>>>>>>>>>>>>>>>>>>>>>>

        // System.out.println("Enter the number:");
        // int num = sc.nextInt();
        // int sum=0,r,temp=num;
        // while (num>0) {
        //     r=num%10;
        //     sum=sum*10+r;
        //     num=num/10;
        // }
        // if(temp==sum){
        //     System.out.println("Number is Palindrome :");
        // }else{
        //     System.out.println("Number is Not Palindrome ");
        // }
        /*Output
                        Enter the number:121
                        Number is Palindrome */



//==========================Swap two Number ===========================

// import java.util.*;  
// public class Interview { 
//     public static void main(String[] args) {  
//      // Scanner sc = new Scanner(System.in);
//       int x=5, y=8, temp;   
//       //  System.out.println("Enter the value of X and Y");  
//       //  x = sc.nextInt();  
//       //  y = sc.nextInt();  
//        System.out.println("before swapping numbers: "+x +"  "+ y);   
//        temp = x;  
//        x = y;  
//        y = temp;  
//        System.out.println("After swapping: "+x +"   " + y);  
//       // System.out.println( );  
//     }    
// }  


//=======================Swap two Number without 3rd varible ====================

// public class Interview { 
//     public static void main(String[] args) {
//         int a = 10, b = 20;
//         System.out.println("--Before swap--");
//         System.out.println("First number = " + a);
//         System.out.println("Second number = " +b);
//                a = a + b; // a = 30
//                b = a - b; // b = 10 (original a)
//                a = a - b; // a = 20 (original b)
//         System.out.println("--After swap--");
//         System.out.println("First number = " + a);
//         System.out.println("Second number = " + b);
//     }
// }



//================== Java program to swap three variables==================


// public class Interview {
//   static int a, b, c;
//   static void swapThree() {
//     a = a + b + c;
//     b = a - (b + c);
//     c = a - (b + c);
//     a = a - (b + c);
//      System.out.println("After swapping a = " +a + ", b = " + b + ", c = " + c);
//   }
//   public static void main(String[] args) {
//     a = 10; b = 20;c = 30;
//     System.out.println("Before swapping a = " + a + ", b = " + b + ", c = " + c);
//     swapThree();
//   }
// }




//======================== string reverse===========================
// =============used string builder to reverse=================

// String st = "namrA";
// StringBuilder str2 = new StringBuilder();
// str2.append(st);
// str2 = str2.reverse();     
// System.out.println(str2);



// ===================used string builder to reverse======================
//        String str = "Automation";
//        StringBuilder str2 = new StringBuilder();
//        str2.append(str);
//        str2 = str2.reverse();     
//       System.out.println(str2);

     

/* 
        
        // String n = "Hello my name is khan";
        // String str[] = n.split(" ");
        // String newStr = "";
        // for(int i=str.length-1; i>=0; i--){
        //     newStr = newStr + str[i] + " "; //space dete se 
        // }
        // System.out.println(newStr);
        
      //khan is name my Hello 

    //   String n = "Hello my name is khan";
    //   String str[] = n.split("");
    //   String newStr = "";
    //   for(int i=str.length-1; i>=0; i--){
    //       newStr = newStr + str[i] + "";
    //   }
    //   System.out.println(newStr);

      //nahk si eman ym olleH


      */

      

/* 
     //import java.util.*;
     //public class Interview{
    // Method to find the larger of two numbers
    public static int Number(int a, int b) {
        return a > b ? a : b; // Ternary operator to find the larger number
    }

    // Method to find the largest among three numbers
    public static int Number(int a, int b, int c) {
         // return Number(Number(a, b), c);
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

         */
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<===Method Overloading===>>>>>>>>>>>>>>>>>>>>>>>>>
        //    class adder{
        //     static int add (int a ,int b){
        //         return a+b;
        //     }
        //     static int add(int a,int b,int c){
        //         return a+b+c;
        //     }
        // }
        //  Main Method     
        //     System.out.println(adder.add(20, 30));
        //      System.out.println(adder.add(20, 10, 20));


//<<<<<<<<<<<<<<<<<<<<<<<<<<<<===Method Overriding===>>>>>>>>>>>>>>>>>>>>>>>>

        // class Parent{
        //     void show(){
        //         System.out.println("Parent Class");
        //     }
        // }
        // class Child extends Parent{
        //     void show(){
        //         System.out.println("Child Class");
        //     }
        // }
        //  Main Method  
        //   Parent obj=new Parent();
        //         obj.show();
        //         Child obj1=new Child();
        //         obj1.show();


     


          
                
            
    }
}
