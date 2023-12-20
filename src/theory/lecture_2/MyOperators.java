package theory.lecture_2;

/**
 * Program to demonstrate arithmetic and logical operators
 * 
 * @author Jens Lauterbach
 * @version 1.0
 */

public class MyOperators {

	public static void main(String[] args) {

		double x = 1;
		double y = 2;
		double result = 0;

		// Arithmetic operators
		// unary operators
		// increment or decrement
		result = ++x; // will assign x to result first and then increment
		result = x++; // will increment x first and then assign to result
		System.out.println(result);
		result = x--; // logic see above
		result = --x;

		// dyadic operators
		result = x + y;
		result = x / y; // divide by 0
		result = x * y;
		result = x - y;
		result = x % y; // modulo
		System.out.println(result);

		// /triadic/ternary
		// IF, THEN, ELSE
		result = (x > y) ? (x - y) : (y - x);

		// Logical Operators

		boolean xLargerY = y < x;

		boolean checkStatement;
		int agePeter = 23;
		int ageAndrea = 24;

		checkStatement = ageAndrea == agePeter; // equal to
		checkStatement = ageAndrea > agePeter;
		checkStatement = ageAndrea < agePeter;
		checkStatement = ageAndrea <= agePeter;
		checkStatement = ageAndrea >= agePeter;
		checkStatement = ageAndrea != agePeter;

		checkStatement = ageAndrea > agePeter && ageAndrea >= agePeter;
		checkStatement = ageAndrea > agePeter || ageAndrea >= agePeter;
		checkStatement = !(ageAndrea > agePeter);

		// don't mix up with & and | -> bitwise operators
		// for overview of operators check also here:
		// https://www.tutorialspoint.com/java/java_basic_operators.htm

		System.out.println(xLargerY);

	}

}
