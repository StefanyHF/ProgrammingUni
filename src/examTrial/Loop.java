package examTrial;

public class Loop {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 0; i < 100; i+=9) {
			if(count == 9) return;
				System.out.print(i + " ");	
				count++;
		}
	}
}
