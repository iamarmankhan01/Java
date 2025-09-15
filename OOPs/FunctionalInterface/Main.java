
interface A {
    void test1();
    void test2();
}

class B implements A {
    @Override
    public void test1() {
        System.out.println("From test1");
    }

    @Override
    public void test2() {
        System.out.println("From test2");
    }

    public void test3() {
        System.out.println("From test3");
    }

    public void test4() {
        System.out.println("From test4");
    }
}

public class Main {
    public static void main(String[] args) {
        B b1 = new B();
        b1.test1();
        b1.test2();
        b1.test3();
        b1.test4();
    }
}
