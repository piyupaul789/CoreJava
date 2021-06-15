package inheritance;

class A {

	public static int a;
	public static int b;

	public double get_aPlusBWholeSquare() {
		return Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;
	}

	public void set_aPlusBWholeSquare(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public A(int a, int b) {
		set_aPlusBWholeSquare(a, b);
	}

}

public class C extends A {

	public C(int a, int b) {
		// new A(a, b); - can not call the super class constructor inside the sub class
		// constructor using name directly. We have to use super() keyword for this
		super(a, b);
	}

	public static void main(String[] args) {
		System.out.println(a);
		new C(1, 2);
		System.out.println(a);
		// new A(a, b); - can call the super class constructor inside the sub class
		// main method using name directly
		// new A(a, b);
	}
}