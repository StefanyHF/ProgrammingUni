package theory.lecture_2;
/**
 * Program to show primitive data types and variables
 * 
 * @author Jens Lauterbach
 * @version 1.0
 */

public class Fundamentals {

	public static void main(String[] args) {

		// data types -> primitive
		// keyword int for defining data type integer

		// Variable declaration
		int myNumber = 0; // Variable myNumber (=Name)
		int greatVariableName;

		final double PI = 3.14; // constant
		// PI = 3.28; //this does not work for constants

		// Initialize the variable
		myNumber = 1; // = means assign value to variable

		// byte = 1 byte, short, int, long
		// 1 byte = 8 bits = 01010101 = -128 to 127
		// int = 4 bytes = -2,147,483,648 to 2,147,483,647 = 2^32

		String myText; // String contains text /characters
		myText = "this is some text"; // literal

		double myDecNumber; // double allows decimals

		// float

		myDecNumber = 1.2;
		System.out.println(myDecNumber);
		myDecNumber = 1.0 / 2.0; // division - be careful
		// to use only double values

		boolean truth; // true = 1 or false = 0

		// ASCII -> Unicode
		char myLetter;
		myLetter = 'V';
		myLetter = 86; // V -> Unicode/decimal
		myLetter = '\u0056'; // -> Unicode

		System.out.println(myText);
		System.out.println(myDecNumber);
		System.out.println(myLetter);

		// Data type casting -> converting from one data type to another

		long sum = 92333372371889020L + 807; // implicit typecast
		String text = "Hello this is a casting " + 1; // implicit type cast
		int number = (int) 3.88; // explicit cast because you lose information

		System.out.println(number);

	}

}
