/*public static void sort (long array[], int fromIndex, int toIndex)
public static void sort (short array [])
public static void sort (short array[], int fromIndex, int toIndex) */ 

import java.util.Arrays;

public class SubSort {
    public static void main(String[] args) {
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

        // Printing the original array
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sorting the subarray from index 3 to 7 (inclusive)
        Arrays.sort(array, 3, 8);  // Index 8 is exclusive, so the subarray includes indices 3, 4, 5, 6, 7

        // Printing the sorted array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
