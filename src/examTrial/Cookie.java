package examTrial;
public class Cookie {
	private double diameter;
	private String topping = "none";

	public Cookie(double diameter){
		this.diameter = diameter;
	}

	public Cookie(){
		this.diameter = 0.0;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
}
