package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class polymorphism extends MethodType {
	/* 	Polymorphism is the ability of an object to take on many forms.
 
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car();
		car("ashmani");
		car(4);
		car("blue", 4);
		 WeeklyIncomeStatic();
	}
	public static void WeeklyIncomeStatic(){
	int CalculateWeeklyIncome = hourlyIncome * 40;
	int RealEstateIncome= 1400;
	int TotalIncome = (CalculateWeeklyIncome+RealEstateIncome);
	System.out.println("My Weekly Income =" + TotalIncome);
		}

	public static void car (){
		System.out.println("My car is Audi");
	}
	public static void car (String color){
		System.out.println("My car is Audi, my Audi color is :"+ color );
	}
	public static void car (int door){
		System.out.println("My car is Audi, my audi door:"+door);
	}
		public static void car (String color , int door){
			System.out.println("My car is Tesla, my tesla color is :"+ color + ", my Tesla door:" +door);
	}
}

