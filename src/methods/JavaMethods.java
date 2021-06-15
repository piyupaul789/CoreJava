package methods;

public class JavaMethods {

	static void add(int x, int y) {
		System.out.println("This is my method to show");
		int z = x + y;
		System.out.println(z);

	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		add(5, 3);
		int d = add(1, 2, 3);
		System.out.println(d);
	}

}
