package loops;

public class WeiredNotWeirednumbers {

	public static void main(String[] args) {
		int n = 6;
		if (n % 2 != 0) {
			System.out.println("Wierd");
		}

		else if (n % 2 == 0 && n >= 2 && n <= 5) {
			System.out.println("Not Wierd");
		}
		else if (n % 2 == 0 && n >= 6 && n <= 20) {
			System.out.println("Wierd");
		}
		else if (n % 2 == 0 && n > 20) {
			System.out.println("Not Wierd");
		}
//		else if(3>2) {
//			System.out.println("TRUE");
//		}
		
		
		
//		if(n%2==0) {
//			if(n >= 2 && n <= 5) {
//				
//			}else if(n >= 6 && n <= 20) {
//				
//			}else if(n > 20) {
//				
//			}
//		}
	
	}
}
