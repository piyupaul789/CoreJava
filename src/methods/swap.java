package methods;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using 3 varriable

		int a = 10;
		int b = 20;
		int c;

		c = a;
		a = b;
		b = c;
		System.out.println("swapping of a & b is " + a + " & " + b);

		// using 2 varriable
		int x = 10, y = 20;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("swapping of x & y is " + x + " & " + y);

	}

}
