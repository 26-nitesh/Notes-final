package may16;

/*
 * 
 * switch() from conditions
 * replacement of if else
 * switch is preffered when out of many conditions only one
 * is true
 * syntax -> switch(value){
 *    case valueOne:
 *    	statement;
 *      break;
 *      
 *    default:
 *    	break;  
 * }
 * 
 */
public class C {

	public static void main(String[] args) {
		int age = 31;
//		if(age>=18) {
//			System.out.println("Eligible For Vote");
//		}
//		else {
//			System.out.println("Not Eligible");
//		}
////		
//		    boolean b  = age>=18;
//		    
//		    switch() {
//		    
//		    case true:
//		    	System.out.println();
//		    }
		
		char gender = 'F';
		
		switch(gender) {
	
		case 'M':
			System.out.println("MALE");
			break;
		case 'F':
			System.out.println("FEMALE");
			break;
		default:
			System.out.println("OTHERS");
			break;
		}
		
	}
	
	
}
