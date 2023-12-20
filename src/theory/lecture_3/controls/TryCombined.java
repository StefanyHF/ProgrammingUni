package theory.lecture_3.controls;

/**
 * This program combines control loops and conditions
 * 
 * @author DrJensLauterbach
 * @version 1.0
 * 
 */

public class TryCombined {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				System.out.print("skipped");
				continue;
			} // if
			System.out.print(i); // println() print()
		} // for

	}// main
}// class