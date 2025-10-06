package p1;

public class B extends A {
	public void showB() {
		System.out.println("Inside class B");
	}
	public static void main(String[] args) {
		A a1 = new B();
		if (a1 instanceof B) {
			B b1 = (B) a1;
			b1.showB();
		}
	}
}
