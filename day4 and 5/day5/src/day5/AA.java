package day5;

public class AA {

	public static void main(String[] args) {
//		1.
//		int n1 = 50;
//		int n2 = 25;
//		int div = n1/n2;
//		System.out.println(div);
//		===============================================
//		2.
		int n1 = 10;
		// 10 is a integer literal getting assigned
		//to int variable n1 
		int n2 = 4;
		int div = n1/n2;//(int/int)
		/*
		 * 
		 * Actual result should be 2.5 but since n1/n2 is in form
		 * of int/int division , so 0.5 will be round offed
		 * 
		 * De-merit ==> loss of data or less accurate data
		 * to resolve it we will need type casting
		 */
//		System.out.println(div);
//		==================================================
//		3.
		int num1 = 10;
		int num2 = 4;
		float result  = num1/num2;
		/*
		 * here we r storing result to float but division 
		 * is still  (int/int)
		 * result of num1/num2 will be 2 and this 2 will be 
		 * assigned to float variable result
		 * so as result varible is of float type so result of
		 * num1/num2 will be coverted to float which wil be
		 * 2.0
		 */
//		System.out.println(result);
		
//		========================================
//				4.
		
		int x = 10;
		int y = 4;
		float res;
//		res = (float)x/y;
//		res = x/(float)y;
		res = (float)x/(float)y;
/*
 * since x/y is of int/int type and it will give int result
 * so we are trying to type-cast int x to float of x;\
 * Now divisiion is of type (float/int)
 * rsult will come as float
 */
		System.out.println(res);
	}
}
