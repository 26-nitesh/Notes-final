package may17;

import java.util.Scanner;

public class A {
// WAP if number is even then display its factors
//	if number odd then check whether it is prime or not
//	if odd number is not prime then display factors
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		boolean isEven = isNumberEven(n);
		if(isEven) {
			displayFactors(n);
		}else {
//			odd nums
			boolean isPrime= isNumberPrime(n);
			if(isPrime) {
				System.out.println("PRIME NUMBERS");
			}else {
				System.out.println("COMPOSITE");
				displayFactors(n);
			}
		}
	}
	public static boolean isNumberEven(int number) {
//		if(number%2 == 0) {
//			return true;
//		}else {
//			return false;
//		}
		return number%2==0;
	}
	
	public static void displayFactors(int number) {
//		6 => [1,6]
//		factors range will be from 1 to number
		for(int i =1;i<=number;i++) {
			if(number%i==0) {
				System.out.print(i);
			}
		}
	}
	
	public static boolean isNumberPrime(int number) {
		int c =0;
		for(int i =1; i<=number;i++) {
			if(number%i==0) {
				c++;
			}
		}
//		if(c==2)
//			return true;
//		else
//			return false;
		return c==2;
	}
	
	public static int sum(int a, int b) {
		int c = a+b;
		return c;
	}
}
