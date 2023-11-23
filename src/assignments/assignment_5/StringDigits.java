package assignments.assignment_5;

//Assignment 5.3

public class StringDigits {

	public static void main(String[] args) {

		String digits = "34567890";
		String letters = "sjdhsh32j";

		System.out.print(onlyDigits(digits));

		System.out.println();

		System.out.print(onlyDigits(letters));
	}

	public static boolean onlyDigits(String text) {

		if(text == null || text.isEmpty()) return false;

		char[] charArray = text.toCharArray();

		for(char c : charArray) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
}
