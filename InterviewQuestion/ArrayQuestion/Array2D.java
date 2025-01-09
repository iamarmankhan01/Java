

public class Array2D {
    static  void  printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       
        int [] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 2;
        arr[3] = 4;
        arr[4] = 8;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]+" ");     
      //  }
      //Original Array
       printArray(arr);

       //Duplicate Array
       System.out.println("Print a array of copy");
       int arr_2[] = arr;
       printArray(arr_2);

       //Changinng some value of arr_2
       arr_2[0] = 0;
       arr_2[1] = 0;
       System.out.println("Original array after changing arr_2");
       printArray(arr);

       System.out.println("Copied arr_2 after changing arr_2");
       printArray(arr_2);


    }
}
