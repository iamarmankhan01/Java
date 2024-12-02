import java.util.*;
public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = sc.nextInt();
        
       for(int i =0;i<=100;i++){
        if(mark>=i){
       }
        else if(mark<40){
            System.out.println("fail");
        }
        else if(mark>50){
            System.out.println("good");
        }else if(mark>75){
            System.out.println("Very good");
        }
        else if(mark>90){
         System.out.println("Excellent");
        }
        else{
            System.out.println("Plese enter the number in 100");
        }
    
     }
    }
   }
       

