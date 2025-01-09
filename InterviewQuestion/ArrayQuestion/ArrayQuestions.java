
//1-Find the number of reptation 
/* 
import java.util.Scanner;
public class ArrayQuestions {
    static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Count of x " + countOccurrences(arr, x));

    }
}


/*
 public class ArrayQuestions{
      public static void main(String[] args) {
        int[] arr = {4,5,6,3,4,4,2,4,5,6,6,7,4,2,4,5,6,7};
        int count = 0;
        int x = 2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
     
       System.out.println(" The reptation Number is "+count);
    }
}

    
 */

    

//2-Find the last occurrence of an element x in a given array

/* 

import java.util.Scanner;
public class ArrayQuestions {

    static int lastOccurrences(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
               lastIndex =i;
                // break;   //ko lagane se first Occurrences aata hai
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Last Occurrence of X " + lastOccurrences(arr, x));

    }
} 

*/



//-3 Check if the given array is sorted or not.

// import java.util.Scanner;
// public class ArrayQuestions {
    // static boolean  isSorted(int arr[]){
    //     boolean check =true;
    //     for(int i =1;i<arr.length;i++){
    //         if(arr[i]<arr[i-1]){
    //             check = false;
    //             break;
    //         }
    //     }
    //     return check;
    // }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of array:");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the number " + n);
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//        System.out.println("Is shorted " + isSorted(arr));
//     }
// }   errorrr sahi karna hai



//4- Small And large Element find

/*
import java.util.Arrays;
import java.util.Scanner;
public class ArrayQuestions {

    static int[] smallAndLargeElmt(int[] arr) {
        Arrays.sort(arr);
        int [] ans ={arr[0],arr[arr.length-1]};
        return ans;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       int [] ans = smallAndLargeElmt(arr);
       System.out.println("Smallest: "+ans[0]);
       System.out.println("Largest: "+ans[1]);
    }
} 

 */

 //5 - find the smallest and largest elements in an array without sorting.

//  public class ArrayQuestions{
//     public static void main(String[] args) {
//         int[] arr = {45, 3, 78, 23, 90, 12, 67};

//         // Initial values
//         int smallest = arr[0];
//         int largest = arr[0];

//         // Traverse the array
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < smallest) {
//                 smallest = arr[i];
//             }
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }

//         // Output results
//         System.out.println("Smallest Element: " + smallest);
//         System.out.println("Largest Element: " + largest);
//     }
// }


 //6 - Find the total number of pairs in the array whose sum is equal to the given value . Example target =12

 
import java.util.Scanner;
public class ArrayQuestions {

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    System.out.println("Enter target sum ");
    int target = sc.nextInt();
    System.out.println(pairSum(arr, target));
        
    }
} 



//Count the number of triple whose sum is equal to the given value x 
//Example target =12

/* 

import java.util.Scanner;
public class ArrayQuestions {

    static int tripleSum(int[] arr, int target) {
        int n = arr.length;
        int ans=0;
        for(int i=0;i<n;i++) {//first pick number
            for(int j=i+1; j<n;j++){  //Second number find
                for(int k=j+1;k<n;k++) { //Third number find
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }        
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    System.out.println("Enter target sum ");
    int target = sc.nextInt();
    System.out.println(tripleSum(arr, target));
    }
} 

*/

// Find the unique number in a given array where all the elements are repeated twice with one value being unique.

/* 
import java.util.Scanner;
public class ArrayQuestions {

    static int findUnique(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
             if(arr[i]==arr[j]){
            arr[i] = arr[j] = -1;
             }
           }
         }
            for(int i=0;i<n;i++)
            if(arr[i]>0)
            return arr[i];
            return 1;
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    System.out.println("the number is \n "+findUnique(arr));
    }
} 

*/ 

// Find the second-largest value in the given array.
/* 
import java.util.Scanner;
public class ArrayQuestions {
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findSecondMax(int[] arr) {
        int mx = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Maximum Element " + findSecondMax(arr));
    }
} 

*/

//5 is the first value that is being repeated so return the first index of 5 that is 2.

/* 
import java.util.Scanner;
public class ArrayQuestions {

    static int firstRepeatNumber(int[] arr) {
        int n = arr.length;
      
        for(int i=0;i<n;i++) {//first pick number
            for(int j=i+1;j<n;j++){  //Second number find
                if(arr[i]==arr[j]){
                  return arr[i];

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    System.out.println("First Repeate Number : "+firstRepeatNumber(arr));
        
    }
} 

*/


//Given 2 integers a and b swap the number 2 given values using temporary variables.

/* 
public class ArrayQuestions {

    static void  swap(int a, int b) {
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp= a;
        a=b;
        b=temp;
        System.out.println("before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
       
    }
    public static void main(String[] args) {
       int a =9;
       int b =5;
       swap(a, b);      
    }
} 

*/

// Reverse an array consisting of integer values.

/* 
public class ArrayQuestions {
   
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){       
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int j=0;
        //traverse original array in reverse direction
        for(int i =n-1;i>=0;i--){
            ans[j++] =arr[i];
        }
        return  ans;     
    }
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7,8,9,10};
       int ans[] = reverseArray(arr);
       printArray(ans);
    }
}
*/

/*
 * public class ArrayQuestions {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7,8,9,10};
      int n =arr.length;
      for(int i=n-1;i>=0;i--){
        System.out.println(arr[i]);
       }  
    }
} 

*/

//Sort an array Consisting of only 0s and 1s.

/*
import java.util.Scanner;
public class ArrayQuestions {

    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }
       System.out.println();
    }
     static void sortZeroesAndOne(int[] arr){
        int n = arr.length;
        int zeroes =0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }else{
                arr[i] =1;
            }
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(arr);
        sortZeroesAndOne(arr);
        System.out.println("Sorted array: ");
        printArray(arr);      
    }
}
    */

    //Given an integer array 'a', return the prefix sum/running sum in the some array.

    /* 
    import java.util.Scanner;
    public class ArrayQuestions {

    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }
       System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] =arr[0];
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array");
        printArray(arr);
        int [] pref = makePrefixSumArray(arr);
        printArray(pref);
            
    }
}

*/

/*
 * output ;=
Enter size of array:
5
Enter the number 5
2
1
3
4
5
Input array
2 1 3 4 5
2 3 6 10 15
 */

    //Given an integer array 'a', return the prefix sum/running sum in the some array without creating a new array.

    /* 
    import java.util.Scanner;
    public class ArrayQuestions {

    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }
       System.out.println();
    }
    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array");
        printArray(arr);
        int [] pref = makePrefixSumArray(arr);
        printArray(pref);       
    }
}

*/
