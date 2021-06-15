package Static;

//static block example
public class StaticTest2 {
	// static variable
	static int a = 10;

	static int b = a * 5;

	
	// static block
	static {
		System.out.println("This is my static block");
//		b = a * 5; cannot make a static refernce to the non-static field b
	}

	public static void main(String[] args) {
		System.out.println("This is from main");
		System.out.println("a :" + a);
		System.out.println("b :" + b);

	}

}
