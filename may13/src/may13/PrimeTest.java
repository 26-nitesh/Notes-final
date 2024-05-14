package may13;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();//8 => 1,2,4,8 // (4)
		if(n==1) {
			System.out.println("1 is neither prime Nor Composite");
		}else {
			int c =0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					c++;
//					System.out.println(i);
				}
			}
			if (c == 2) {
				System.out.println(n + " is a prime Number");
			} else {
				System.out.println("Composite Number");
			}
			
			System.out.println("Number of factors "+c);
			
		}
		
	}
}
