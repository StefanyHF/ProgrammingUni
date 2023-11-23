package assignments.assignment_3;

// Assignment 3.1

public class MaxList {

	public static void main(String[] args) {

		int[] numbers = {1, 5, 8, 3, 9, 0, 2, 7, 9, 10};  // List of 10 numbers - an array of integers

		int largest = findLargestInArray(numbers);
		System.out.println("The largest number in the list is: " + largest);
	}

	public static int findLargestInArray(int[] numbers) {
		if (numbers.length == 0) {
			throw new IllegalArgumentException("Input list is empty");
		}

		int largest = numbers[0]; // Initialize the largest variable with the first element of the array

		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			}
		}

		return largest;
	}
}
