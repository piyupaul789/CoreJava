public class PermuteString {

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length(); // len = 3
		System.out.println("All the permutations of the string are: ");
		generatePermutation(str, 0, len); // ABC, 0, 3
	}

	// Function for generating different permutations of the string
	public static void generatePermutation(String str, int start, int end) {
		// Prints the permutations
		if (start == end - 1) // if 0 == 2
			System.out.println(str); // print ABC
		else {
			for (int i = start; i < end; i++) { // i = 0; 0 < 3; i++
				// Swapping the string by fixing a character
				str = swapString(str, start, i);
				// Recursively calling function generatePermutation() for rest of the characters
				generatePermutation(str, start + 1, end); // RECURSION
				// Backtracking and swapping the characters again.
				str = swapString(str, start, i);
			}
		}
	}

	// Function for swapping the characters at position I with character at position
	// j
	public static String swapString(String str, int start, int i) { // ABC, 0, 1
		char[] b = str.toCharArray(); // ['A', 'B', 'C']
		char ch;
		ch = b[start]; // ch = 'A' as b[start] = b[0]
		b[start] = b[i]; // b[start] = 'B' as b[i] = b[1]
		b[i] = ch; // b[i] = 'A'
		return String.valueOf(b);
	}
}