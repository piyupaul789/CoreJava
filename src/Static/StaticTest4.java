package Static;

//	static method
public class StaticTest4 {

	static int a = 10;
	int b = 20;

	static void m1() {
		a = 20;
		System.out.println("from m1");
	}

	void m2() {
		System.out.println("from m2");
	}

	static {
		System.out.println("Static block represents");
	}

	public static void main(String[] args) {

		System.out.println("a :" + a);
//		 System.out.println(m1);
		StaticTest4 obj = new StaticTest4();
//		m1();
		obj.m2();
	}

}
