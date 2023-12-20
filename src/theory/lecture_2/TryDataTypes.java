package theory.lecture_2;

/**
 * This program demonstrates the use of primitive Data Types demonstrate javadoc
 * 
 * @author DrJensLauterbach
 * @version 1.1
 *
 * 
 */

public class TryDataTypes {

	/**
	 * 
	 * @param args Command line parameters: nones
	 */

	public static void main(String[] args) {

		int myNumber, myNumber2;
		boolean truth = false;
		char ab, cd, ef;
		double d = 1.2;

		int a = 0x2; // hexadecimal

		System.out.println(a);
		System.out.println(d);

		myNumber = 1 / 10;
		d = 1 / 10; // won't work

		System.out.println(myNumber);
		System.out.println(d);

		d = 1.0 / 10.0; // careful with calculations
		System.out.println(d);

	}

}
