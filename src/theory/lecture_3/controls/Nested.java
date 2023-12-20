package theory.lecture_3.controls;

/**
 * This program implements a nested for loop
 * 
 * @author DrJensLauterbach
 * @version 1.0
 * 
 */

public class Nested {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			for (int j = i; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();

		}

	}
}
