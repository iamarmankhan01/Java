import java.util.Scanner;

public class checke {
    public static void main(String[] args) {
    
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the first number");
       int x = sc.nextInt();
       System.out.println("Enter the Second number");
       int y = sc.nextInt();
       System.out.println("Before swap number is :"+x +" " +y); 
       x=x+y;   // x= 2+3= 5
       y=x-y;   // y=5-3=  2
       x=x-y;   // x=5-2=  3

       
       System.out.println("After swap: "+x+" "+y);
       
    }
}
