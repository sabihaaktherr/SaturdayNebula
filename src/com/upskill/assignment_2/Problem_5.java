package com.upskill.assignment_2;

public class Problem_5 {
/* Problem5. Write a program in Java to display the multiplication table of (eight)8.*/
	public static void main(String[] args) {
		multiplication_table();
		
	}
	   public static void multiplication_table() {
		for(int i=1;i<=8;i++) {
			for(int j=1; j<=8; j++) {
				int multiplication= i*j;
				
				System.out.print(multiplication + " " );
			}
			System.out.println(" ");
		}
		
	}
	

}
