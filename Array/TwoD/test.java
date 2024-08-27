package TwoD;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row and Colams");
        int row =sc.nextInt();
        int cols=sc.nextInt();
        int num[][]=new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                num [i][j]=sc.nextInt();
         }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
              System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
