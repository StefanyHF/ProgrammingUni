package theory.lecture_3.controls;

/**
 * Syntax of if and do while
 * 
 * @author DrJensLauterbach
 * @version 1.0
 * 
 */

public class TryIf {

	public static void main(String[] args) {

		int i = 0;
		boolean condition = false;
		if (i > 1) {
			System.out.println(i);
		}

		if (i > 2) {
			System.out.println("i larger than 2");
		}

		// created with code completion Ctrl + Space
		do {

		} while (condition); // here we implement the actual condition
	}

}
