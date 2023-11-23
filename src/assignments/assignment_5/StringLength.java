package assignments.assignment_5;

// Assignment 5.2

public class StringLength {

	public static void main(String[] args) {

		StringLength test = new StringLength();
		String result = test.stringLength("test");

		System.out.print(result);
	}

	public String stringLength(String text) {
		if(text == null) return "Input text is null.";

		int length = text.length();

		return String.format("Your string is %d characters long", length);
	}
}
