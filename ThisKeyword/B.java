//this keyword can not use inside static Context.

public class B {
      int i=20;
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(this.i);
        b1.test1(); 
    }
    public static void test1(){
       System.out.println(this.i);
    }
}
