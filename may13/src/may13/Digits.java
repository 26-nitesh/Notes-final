package may13;

import java.util.Scanner;

public class Digits {

//	6865 -> 6,8,6,5
//	687-> 6,8,7
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();//initilisation
	
//		int unit = n%10; //n = 687
//		System.out.println(unit);
//		 n=n/10;//68
//		 int tenth = n%10;
//		 System.out.println(tenth);
//		 n=n/10;//6
//		 int hundred = n%10;
//		 System.out.println(hundred);
//		n =n/10;//0
//		System.out.println(n);
		
		while(n>0) {
			int digit = n%10;
			System.out.println(digit);
			n = n/10;//updation
		}
	}
}
