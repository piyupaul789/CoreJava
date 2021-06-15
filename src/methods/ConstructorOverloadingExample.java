package methods;

class Vehicle {

	String name, age;

	public Vehicle() {
		this.name = "Default name";
		this.age = "Default age";
	}

	public Vehicle(String name, String age) {
		this.name = name;
		this.age = age;
	}

}

public class ConstructorOverloadingExample {

	public static void main(String[] piyu) {
		
		int x = 10;
		int y = 20;
		System.out.println(x + y);
		System.out.println(10 + 20);

		Vehicle customer = new Vehicle();
		System.out.println(customer.name + "\t" + customer.age);

		
		System.out.println(new Vehicle("Indica", "Red").name + "\t" + new Vehicle("Indica", "Red").age);
	}

}