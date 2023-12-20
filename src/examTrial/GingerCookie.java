package examTrial;
public class GingerCookie extends Cookie {
	
	public GingerCookie() {
		this.setTopping("");
	}
	
	@Override
	public void setTopping(String topping) {
		super.setTopping("Sugar");
	}	
}
