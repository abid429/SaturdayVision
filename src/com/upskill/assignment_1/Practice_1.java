package com.upskill.assignment_1;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Problem 1: Write a for loop that prints 50 through 1 separated by spaces in the same line. */
		
		int a;
		for (a=1;a<=5;a++){
			System.out.println(a+"");
		}

	}

////////////////////////////////////////////////////////////////////////////
/* Problem2: A school conduct 100mark exam for its student and grade them as following 
Grade A : Marks=>90
Grade B : marks=>80-90 
Grade c : Marks=>70-79
Grade D : Marks=>60-69 and 
fail them who scored <60 
Write a java program to calculate the grade for a student in a method passing parameter for the desplay every grade type,
using if..eles statement */



	public static void main1(String[]args){
		myMethod(50);
	}
	
	public static void myMethod (int Marks){
	if (Marks>=90&&Marks<=100){
		System.out.println("Grade : A");}
		else if (Marks>=80&&Marks<=89){
			System.out.println("Grade : B");}
		else if (Marks>=70&&Marks<=79){
			System.out.println("Grade : C");}
		else if (Marks>=60&&Marks<=69){
			System.out.println("Grade : D");}
		else if (Marks<60){
			System.out.println(" fail");}
		else {
			System.out.println("invalid marks");
			}
		}
	}




