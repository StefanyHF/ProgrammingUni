package assignments.assignment_1;


// Assignment 1.1


public class LargestNumberFinder {

	public static void main(String[]args) {

		int[] numbers = {1,5,8,3,9,0,2};  // List example - an array of integers

		System.out.print(findLargestPositiveNumber(numbers));
	}


	public static int findLargestPositiveNumber(int[] numbers) {     // static method that can be called directly from the main function, returning an integer
		if(numbers.length == 0) {    // check if the list is not empty to handle the case of having no numbers in the list
			throw new IllegalArgumentException("Input list is empty");
		}

		int largestNumber = numbers[0]; // initialize the largestNumber with the first item of the list

		for(int number: numbers) {   //loop through the list and compare each element with the largestNumber variable
			if(number > largestNumber) {
				largestNumber = number;
			}
		}
		return largestNumber;
	}

}
