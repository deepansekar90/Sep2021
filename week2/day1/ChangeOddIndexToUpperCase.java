package week2.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "helloworld";
		char[] characterarray = test.toCharArray();

		int i = characterarray.length;

		for (int j = 0; j < i; j++) {
			if (j % 2 == 0) {
				char uppercase = Character.toUpperCase(characterarray[j]);

				System.out.print(uppercase);

			}

		}

	}

}
