package day5;

public class A {

//	Extracting digits from number
//	23456765;
	public static void main(String[] args) {
		int n = 453;
//		System.out.println("Value of n "+n);
		int unitdigit = n%10;
		System.out.println(unitdigit);
		n = n/10;//45
		int tenthDigit = n%10;
		System.out.println(tenthDigit);
//		System.out.println("Value of n "+n);
		n = n/10;//45/10 = 4
//		System.out.println("N value"+n);
		System.out.println(n%10);

		// since we cant be sure about the number of digits
//		will try to do this with loop
	}
}
