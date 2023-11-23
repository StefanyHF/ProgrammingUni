package assignments.assignment_2;

// Assignment 2.4

public class PrintLetters {
	public static void main(String[] args) {

		// letters needed for printing
		char[] letters = {
				'A', 'B', 'C', 'D', 'E', 
				'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O'};


		int indexCounter = 0; // this keeps track of the current position in the letters array


		for(int i = 0; i < 8; i++) {  // rows loop
			for(int j = 0; j < 8; j++) { // columns loop
				System.out.print(letters[indexCounter + j] + "  ");	
			}
			System.out.println(); // move to the next row
			indexCounter++; 
		}
	}
}
