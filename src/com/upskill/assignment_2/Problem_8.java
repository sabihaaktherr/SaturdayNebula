package com.upskill.assignment_2;

public class Problem_8 {
	/* Problem8. Write Java Program to display Factorial of Number 7. */
	public static void main(String[] args) {
		Factorial_of_Number();
		}
	
   public static void Factorial_of_Number() {
	   int i=7;
	   int Factorial=1;
	   for(int j=1; j<=i;j++) {
		   Factorial= Factorial*j;
		   }
	    System.out.println("Factorial of Number 7 is : " + Factorial );
	   
   }
}
