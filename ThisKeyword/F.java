public class F {
    int i;
    public static void main(String[] args) {
        F f1 = new F();
        f1.test();
    }
    public void test(){
        int i=75;
        this.i=i;
        System.out.println(this.i); 
    }
}
