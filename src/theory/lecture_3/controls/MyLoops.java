package theory.lecture_3.controls;

/**
 * This program introduces to control structures = loops
 * 
 * @author DrJensLauterbach
 * @version 1.0
 * 
 */

public class MyLoops {

	public static void main(String[] args) {

		// Loops: FOR

		for (int i = 0; i < 10; i++) { // head (initialization; logical expression; update list)
			System.out.println(i);
		}

		int j = 0;

		for (; j < 10; j++) { // head
			System.out.print(j + ","); // body
		}

		// Loops: WHILE
		System.out.println();
		System.out.print("WHILE: ");
		int k = 0;

		while (k < 10) {
			System.out.print(k);
			k++;
		}

		// Loops: do
		System.out.println();
		System.out.print("DO: ");
		int l = 0;
		do {
			System.out.print(l);
			l++;
		} while (l < 10);

	}

}
