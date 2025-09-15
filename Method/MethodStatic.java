/* 
public class MethodStatic {
    public static void main(String[] args) {
		MethodStatic.test();		
	}
	public static void test() {
		System.out.println(100);
	}

}
*/
//====================================================
public class MethodStatic {
	public static void main(String[] args) {
		int x = MethodStatic.test(100,200);	
		System.out.println(x);
	}
	public static int test(int a, int b) {
		return a+b;
	}
} 