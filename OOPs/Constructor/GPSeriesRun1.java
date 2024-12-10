import java.util.Scanner;
class GPSeries{
    int a,r,n,T;
    GPSeries(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of : a,r,h");
         a=sc.nextInt();
           r=sc.nextInt();
             n=sc.nextInt();
    }
    void printgp(){
        System.out.println("GPseries is :");
        for(int i=0;i<n;i++){
            T = (int) (a*Math.pow(r, i));
            System.out.println(T);
        }
    }
}
public class GPSeriesRun1 {
    public static void main(String[] args) {
        GPSeries g1 = new GPSeries();
        g1.printgp();
        
    }
}


