package may17;
/*
 * Apple -> 
 * 
 * 
 */
public class C {

	int n;
	
	public C() {//0-parameter constructor
		System.out.println("Inside 0 Param");
	}
	public C(int n1) {//parametrized const
		System.out.println("Inside Param Const");
	}
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C(8);
	
	}
//	total Number of constructor

}
