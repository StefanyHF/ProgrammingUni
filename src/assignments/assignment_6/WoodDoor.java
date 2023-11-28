package assignments.assignment_6;

public class WoodDoor extends Door {
	// // used private final because the doorType of WoodDoor should always be Wood 
	private final String DOOR_TYPE = "Wood";

	@Override
	public String getDoorType() {
		return DOOR_TYPE;	
	}
}
