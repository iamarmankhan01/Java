public class H {
    H() {
        System.out.println("From H");
    }
    H(int i) {   // fixed constructor
        this();  // calls default constructor
        System.out.println(i);
    }
    public static void main(String[] args) {
        new H(123);
    }
}
