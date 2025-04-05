package com.upskill.assignment_2;

public class Problem_7 {
	/* Problem7. You are given two integer number (a=25, b=30),  
	write a program to swap them and display result on the screen. */

	public static void main(String[] args) {
	
		swapnumber();
	}
	 public static void swapnumber() {
		 int a=25;
		 int b=30;
		 int swap=a;
		 a = b;
		 b = swap;
		 
		 System.out.println("Swap number for a: " +a);
		 System.out.println("Swap number for b: " +b);
		 
	 }
	

}
