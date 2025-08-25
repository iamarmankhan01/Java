public class C {
      int i=10;
      static int j = 30;
    public static void main(String[] args) {
        C c1 = new C();
        c1.test1(); 
    }
   
    public void test1(){
       System.out.println(this.i);
       System.out.println(this.j);
    }
}
