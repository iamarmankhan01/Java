public class C {
    {
        System.out.println("IIB");
    }
    static {
        new C();
        System.out.println("SIB");
    }
    C(){
        System.out.println("D");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
