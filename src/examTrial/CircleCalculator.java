package examTrial;

public class CircleCalculator {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.print("The radius value must be provided");
			return;	
		}

		double radius = Double.parseDouble(args[0]);
		final double PI = 3.14159265359;
		
		double area = Math.pow(radius, 2) * PI;
		System.out.print("This circle has an area of " + area + " square cm.");
	}
}
