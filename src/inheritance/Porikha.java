package inheritance;

class X {

	private String val;

	public X(String param) {
		setVal(param);
	}

	// ENCAPSULATION - SETTER
	public void setVal(String val) {
		// INHERITANCE - THIS
		this.val = val;
	}

	// ENCAPSULATION - GETTER
	public String getVal() {
		return this.val;
	}

	public void printVal() {
		System.out.println(getClass().getName() + " " + getVal());
	}

}

class Y extends X {

	public Y(String param) {
		super(param);
		printVal();
	}

	// POLYMORPHISM - OVERRIDING
	@Override
	public void printVal() {
		System.out.println(getClass().getName() + " " + getVal());
	}
}

public class Porikha extends Y {

	public Porikha(String param) {
		// INHERITANCE - SUPER
		super(param);
	}

	public static void main(String args[]) {
		new Porikha("Coding is best");
	}

}