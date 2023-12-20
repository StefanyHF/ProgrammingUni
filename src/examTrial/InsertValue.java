package examTrial;
public class InsertValue {
	
	public static double[] insert(double[] array, double d, int k) {
		double[] newArray = new double[array.length+1];
		newArray[k] = d;
		return newArray;
	}
	
	public static void main(String[] args) {
		double[] testArray = new double[6];
		int k = 2;
		double d = 0.15;
		
		double[] test = insert(testArray, d, k);
		
		for(double value : test) {
			System.out.println(value);
		}
	}
}
