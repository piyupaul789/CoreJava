package stringManipulation;

public class ReverseStringByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reversed = "";
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Please enter word");
		// String givenStr = sc.nextLine();
		String givenStr = "Hello world this is Piyu";

		String[] arr = givenStr.split(" ");
		for (int i = arr.length -1; i >= 0; i--) {
			reversed += arr[i] + " ";

		}

		System.out.println("Reversed word - " + reversed);
	}

}
