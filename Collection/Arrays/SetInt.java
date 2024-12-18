import java.lang.reflect.Array;

public class SetInt {
    public static void main(String[] args) {
        int[] array = (int[]) Array.newInstance(int.class, 3);
        int length = Array.getLength(array);

        // Setting values in the array using Array.setInt
        for (int i = 0; i < length; i++) {
            int value = 1;
            Array.setInt(array, i, value); // Set value at index i
        }

        // Printing the values in the array
        for (int i : array) {
            System.out.println(i);
        }
    }
}
