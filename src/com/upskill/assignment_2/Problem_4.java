package com.upskill.assignment_2;

public class Problem_4 {
/* Problem4. Write a for loop upto 500 which will increase the value double every time.*/
	
	public static void main(String[] args) {
	increase_double();
}
     public static void increase_double() {
		for(int i=1;i<=500;i=i*2) {
			System.out.println("Dauble value: " + i);
		}
		
	}
	
}
