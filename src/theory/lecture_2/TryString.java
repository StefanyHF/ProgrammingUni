package theory.lecture_2;

/**
 * 
 * This program demonstrates the basic use of Strings.
 * 
 * @author DrJensLauterbach
 * @version 1.1
 *
 * 
 */

public class TryString {

	public static void main(String[] args) {

		String someText; // Variable/Data Declaration
		String someOtherText;
		int myNumber;
		int myNumber2 = 1;
		int result;

		myNumber = 1;
		result = (myNumber + myNumber) + myNumber2; // syntax for calculation

		System.out.println(result);

		someText = ""; // initialize with Null

		someText = "Hello this is a text";
		someOtherText = "My calculation result is ";

		System.out.println(someText);

		System.out.println(someOtherText + result); // concatenation

	}

}
