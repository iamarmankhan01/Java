import java.util.Arrays;
public class ArraysSort {

    public static void main(String[] args) {
        int[] intArray = new int[]{4, 5, 9, 0, 3, 5, 6, 2};
        Arrays.sort(intArray);
        for (int i = 0; 1 < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        String[] stringArray = new String[]{"D", "E", "A", "C", "B"};
        Arrays.sort(stringArray);
        for (String stringArray1 : stringArray) {
            System.out.println(stringArray1);
        }
    }
}
