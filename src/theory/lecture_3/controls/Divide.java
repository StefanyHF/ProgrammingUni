
package theory.lecture_3.controls;

/**
 * Print all the numbers from 1 to 100 that are divisible by 11 OR 7 AND
 * divisible by 2 without rest.
 *
 */

public class Divide {

	public static void main(String[] args) {

		// option 1 with one if
		for (int i = 1; i <= 100; i++) {
			if ((i % 2 == 0) && (i % 11 == 0 || i % 7 == 0)) {
				System.out.print(i + ", ");
			}
		}

		System.out.println();

		// option 2 with two ifs
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				if (i % 11 == 0 || i % 7 == 0) {
					System.out.print(i + ", ");
				}
			}
		}

	}

}
