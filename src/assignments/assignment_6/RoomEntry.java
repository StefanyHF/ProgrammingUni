package assignments.assignment_6;

public class RoomEntry extends WallBreak {

	private String entryType;

	// checks if the wallBreakFormat variable is rectangle and return an error message if it is not
	@Override
	public String getWallBreakFormat() {
		String wallBreakFormat = super.getWallBreakFormat();

		if(wallBreakFormat != "Rectangle") {
			return "Wall break must be a rectangle";
		} else {
			return wallBreakFormat;
		}
	}

	public String getEntryType() {
		return entryType;
	}
}
