package week2.day1;

import java.util.Iterator;

public class LearnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Today is Sunday 12345";
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		// substring
		String substring = str.substring(7);
		System.out.println(substring);

		// substring with beginning & end index
		String substring1 = str.substring(10, 15);
		System.out.println(substring1);

		// Replace-replace all the occurrences
		String replace = str.replace('a', 'A');
		System.out.println(replace);

		// Replace all-Integers & Non integers
		String replaceall1 = str.replaceAll("[\\d]", ""); // Replace integers with null
		System.out.println(replaceall1);

		String replaceall2 = str.replaceAll("[\\D]", ""); // Replace non integers/alphabets
		System.out.println(replaceall2);

		// parseint-->Convert string into int
		int parseint = Integer.parseInt(replaceall2);
		System.out.println(parseint);

	}

}
