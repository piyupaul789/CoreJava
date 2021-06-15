
public class Recursion {

	static int limit = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveMethod();
	}

	static void recursiveMethod() {
		System.err.println("This is a Recursive Method " + limit);
		limit++;
		while (limit < 10) {
			recursiveMethod();
		}
	}

}
