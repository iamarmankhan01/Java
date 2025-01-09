public class MaxElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 45, 65, 67, 32, 34, 533 };
        int max = 0;
        for (int e : arr) {
            if (e > max);{
              max=e;
            }
        }
        System.out.println("max value is "+max);
    }
}
