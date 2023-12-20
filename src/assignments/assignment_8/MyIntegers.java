package assignments.assignment_8;

public class MyIntegers {
	public static void main(String[] args) {
		int[] myIntegers = new int[20];

		try {
			myIntegers[20] = 199;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Index out of bounds.");
		}	
	}
}
