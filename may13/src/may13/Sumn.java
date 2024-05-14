package may13;

import java.util.Scanner;

public class Sumn {

//	n =8 ; 1+2+3+4+5+6+7+8 = 36
//	n(n+1)/2=>8(9)/2 = 36
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int i =1; //initiliation
		int sum =0;
		while(i<=n)//termination cond
		{
			sum=sum+i;
			i++;//updation
		}
		
		System.out.println(sum);
	}
}
