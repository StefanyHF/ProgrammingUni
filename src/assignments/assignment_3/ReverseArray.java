package assignments.assignment_3;

import java.util.Arrays;

import prog1Tools.IOTools;

// Assignment 3.2

public class ReverseArray {
	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		reverseArray.start();			
	}

	private int[] getUserInput() {
		System.out.print("How many numbers would you like to enter? ");
		int[] inputNumbers = new int[IOTools.readInt()];

		for(int i = 0; i < inputNumbers.length; i++) {
			System.out.print("Please enter a number: ");
			inputNumbers[i] = IOTools.readInt();
		}
		return inputNumbers;		
	}


	private int[] reverseIntArray(int[] originalArray) {
		int [] reversedList = new int[originalArray.length]; 
		int counter = 0; // variable to keep track of the originalArray index

		for(int i = reversedList.length - 1; i >= 0; i--) { 
			reversedList[i] = originalArray[counter]; 
			counter++;
		}
		return reversedList;	
	}

	private void displayResult(int [] originalArray, int[] reversedArray) {
		System.out.println("Original Array: " + Arrays.toString(originalArray));
		System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
	}

	public void start() {
		int[] inputNumbers = getUserInput();
		int[] reversedNumbers = reverseIntArray(inputNumbers);
		displayResult(inputNumbers, reversedNumbers);
	}
}
