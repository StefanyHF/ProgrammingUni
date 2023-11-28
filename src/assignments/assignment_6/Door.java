package assignments.assignment_6;

public class Door extends RoomEntry {
	private final String ENTRY_TYPE = "Door";
	private String doorType;


	// override the superclass getEntryType method to always return Door as entryType
	@Override
	public String getEntryType() {
		return ENTRY_TYPE;	
	}

	public String getDoorType() {
		return doorType;
	}
}
