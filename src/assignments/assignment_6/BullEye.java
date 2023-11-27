package assignments.assignment_6;

import java.text.DecimalFormat;

public class BullEye extends WallOpening{

	// It formats the width to have one digit after the decimal point using

	@Override
	public double getWidth() {
		double width = super.getWidth();

		//DecimalFormat object with one digit after decimal point
		DecimalFormat decimalFormat = new DecimalFormat("#.#");

		// Format the double value using the DecimalFormat
		String formattedValue = decimalFormat.format(width);

		// Convert the formatted string back to a double
		double formattedDoubleValue = Double.parseDouble(formattedValue);

		return formattedDoubleValue;
	}
}
