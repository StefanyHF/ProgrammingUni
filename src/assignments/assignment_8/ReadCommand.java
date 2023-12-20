package assignments.assignment_8;

import prog1Tools.IOTools;

public class ReadCommand {
	public static void main(String[] args) {
		System.out.println("Insert an integer number: ");
		try {
			int number = IOTools.readInt();
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
