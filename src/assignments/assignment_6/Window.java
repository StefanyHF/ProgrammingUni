package assignments.assignment_6;

public class Window extends WallBreak {

	String windowMaterial;

	// checks if the wallBreakFormat variable from the super class is null or empty and return a error message
	@Override
	public String getWallBreakFormat() {
		String wallBreakFormat = super.getWallBreakFormat();

		if(wallBreakFormat == null || wallBreakFormat == "") {
			return "No wall break format provided";
		}else {
			return wallBreakFormat;
		}
	}

	public String getWindowMaterial() {
		return windowMaterial;
	}
}
