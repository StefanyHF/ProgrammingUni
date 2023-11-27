package assignments.assignment_6;

public class Door extends RoomEntry {
	private final String entryType = "Door";
	private String doorType;


	// override the superclass getEntryType method to always return Door as entryType
	@Override
	public String getEntryType() {
		return entryType;	
	}

	public String getDoorType() {
		return doorType;
	}
}
