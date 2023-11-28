package assignments.assignment_6;


public class BullEye extends Window {

	// used private final because the type of BullEye window should always be Bull's Eye
	private final String TYPE = "Bull's Eye";

	// return Bull's Eye as the Window type
	@Override
	public String getWindowType() {
		return TYPE;
	}
}
