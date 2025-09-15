public class Duplicate {
    public static void main(String[] args) {

        int[] x = { 3, 3, 4, 5, 6, 6 };
        int[] temp = new int[x.length];
        int j = 0;
        for (int i = 0; i < x.length - 1; i++) {// i=5
            if (x[i] != x[i + 1]) {// with index 5 to 6
                temp[j] = x[i];
                j++;
            }
        }
        temp[j] = x[x.length - 1];
        for (int arr : temp) {
            System.out.println(arr);
        }
    
    }
}
