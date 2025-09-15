public class StaticVariable  {
	static int x = 10;
	public static void main(String[] args) {
		System.out.println(StaticVariable.x);
		StaticVariable  v = new StaticVariable ();
		v.test();
	}
	public void test() {//Non static
		System.out.println(StaticVariable.x);
	}
}