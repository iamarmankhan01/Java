
import java.util.Scanner;

public class CalculatePosNeg {
    public static void main(String arg[]) {
    int ar[] = new int[10];
    int pe = 0, po = 0, ne = 0, no = 0, i;
    Scanner scan = new Scanner(System.in);
    System.out.println("enter 10 element");
    for (i = 0; i < 10; i++) {
    ar[i] = scan.nextInt();
    }
    for (int x : ar) {
    if (x > 0) {
    if (x % 2 == 0)
    pe = pe + x;
    else
    po = po + x;
    } else {
    if (x % 2 == 0)
    ne = ne + x;
    else
    no = x;
    }
    }
    System.out.println("sum of +ive even" + pe);
    System.out.println("sum of +ive odd" + po);
    System.out.println("sum of -ive even" + ne);
    System.out.println("sum of -ive odd" + no);

    // }

    // write a program to initialized and elements and print all element with sum
    // and average

    // public static void main(String agrs[])
    // {
    // int ar[]={10,20,30,40,50,60,70,80,90,100};
    // int sum=0;
    // for(int value:ar)
    // {
    // System.out.println(value);
    // sum=sum+value;
    // }
    // System.out.println("sum="+sum);
    // System.out.println("avg=" +
    // ""+sum/ar.length);
    // }

//     public static void main(String arg[]) {
//         int ar[] = new int[10];
//         int pe = 0, po = 0, ne = 0, no = 0, i;
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter 10 element");
//         for (i = 0; i < 10; i++) {
//             ar[i] = scan.nextInt();
//         }
//         for (int x : ar) {
//             if (x > 0) {
//                 if (x % 2 == 0)
//                     pe = pe + x;
//                 else
//                     po = po + x;
//             } else {
//                 if (x % 2 == 0)
//                     ne = ne + x;
//                 else
//                     no = x;
//             }
//         }
//         System.out.println("sum of +ive even" + pe);
//         System.out.println("sum of +ive odd" + po);
//         System.out.println("sum of -ive even" + ne);
//         System.out.println("sum of -ive odd" + no);

    }
}
