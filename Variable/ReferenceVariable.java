public class ReferenceVariable {
    public static void main(String[] args) {
        ReferenceVariable a1 = null; // Object is not created, but reference variable is created
        ReferenceVariable a2 = new ReferenceVariable();// Storing Object address inside a2

        System.out.println(a1);
        System.out.println(a2);
    }

}
