package assignments.assignment_4;

// Assignment 4.5

public class VowelCount {
	public static void main(String[] args) {
		VowelCount test = new VowelCount();

		String text = "Hello, Java class!";

		int vowelCount = test.countVowels(text);

		System.out.println("Number of vowels in the text: " + vowelCount);
	}


	private int countVowels(String text) {
		int count = 0;

		text = text.toLowerCase(); // convert to lowercase to handle upper and lower case vowels

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		return count;
	}
}
