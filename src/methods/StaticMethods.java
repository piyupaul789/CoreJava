package methods;

import java.io.PrintStream;

public class StaticMethods {

	/*
	 * static variables can be called in both static and non-static methods. However
	 * non-static variable can only be called in non-static methods
	 */
	static PrintStream printer = null;

	static {
		printer = System.out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printer.println(staticMethod());
		
		
		new StaticMethods().nonStaticMethod();
	}

	public static String staticMethod() {
		String res = "";
		res = "Coding is best";
		return res;
	}

	public void nonStaticMethod() {
		printer.println("Coding is bestest");
	}

} 