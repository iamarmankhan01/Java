public class Sorting {
    public static void main(String[] args) {
        int[] x = { 35, 21, 22, 14,2};
        int temp=0;    
        for(int i=0;i<x.length-1;i++){
            for(int j=0;j<x.length-1;j++){
                if(x[j]>x[j+1]){    // Suppose   // x[j]-->x    // x[j+1]--> y
                  temp = x[j];
                  x[j]=x[j+1];
                  x[j+1]=temp;
                }
            }
        }
        for(int arr :x){
          System.out.println(arr);
        }
    }
}
