
public class ThreeLargestNumber {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 3, 5, 7, 223, 44, 556, 111, 576};
        int max1 = arr[0], max2 = arr[0], max3 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
}




