import java.util.*;
public class url {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".or ")){
            System.out.println("This is organiztavdlkv");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is company website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is Indain website");
        }
        else{
            System.out.println("Not avlaible");
        }
    }
   
    
    
}
