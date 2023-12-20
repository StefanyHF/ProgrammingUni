package theory.lecture_2;

/**
 * This program demonstrates the use of ternary operators
 * 
 * @author DrJensLauterbach
 * @version 1.1
 *
 * 
 */

public class TryOperators {

	public static void main(String[] args) {

		int i = 5, j = 2;
		int result;

		// Similar to IF THEN ELSE
		result = (j > i) ? (j - i) : (i - j);

		System.out.println(result);

	}

}
