@FunctionalInterface
interface DemoAno{
    void meth1();
}

public class demo{
    public static void main(String[] args) {
         DemoAno obj=()->{
          System.out.println("Hello i am method 1");
         };
         obj.meth1();
    }
}