public class ArrayA {

    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans=0;
        for(int i=0;i<n;i++) {//first pick number
            for(int j=i+1;j<n;j++){  //Second number find
                if(arr[i]+arr[j]==target){
                    ans++;

                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    int[] arr = {45, 3, 78, 23, 90, 12, 67,23,68,56,23,60,23};
    System.out.println("Enter target sum ");
    int target = 68;
    System.out.println(pairSum(arr, target));
        
    }
} 

