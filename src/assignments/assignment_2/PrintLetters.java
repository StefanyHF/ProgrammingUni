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
		
		int lenght = 8; 


		for(int i = 0; i < lenght; i++) {  // rows loop
			for(int j = 0; j < lenght; j++) { // columns loop
				System.out.print(letters[indexCounter + j] + "  ");	
			}
			System.out.println(); // move to the next row
			indexCounter++; 
		}
	}
}
