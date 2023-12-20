package theory.lecture_3.complex;

/**
 * Introduction to complex data types with arrays
 * 
 * @author DrJensLauterbach
 * @version 1.0
 * 
 */

public class MyArray {

	public static void main(String[] args) {

		// array = built in complex data type in JAVA to handle lists
		// Each element we put into an array is of the same type
		// for example int

		// declaration of an array of type in
		int[] myArray; // Alt 8/9

		// instantiation
		myArray = new int[12]; // new operator -> creates 12 cells with 0s
		// and index from 0 to 11

		myArray[0] = 1; // assigning a value to an empty cell in my Array

		System.out.println(myArray[0]); // prints the value in the array at index 0

	}

}
