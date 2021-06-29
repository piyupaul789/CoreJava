package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> reversedList = new ArrayList<Integer>();

		System.out.println("Enter the count");
		int count = Integer.parseInt(sc.nextLine());

		System.out.println("Enters the numbers for the array");
		for (int i = 0; i < count; i++) {
			int entry = Integer.parseInt(sc.nextLine());
			list.add(entry);
		}
		System.out.println("The list is - " + list);

		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}
		System.out.println("The reversed list is - " + reversedList);

	}

}
