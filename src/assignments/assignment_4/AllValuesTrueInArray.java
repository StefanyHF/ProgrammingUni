package assignments.assignment_4;

// Assignment 4.4

public class AllValuesTrueInArray {

	public static void main(String[] args) {
		AllValuesTrueInArray test = new AllValuesTrueInArray();
		boolean result1 = test.isAllTrue(new boolean[]{true, true, true, true, true});
		System.out.println(result1);

		boolean result2 = test.isAllTrue(new boolean[]{true, true, true, false});
		System.out.println(result2);	
	}

	private boolean isAllTrue(boolean[] values) {
		for(boolean value: values) {
			if(value == false) {
				return false;
			}
		}
		return true;
	}
}
