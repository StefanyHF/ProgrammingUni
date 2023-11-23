package assignments.assignment_2;

import prog1Tools.IOTools;

// Assignment 2.3

public class PrintStarsSquare {
	public static void main(String[] args) {

		System.out.println("Enter the field size: ");
		int edgeLength = IOTools.readInt();

		if (edgeLength <= 0) {
			System.out.println("Edge length must be a positive number.");
		} else {
			for (int i = 0; i < edgeLength; i++) { // rows loop
				for (int j = 0; j < edgeLength; j++) { // columns loop
					// check if it's an edge position (first row, last row, first column, last column)
					if (i == 0 || i == edgeLength - 1 || j == 0 || j == edgeLength - 1) {
						System.out.print("* ");
					} else {
						System.out.print("  "); // print a space for the inside positions
					}
				}
				System.out.println(); // move to the next row
			}
		}
	}		
}
