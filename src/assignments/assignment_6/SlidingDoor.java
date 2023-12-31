package assignments.assignment_6;

public class SlidingDoor extends Door {
	// used private final because the doorType of SlidingDoor should always be Sliding 
	private final String DOOR_TYPE = "Sliding";

	@Override
	public String getDoorType() {
		return DOOR_TYPE;	
	}

}
