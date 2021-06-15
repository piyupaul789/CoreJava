package methods;

class SuperClass {

	public SuperClass() {
		System.out.println("This is super class's constructor");
	}

}

public class SuperKeyword extends SuperClass {

	public SuperKeyword() {
		// 4
		super();
	}

	// 1
	static {
		System.out.println("This is sub class's static block");
	}

	// 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3
		new SuperKeyword();
	}

}
