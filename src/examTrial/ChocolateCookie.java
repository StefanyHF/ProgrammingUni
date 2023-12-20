package examTrial;

class ChocolateCookie extends Cookie {
	
	public ChocolateCookie() {
		this.setTopping("");
	}
	@Override
	public void setTopping(String topping) {
		super.setTopping("Chocolate");
	}
}
