package com.upskill.assignment_1;

public class Assignment_1 {
	
	public static void main(String[] args) {
		Assignment_1 obj= new Assignment_1();
		 obj.function();
		// System.out.println("multiply_value " + obj.function());
		 //obj.subtraction();
		triangle_three_arms();
		rectangle();
		retutn_1(30);
		retutn_2(50);
		int d = 50;
		int c=30;
		System.out.println("subtraction value  " + (d-c));
	}
	//Problem 1
	public static void triangle_three_arms() {
		
		int a= 5;
		int b=7;
		int c=11;
		int parameter=a+b+c ;
		System.out.println("the perimeter of triangle " +  parameter );
	}
	// Problem 2
	public static void rectangle () {
		
		int width= 9;
		int length=13;
		int perimeter_of_rectangle =2*(width+length);
		System.out.println("the perimeter of triangle " +  perimeter_of_rectangle );
	}
	// Problem 3
	public int function() {
		int a1=9;
		int b1=11;
		int multiply_value =a1*b1;
		int total_value=a1+b1+(multiply_value);
		System.out.println("multiply_value " + multiply_value);
		System.out.println("total_value " +total_value);
		return multiply_value;
		}
	// problem 4
//	public int subtraction() {
//		int c=30;
//		int d=50;
//		 int e=d-c;
//		 System.out.println("subtraction_value " + e);
//		return e;
		
	//}
	// problem 4
	
	public static int retutn_1(int c) {
		return 30;
		}
	
	public static int retutn_2(int d) {
		return 50;
		}
	
	} // git changes
