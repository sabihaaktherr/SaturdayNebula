package com.upskill.assignment_1;

public class Problem_3 {
	
	
	public static void main(String[] args) {
		Problem_3 obj= new Problem_3();
		obj.function();
	}
	
	public int function() {
		int a1=9;
		int b1=11;
		int multiply_value =a1*b1;
		int total_value=a1+b1+(multiply_value);
		System.out.println("multiply_value " + multiply_value);
		System.out.println("total_value " +total_value);
		return multiply_value;
		}

}
