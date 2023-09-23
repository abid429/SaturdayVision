package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		// Array store multiple data using index
		int age = 30;                                      // variable
		int [] ageVision = new int [] {21, 26, 28, 30, 35};// array
		
		// array index        [0] [1] [2] [3] [4] 
		System.out.println("Student Age : " + ageVision[3]);
		System.out.println("Total student : " + ageVision.length);

	
	 
	String [] nameVision = new String [] { "Abid" , "maksud", "rasel", "shakib"}; 
	System.out.println("student name : "+ nameVision[3]);
	System.out.println("total student name:"+ nameVision.length);
	
	//HashMap store multiple data using key-value pair, implementation of map interface
	HashMap<String, Integer> Student = new HashMap<String, Integer>();
	Student.put("Abid",21);
	Student.put("maksud",26);
	Student.put("rasel",28);
	Student.put("shakib",30 );
	System.out.println("hasmap student age :"+ Student.get("maksud"));
	
	HashMap<String, String > CountryCapital= new HashMap<String, String >();
	
	CountryCapital.put("canada" , "ON");
	CountryCapital.put("bangladesh" , "Dhaka");
	CountryCapital.put("India" , "dehli");
	CountryCapital.put("England " , "london");
	
	System.out.println("Capital:"+ CountryCapital.get("canada") );
	
	
	//hashtable
	Hashtable<String, String > Region= new Hashtable<String, String >();
	
     Region.put("BD", "Asia");
     Region.put("USA", "America" );
     System.out.println("Region:"+ Region.get("BD"));
	//hashset
     
     HashSet<String> car = new HashSet <String>();
     car.add("Tesla");
     car.add("Toyota");
     car.add("audi");
     
     System.out.println("car name : "+ car);
     
     

	}
}
