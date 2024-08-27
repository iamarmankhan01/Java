
/**
 * pattern
 */
import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.print("\n");
        }




                    // ****
                    // *** 
                    // ** 
                    // * 
       
        // int n = 5;
        // for(int i=n;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // ******
        // ******
        // ******
        // ******
        // int r=4 ,c=6;
        // for (int i=1;i<=r;i++){
        // for(int j =1;j<=c;j++){
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }



                    // ******
                    // *    *
                    // *    *
                    // ******
        // int h = 4, w = 6;
        // for (int i = 0; i < h; i++) {
        //     System.out.println();
        //     for (int j = 0; j < w; j++) {
        //         if (i == 0 || i == h - 1 || j == 0 || j == w - 1)
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");

        //     }
        // }


       

        
    }
}
