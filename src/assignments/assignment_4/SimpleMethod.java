package assignments.assignment_4;

// Assignment 4.3

public class SimpleMethod {

	public static void main(String[] args) {
		SimpleMethod simpleMethod = new SimpleMethod();
		double result = simpleMethod.maxMinSumSquareRt(5, 7, 10);
		System.out.print(result);
	}


	private double maxMinSumSquareRt(double a, double b, double c) {

		double largest = Math.max(a, Math.max(b, c));
		double smallest = Math.min(a,  Math.min(b, c));

		double sum = largest + smallest;

		return Math.sqrt(sum);
	}
}
