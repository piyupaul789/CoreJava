package Static;

//Static variable
public class StaticTest3 {

	static int b = 10;

	static int a = m1();

	static {
		System.out.println("Inside static block");
	}

	static int m1() {
		System.out.println("from m1");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("value of b :" + b);
		System.out.println("value of a :" + a);
		System.out.println("from main");
	}

}
