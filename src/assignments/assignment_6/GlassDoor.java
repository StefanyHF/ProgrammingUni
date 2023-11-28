package assignments.assignment_6;

public class GlassDoor extends Door {
	// used private final because the doorType of GlassDoor should always be Glass 
	private final String DOOR_TYPE = "Glass";

	@Override
	public String getDoorType() {
		return DOOR_TYPE;	
	}
}
