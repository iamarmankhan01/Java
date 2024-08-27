import java.util.*;

public class InputFromKeyword {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array list");
        int n=sc.nextInt();

        int num[]=new int[n];
        System.out.println("Enter the array index value");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        System.out.println("The all array is: ");
        for(int i=0;i<num.length;i++){
        System.out.println(num[i]+" ");
        }
    }
}