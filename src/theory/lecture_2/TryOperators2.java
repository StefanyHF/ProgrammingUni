package theory.lecture_2;

/**
 * This program demonstrates a simple calculation and logical expression
 * with input from the console
 * 
 * @author DrJensLauterbach
 * @version 1.1
 *
 * 
 */

import static prog1Tools.IOTools.*;

public class TryOperators2 {

	public static void main(String[] args) {

		double x = 0;
		double y = 0;
		boolean result1;

		// Alt+Shift+R

		System.out.println("Please enter the x value: ");
		x = readDouble();

		y = (5 / 3 - (100 + x) * (x - 20));

		result1 = y < 0;

		System.out.println("The value for y is " + y);
		System.out.println("For x = " + x + " the result of y < 0 is " + result1);

	}

}
