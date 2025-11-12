public class A {
    public static void main(String[] args) {

        String s1 = "Arman";
        String s2 = "Arman";
        System.out.println(s1==s2);

        // output True
//*******************************************************************
        String x1 = new String("Arman");
        String x2 =new String("Arman");
        System.out.println(x1==x2);

        // output false
//*******************************************************************
        String a1 = "Arman";
        String a2 = new String("Arman");
        System.out.println(a1==a2);

        // output false
//*******************************************************************
        String j = "java";
        String p = "python";
        System.out.println(j.compareTo(p));

        // output -6
//*******************************************************************
        String s = "Hello Arman";
        System.out.println(s.startsWith("H"));
        System.out.println(s.endsWith("a"));

        //output true  ,false

    }
}
