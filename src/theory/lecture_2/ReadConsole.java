package theory.lecture_2;
import static prog1Tools.IOTools.*; //you need this line of code and Prog1Tools needs to be a package in src of your project

/**
 * 
 * This program demonstrates the use of IOTools.
 * 
 * @author DrJensLauterbach
 * @version 1.2
 *
 * 
 */

public class ReadConsole {

	public static void main(String[] args) {

		String surname, name;
		int ageInYears;
		int ageInDays;

		// Read from the command line/console
		surname = readLine("Surname? >"); // command to read a line of text
		name = readLine("Name? >");
		ageInYears = readInt("Age in Years? >"); // command to read an integer
		ageInDays = ageInYears * 360;

		// Print out on command line

		System.out.println("\n Hello " + surname + " " + name + "!");
		System.out.println("\nYou are " + ageInDays + " days old!");

	}

}
