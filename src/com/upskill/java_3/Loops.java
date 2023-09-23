package com.upskill.java_3;

public class Loops {
	/* 	Type of Loops
		1. For Loop
		2. While Loop
		3. Do While Loop
		4. Infinite Loop
   */


	public static void main(String[] args) {
		// practiceForLoop();
		// practiceWhileLoop();
		// practiceDoWhileLoop();
		// practiceInfinityLoop();
		 practiceNestedForLoop();
	}
	
		public static void practiceForLoop(){
			int i;
			for (i=1; i<=4; i++){
				System.out.println("For Loop Number =" + i);
			}
	
	}

		public static void practiceWhileLoop(){
			int i = 1;
			while (i<=5){
				System.out.println("While Loop Number = " + i );
				i++;
			}
		}
		public static void practiceDoWhileLoop(){
			int i = 1;
			do {
				System.out.println(" Do While Loop Number = " + i);
				i++;
			} while (i<=0);
		}
		public static void practiceInfinityLoop(){
			int i;
			for (i=1; ; i++){
				System.out.println("Infinity Loop Number =" + i);
			}
	
}
		public static void practiceNestedForLoop(){
			int i ;
			int j ;
			
			for (i=1; i<=10; i++){
				for (j=1; j<=10; j++){
					int multipicationTable = i*j ;
					System.out.print(multipicationTable + " ");
				}
				System.out.println("");
			}
		}
}
