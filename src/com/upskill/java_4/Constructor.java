package com.upskill.java_4;

public class Constructor {


	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	String studentName;
	int studentAge;
	public Constructor(String name){
		studentName = name;	
	}
	public Constructor(String name, int age){
	    studentName = name;	
		studentAge = age;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor("Upskill");
		System.out.println(obj.studentName);
		
		
		Constructor obj2 = new Constructor("ryan", 25 );
		System.out.println(obj2.studentName);
		System.out.println(obj2.studentAge);
	}

}
