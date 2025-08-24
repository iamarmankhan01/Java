public class E {
    public void test(){
        System.out.println("Test");
    }
    public static void main(String[] args) {
        new E().test();
    }
    {
        System.out.println("IIB");
    }
    E(){
        System.out.println("E");
    }
}
