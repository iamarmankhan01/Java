/*
public class MethodArgument {
  public static void main(String[] args) {
  MethodArgument c1 = new MethodArgument();
  c1.test(100);
}	
public void test(int x) {
	System.out.println(x);
}
}
*/
//======================================================
public class MethodArgument {
    public static void main(String[] args) {
        MethodArgument a1 = new MethodArgument();
        a1.test("mike", 1, 2, 3, 4, 5);
    }
    public void test(String y, int... x) {// Local variable
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
        System.out.println(y);
    }
}