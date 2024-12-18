public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet <String> al = new java.util.LinkedHashSet<String>();
        System.out.println(al.size());
        al.add("c");
        al.add("b");
        al.add("a");
        al.add("c");
        System.out.println(al.size());
        System.out.println(al);
    }
}
