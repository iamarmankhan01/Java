public class D {
    public static void main(String[] args) {
        D d1 = new D();
        d1.test();
    }
    public void test() {
        this.test1();
    }
    public void test1() {
        System.out.println("From Test1");
    }
}
