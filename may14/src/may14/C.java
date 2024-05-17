package may14;

public class C {
//	      1 2 3 4 5
//  5  => * # * # * 
	public static void main(String[] args) {
		int n = 5;
		for(int i =1 ;i<=n;i++) {
			if(i%2==0) {
				//even  num
				System.out.print("# ");
			}else {
				System.out.print("* ");
			}
		}
	}
}
