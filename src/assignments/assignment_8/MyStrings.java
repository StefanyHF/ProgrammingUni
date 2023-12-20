package assignments.assignment_8;

public class MyStrings {
	public static void main(String[] args) {
		String[] myStrings = new String[20];

		try {
			myStrings[0].length();
		}catch(NullPointerException e) {
			System.out.print("Cannot invoke the length of null value.");
		}
	}
}
