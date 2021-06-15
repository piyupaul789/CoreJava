package Static;
//static member can be accessed before instantiating a class

public class StaticTest1 {
	// static method
	static void m1() {
		System.out.println("from m1");
	}

	public static void main(String[] args) {
		m1();   //calling m1() without creating any object of class StaticTest1
	}

}
