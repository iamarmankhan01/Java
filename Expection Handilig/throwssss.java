// import java.io.*;
// public class throwssss {
//     public static void main(String[] args) {
//         int a,b,c;
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         try {
//             System.out.println("Enter two number ");
//             a=Integer.parseInt(br.readLine());
//             b= Integer.parseInt(br.readLine());
//             if(b==0){
//                 throw new ArithmeticException("We can not divide by 0");
//             }
//             else{
//                 c=a/b;
//                 System.out.println("division ="+c);
//             }
//         }
//         catch (ArithmeticException ae){
//             ae.printStackTrace();
//         }
//         catch(NumberFormatException ne){
//             System.out.println("Exception : Plese Enter integer number value only");
//         }
//         catch(IOException ioe){
//             System.out.println(ioe);
//         }
//         System.out.println("end of the program");
//     }

// }

//================================================================================

// import java.io.*;
// public class throwssss {
//     public static void main(String[] args)throws IOException,ArithmeticException{
//         int a,b,c;
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//          System.out.println("Enter two number ");
//             a=Integer.parseInt(br.readLine());
//             b= Integer.parseInt(br.readLine());
//             c=a/b;
//             System.out.println("Division ="+c);
//             System.out.println("End of the program");

//     }
// }


//================program to demontration of user define exception========


import java.io.*;
class AmountException extends Exception {
    AmountException() {
        super("please inter amount in Multiple of 100");
    }
}
public class throwssss {
    public static void main(String args[]) {
        int amt;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("enter the amount:");
            amt = Integer.parseInt(br.readLine());
            if (amt % 100 == 0) {
                System.out.println("processing.......");
            } else {
                throw new AmountException();
            }
        } catch (AmountException ae) {
            System.out.println(ae);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("end of Program");
    }
}