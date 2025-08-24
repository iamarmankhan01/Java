public class D {
    static {
        System.out.println("SIB");
    }
    static {
        System.out.println("Hello");
        new D();
    }
    {
        System.out.println("IIB");
    }
    public static void main(String[] args) {
        new D();
    }
}
