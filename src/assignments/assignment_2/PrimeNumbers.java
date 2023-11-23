package assignments.assignment_2;

import java.util.ArrayList;


// Assignment 2.1


public class PrimeNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> primeNumbers = findPrimeNumbers(1, 100);
		System.out.println(primeNumbers);

		int sum = 1060;
		boolean checkPrimeListSum = checkSum(primeNumbers, sum);
		System.out.println(checkPrimeListSum);	
	}

	public static ArrayList<Integer> findPrimeNumbers(int fromNumber, int toNumber) {

		// check for invalid inputs
		if(toNumber == 0 || fromNumber > toNumber) { 
			throw new IllegalArgumentException("Invalid input. The toNumber must be greater than fromNumber, and different than zero");
		}

		// an array list to store all prime numbers. ArrayLists dont need to have strict size like primitive int arrays, which allows to add numbers as needed
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>(); 

		// a loop to interact with each number between fromNumber and toNumber variables
		for(int i = fromNumber; i <= toNumber; i++ ) { 

			// skip checking number 1, because it is not a prime number
			if(i == 1)continue;  

			// check if i is 2, and if it is add to the primeNumbers string
			if(i == 2) { 
				primeNumbers.add(i); 
				continue;  // as it is already added to the list, there is no need to go in the for loop
			}

			// a loop to interact with the divisor factor, starting with 2
			for(int j = 2; j <= i; j++) { 	
				if(i != j && i % j == 0) { // check if the number is not the same because then the rest would be zero, and check if the rest of division is equal zero
					break;  // if the division rest is zero it is divisible, and therefore not a prime number, so we get out the loop	
				}else {
					if(i == j) {  // if the loop is in the last divisor, and it got to this block it is a prime number
						primeNumbers.add(i);
					}
				}
			}
		}
		return primeNumbers;
	}


	public static boolean checkSum(ArrayList<Integer> numbersList, int sum) {

		int listSum = 0;

		for(int number: numbersList) {

			listSum += number; // this adds number to the current value of listSum
		}

		if(listSum == sum) return true; else return false;
	}
}
