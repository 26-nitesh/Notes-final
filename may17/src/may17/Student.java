package may17;

import java.util.Scanner;

public class Student {

	int id;
	String firstName;
	String lastName;
	int rollNo;
	String phoneNum;
	
	
//	public Student(){//default constructor
//	}

//	public Student() {
//		System.out.println("HI i m in constructor");
//	}
	public static void main(String[] args) {

		Student s1 = new Student();//s1 is reference var
		System.out.println(s1.firstName);//default value
		System.out.println(s1.lastName);
		System.out.println(s1.id);
		s1.firstName="Aman";
		System.out.println(s1.firstName);
				System.out.println("In Main MEthod");
		
	}
}
