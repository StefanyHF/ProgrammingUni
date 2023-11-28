package assignments.assignment_6;

public class Window extends RoomEntry {

	private final String ENTRY_TYPE = "Window";
	String windowType;


	// override the superclass getEntryType method to always return Window as entryType
	@Override
	public String getEntryType() {
		return ENTRY_TYPE;	
	}

	public String getWindowType() {
		return windowType;
	}
}
