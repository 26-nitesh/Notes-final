package may14;

public class D {
//* //0 space
// *//1 space
//  *//2 space
//   *//3 space
//    *//4 space
	
	public static void main(String[] args) {
		int n =5;
		for(int i=0;i<n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
