package theory.lecture_3.controls;

/**
 * Use of IOTools
 * 
 * @author DrJensLauterbach
 * @version 1.0
 * 
 */

import static prog1Tools.IOTools.*;

public class TryReadInt {

	public static void main(String[] args) {

		// division by zero depends on data type
		int y = 0;
		int x = 1;

		// System.out.println(x/y * 100);

		x = readInt("Insert Number ");

		System.out.println(x);

		// logical operators
		// && = AND, || = OR
		// & | -> bitwise operators -> 1000111 & 110011

	}
}
