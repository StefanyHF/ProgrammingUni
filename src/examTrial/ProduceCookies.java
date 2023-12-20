package examTrial;
public class ProduceCookies {
	public static void main(String[] args) {

		Cookie[] cookieBox = new Cookie[20];

		for(int i = 0; i < cookieBox.length; i++) {
			double random = 1 + Math.random() * 10; // generates double number between 1 and 10
			int diameter = (int) Math.ceil(random); // round the number to the nearest integer
			cookieBox[i] = new Cookie(diameter);
			System.out.println("Cookie "  + (i+1) + " : " + cookieBox[i].getDiameter());
		}

		Cookie[] cookieBox2 = new Cookie[20];

		for(int k = 0; k < cookieBox2.length/2; k++) {
			cookieBox2[k] = new ChocolateCookie();
		}

		for(int j = cookieBox2.length/2; j < cookieBox2.length; j++)  {
			cookieBox2[j] = new GingerCookie();
		}
		
		eatCookies(cookieBox2);
	}

	public static void eatCookies(Cookie[] cookies) {
		for(Cookie cookie: cookies) {
			System.out.print(cookie.getTopping());
			System.out.println();
		}
	}
}	


