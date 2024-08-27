package TwoD;
import java.util.Scanner;
public class transposeMatrixXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row and Colams");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int num[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is:");
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(num[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
