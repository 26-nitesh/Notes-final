package loops;

public class C {
// WAP to get Sum from 1 to n
//eg	if n= 5 then evaluate (1+2+3+4+5 = 15)

	
	public static void main(String[] args) {
		int sum =0;
		int n = 5;
		for(int i =1;i<=n;i=i+1) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
