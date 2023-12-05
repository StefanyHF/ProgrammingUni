package assignments.assignment_7;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Engine {
	private double fuelLevel;
	private double power;
	private double maxFuelLevel;
	//private double maxEnergy;


	public Engine(double fuelLevel, double power) {
		this.fuelLevel = fuelLevel;
		this.power = power;
	}
	
	public Engine(double fuelLevel, double power, double maxFuelLevel) {
		this.fuelLevel = fuelLevel;
		this.power = power;
		this.maxFuelLevel = maxFuelLevel;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(double value) {
		this.fuelLevel = value;
	}

	public double getHorsePower() {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
		symbols.setDecimalSeparator('.');
		DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
		double horsePower = power / 0.746;
		String formattedNumber = decimalFormat.format(horsePower);
		return Double.parseDouble(formattedNumber);
	}

	public void stepOnTheGas(double acceleration) {
		double fuelReduction = acceleration > 0.5 ? 0.3 : 0.05;
		fuelLevel -= fuelLevel * fuelReduction;
		fuelLevel = Math.round(fuelLevel); 
	}

	public double getMax() {
		return maxFuelLevel;
	}
}
