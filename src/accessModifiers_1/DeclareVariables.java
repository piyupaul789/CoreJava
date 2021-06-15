package accessModifiers_1;

public class DeclareVariables {

	public String publicVariable;
	protected String protectedVariable;
	private String privateVariable;
	
	public static void main(String ard[]) {
		System.out.println(new accessModifiers_1.DeclareVariables().privateVariable);
	}
	
}

class TestPrivateVariable {
	// public static void main(String ard[]) {
	// System.out.println(new accessModifiers_1.DeclareVariables().privateVariable);
	// }
}
