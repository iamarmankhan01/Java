import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class OtpGenerate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile number");
        String mobile = sc.next();

        HashMap<String,Integer> otps = new HashMap<>();
        int num = 100000+ new Random().nextInt(900000);
        otps.put(mobile,num);
        System.out.println("Generated OTP for testing: " +otps);

        System.out.println("Enter the mobile number to verify:");
        String x = sc.next();
        System.out.println("Enter the otp number");
        int otp = sc.nextInt();

        if(otps.get(x).equals(otp)){
            System.out.println("Verified successfully!");
        }else {
            System.out.println("Verification failed! Invalid mobile or OTP.");
        }
    }
}
