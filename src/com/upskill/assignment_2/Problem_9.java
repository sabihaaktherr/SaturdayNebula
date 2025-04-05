package com.upskill.assignment_2;

public class Problem_9 {
	/* Problem9. Write a program to swap two string variables (Talen, Tech) 
	 * and display result on the screen. */
	public static void main(String[] args) {
	
		swapString();
	}
	
	public static void swapString() {
		
		String name= "Talen";
		String name1= "Tech";
		
		String swap=name;
		name= name1;
		name1 = swap;
		
		System.out.println("swap String for name :" + name);
		System.out.println("swap String for name1 :" + name1);
	}

}
