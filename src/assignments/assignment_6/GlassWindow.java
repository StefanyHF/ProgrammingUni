package assignments.assignment_6;

public class GlassWindow extends Window {

	// used private final because the type of GlassWindow should always be Glass
	private final String TYPE = "Glass";

	// return Glass as the Window type
	@Override
	public String getWindowType() {
		return TYPE;
	}
}
