public class ExceptionPSA {
    static int x=10;
    public static void main(String[] args) {
         try {
            ExceptionPSA p = null;
            System.out.println(p.x);
         } catch (NullPointerException e) {
            e.printStackTrace();
            
         }
        System.out.println("Welcome");
    }
}
