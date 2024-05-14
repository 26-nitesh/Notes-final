package loopWhile;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//
		System.out.println("Enetr Number");
		int n = scanner.nextInt();
		System.out.println("Number is " +n);
		while(n>0) {
			int rem = n%10;
			System.out.println(rem);
			n = n/10;
		}
		
	}
}
