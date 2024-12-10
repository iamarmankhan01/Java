import java.util.*;
public class matrix{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the row");
        int row= sc.nextInt();
        System.out.println("Enter the cols");
        int cols = sc.nextInt();
        int number[][] = new int[row][cols];
        //for input 
        for (int i=0;i<row;i++){
            for (int j =0;j<cols;j++){
                number [i][j]= sc.nextInt();

            }
        }
        //output for
        System.out.println("The ");
        for(int i = 0;i<row;i++){
            for (int j=0;j<cols;j++){
                System.out.println(+number[i][j]+" ");
            }
            System.out.println( );
        }

    }
}
