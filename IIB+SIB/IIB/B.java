public class B {
    {
        System.out.println("FROM IIB");
    }

    B() {
        System.out.println("From Constructor");
    }

    public static void main(String[] args) {
        B a1 = new B();
    }
}
