package assignments.assignment_6;

public class GlassWindow extends Window{

	// used private final because the material of GlassWindow should always be Glass
	private final String MATERIAL = "Glass";


	// return Glass as the Window material
	@Override
	public String getWindowMaterial() {
		return MATERIAL;
	}
}
