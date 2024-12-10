//---Program to demonstration try or catch
// public class Exception1 {
//     public static void main(String[] args) {
//         int a,b,c;
//         a=10;
//         b=0;
//         c=a+b;
//         System.out.println("Addition ="+c);
//         c=a*b;
//         System.out.println("Multiplaction ="+c);
//         try{
//             c=a/b;       
//         }
//         catch(ArithmeticException e){
//              System.out.println("division ="+c);
//         }
//          finally {
//             c=a-b;
//             System.out.println("Subtraction ="+c);
//         }       
//     }
// }



//=======================================================================



public class Exception1 {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=0;

        c=a+b;
        System.out.println("Addition ="+c);

        c=a*b;
        System.out.println("Multiplaction ="+c);
        try{
            c=a/b;   
              System.out.println("division"+c);    
        }
        catch(ArithmeticException ae){
        System.out.println("Method 1"+ae.getMessage());
           System.out.println("Method2"+ae);
           System.out.println("Method 3 ");
           ae.printStackTrace();
           System.out.println("Method 4 : i can not be divide by 0" );
        }
            c=a-b;
            System.out.println("Subtraction ="+c);
            System.out.println("End of Program");
        }       
    }


//=======================================================================================


// public class Exception1 {
//     public static void main(String[] args) {
//         int a,b,c;
//         a=10;
//         b=0;

//         c=a+b;
//         System.out.println("Addition ="+c);

//         c=a*b;
//         System.out.println("Multiplaction ="+c);

//         try{
//             c=a/Integer.parseInt(args[0]);
//               System.out.println("division"+c);    
//         }
//         catch(ArithmeticException ae){
//           System.out.println("Exception : i can not be divide by 0" );
//         }
//         catch(Exception e){
//             System.out.println("Exception e"+e);
//         }
//         // catch (NumberFormatException ne){
//         //     System.out.println("Enxcptio "+ne);
//         // }       
//             c=a-b;
//             System.out.println("Subtraction ="+c);
//             System.out.println("End of Program");
//         }       
//     }

