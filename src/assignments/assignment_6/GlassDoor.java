package assignments.assignment_6;

public class GlassDoor extends Door {
	// used private final because the doorType of GlassDoor should always be Glass 
	private final String doorType = "Glass";

	@Override
	public String getDoorType() {
		return doorType;	
	}
}
