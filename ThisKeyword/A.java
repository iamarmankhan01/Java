public class A {
    int i=10;
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.i);
        a1.test1(); 
    }
   
    public void test1(){
       System.out.println(this.i);
    }
    
}
