package assignments.assignment_5;

// Assignment 5.1

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print(fib1(50));

		System.out.print(fib2(50));

	}

	public static long fib1(long n) {
		if(n == 0 || n == 1) return n;
		if(n < 1) throw new IllegalArgumentException("Invalid input.");

		long fibonacciNumberN = 0;
		long first = 0;
		long second = 1;


		for(int i = 2; i <= n; i++) {
			fibonacciNumberN = first + second;
			first = second;
			second = fibonacciNumberN;
		}

		return fibonacciNumberN;
	}


	public static long fib2(long n) {
		if(n <= 1) return n;

		return fib2(n -1) + fib2(n - 2);

	}
}