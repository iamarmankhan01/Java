import java.util.*;
public class linerSearch {
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the colms");
        int colms = sc.nextInt();
        System.out.println("Enter the row");
        int rows = sc.nextInt();
        int number [][]=new int[colms][rows];
        //input the 
        for(int i=0;i<colms;i++){
            for(int j=0;j<colms;j++){
                number [i][j] = sc.nextInt();
            }
            //output 
            System.out.println("Enter the found of x");
            int x =sc.nextInt();
            for(i=0;i<colms;i++){
                for (int j=0;j<rows;j++){
            //compare row and colms
            if (number [i][j] ==x){
                System.out.println("the X found at loacation("+i+","+j+")");

            }
                }
            }
        }

    }
}
