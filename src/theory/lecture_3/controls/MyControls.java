
package theory.lecture_3.controls;

/**
 * This program introduces to control structures -> conditions
 * @author DrJensLauterbach
 * @version 1.0
 * 
 */

import static prog1Tools.IOTools.*;

public class MyControls {

	public static void main(String[] args) {

		// Conditions: IF ELSE

		/*
		 * int x = readInteger("Insert a number x"); // reads an int from the console
		 * 
		 * if (x == 0) { System.out.println("Cannot divide by 0"); } else {
		 * System.out.println("Number not 0"); System.out.println("The result of 1/x = "
		 * + 1 / x); }
		 * 
		 * double d = readDouble("Insert a number d"); // reads a double value from the
		 * console
		 * 
		 * if (d == 0) { // parenthesis contain a logical expression -> true/false
		 * System.out.println("Cannot divide by 0"); } else if (d == 1) {
		 * System.out.println("This is always 1"); } else { // always executed when if
		 * condition and else if conditions are false
		 * System.out.println("Number not 0"); System.out.println("The result of 1/d = "
		 * + 1 / d); }
		 * 
		 * if (d == 100 && d > 50) { // not executed if condition not true
		 * System.out.println("That's a large number"); }
		 */
		// Conditions: Switch Case

		int month;
		month = readInteger("Insert number for the month");

		switch (month) {
		case 1: {
			System.out.println("January");
			break; // jump command
		}
		case 2:
			System.out.println("February");
			System.out.println("Test");
			break;

		default: {
			System.out.println("Please enter a valid number from 1-12");
			System.out.println("Test");
		}

		}

		// use of curly brackets for a block vs. one line of code only
		if (month == 3) {
			System.out.println("If Statement");
			System.out.println("If Statement second line");
		}
	}

}
