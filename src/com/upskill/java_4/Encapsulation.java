package com.upskill.java_4;

public class Encapsulation {
	private String name = "Abid";//write and read
	private int ssn = 132456;  //write only
	private String username = "upskill"; // read only 

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setSSN(122161511);
		System.out.println(obj.getUsername());
		System.out.println(obj.GetNAME());
	}
		// settel method - ssn         // set the data and write only
		
		public void setSSN(int value ){
			ssn = value; 
		}
		//getter method - username        //get the data ,read only
		public String getUsername(){
			return username;
		}
       public void setNAME (String value){
    	   name= value;
       }
       public String GetNAME (){
    	   return name;
       }
       
	}


