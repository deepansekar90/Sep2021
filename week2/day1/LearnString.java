package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "Hello";

		System.out.println(test);

		String test1 = new String();

		test1 = "Hello World";

		System.out.println(test1);

		String test2 = new String("Hello World one");

		System.out.println(test2);
		// Length of the String
		int length = test2.length();

		System.out.println("Length Is : " + length);

		// Find a character in a string

		char character = test2.charAt(0);

		System.out.println("Character Is : " + character);

		// FInd the index of the character

		int index = test2.indexOf("l");
		System.out.println("Index Is : " + index);

		// Last index

		int lastindex = test2.lastIndexOf("l");
		System.out.println("Last Index is " + lastindex);

		// Convert to char array

		char[] characterarray = test2.toCharArray();
		for (int i = 0; i < characterarray.length; i++) {
			System.out.println(characterarray[i]);

		// To Upper case

			String uppercase = test2.toUpperCase();
			System.out.println(uppercase);

		// To Lower Case

			String lowercase = test2.toLowerCase();
			System.out.println(lowercase);

		// Character Conversion
			
			char charlow=Character.toLowerCase('H');
			System.out.println(charlow);
			
		//Comparision of Strings
			
			String teststirng="Hello World";
			String teststring1="Hello world";
			
			boolean equals=teststirng.equals(teststring1);
			System.out.println(equals);
	
			boolean equals1=teststirng.equalsIgnoreCase(teststring1);
			System.out.println(equals1);
			
		}
	}

}
