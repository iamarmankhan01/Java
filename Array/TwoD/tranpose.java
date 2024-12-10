import java.util.*;
public class tranpose {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int number[][] = new int [row][cols];
        // for intput 
        for(int i=0;i<row;i++){
            for (int j=0;j<cols;j++){
                number [i] [j] = sc.nextInt();
            }
        }
        //for output
        for (int j =0;j<row;j++){
            for(int i=0;i<cols;i++){
                System.out.println(number[i][j]+" ");
            }
          //  System.out.println( );
        }

    }
    
}
