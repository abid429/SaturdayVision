package com.upskill.java_1;

public class MethodType {
	public static int hourlyIncome = 65;

	public static void main(String[] args) {
		System.out.println("its Abid");
		 WeeklyIncomeStatic();
		
		MethodType myObj = new MethodType();
		myObj.annualIncomeVoid();
		
		System.out.println("my monthly income = " + myObj.monthlyIncomeRetuen() );
	}
//	Void method
		public void annualIncomeVoid(){
			int CalculateAnnualIncome = hourlyIncome * 2000 ; 
			System.out.println("My Annual Income =" + CalculateAnnualIncome );
		}
		// Static Method 
		public static void WeeklyIncomeStatic(){
	int CalculateWeeklyIncome = hourlyIncome * 40;
	System.out.println("My Weekly Income =" + CalculateWeeklyIncome);
		}
// ReturnTypeMethod
		public int monthlyIncomeRetuen (){
			int calculateMonthlyIncome = hourlyIncome * 100 ;
			return calculateMonthlyIncome;
		}

}
