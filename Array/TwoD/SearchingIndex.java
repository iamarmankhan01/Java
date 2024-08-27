package TwoD;
import java.util.Scanner;
public class SearchingIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of matrix Row and Colams ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int number[][] = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Searching number ");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (number[i][j] == x) {
                    System.out.println("X found at location (" + i + "," + j + ")");
                }
            }

        }

    }
}
