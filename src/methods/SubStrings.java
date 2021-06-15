package methods;

public class SubStrings {

	public static void main(String[] args) {

		String name = "Piyu Paul";
		int beginIndex = name.indexOf('P');
		int endIndex = name.lastIndexOf('P');
		String subStringName = name.substring(beginIndex + 1, endIndex);
		System.out.println(subStringName + " " + subStringName.length());

	}

}
