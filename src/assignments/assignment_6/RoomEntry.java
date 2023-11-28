package assignments.assignment_6;

public class RoomEntry extends WallBreak {

	private String entryType;

	// checks if the wallBreakFormat variable is provided and return an error message if it is not
	@Override
	public String getWallBreakFormat() {
		String wallBreakFormat = super.getWallBreakFormat();

		if(wallBreakFormat == "" || wallBreakFormat == null) {
			return "Wall break format not provided";
		} else {
			return wallBreakFormat;
		}
	}

	public String getEntryType() {
		return entryType;
	}
}
