package day5;

import java.util.Scanner;

public class C {
//taking input from keyboard
	public static void main(String[] args) {
//		scanf("%d", &n);
		//scanf -> in c lang
		//Scanner class is used to take input from keyboard
		//Syntax
		Scanner sc = new Scanner(System.in);//creating scanner 
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("You have enter "+n);
		float f = sc.nextFloat();
		boolean b = sc.nextBoolean();
		double d= sc.nextDouble();
		String str = sc.next();//to read strring
		
		
	}
}
