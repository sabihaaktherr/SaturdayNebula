package com.upskill.assignment_2;

public class Problem_3 {
	
/* Problem3. Write two java functions which will return two different integer values,    
write a program to compare those numbers and send message that one number is bigger than other. 
(hints: using if..else)*/
     
	static int a=65;
	static int b=45;

	public static void main(String[] args) {
		functions(0);
		functions1(0);
     System.out.println("a is grater than b:" + (a>b));
     System.out.println("b is grater than a:" + (b>a));
     System.out.println("b is less than a:" + (b<a));
	}
	
	public static int functions(int a) {
		return 65;
		}
	
	public static int functions1(int b) {
		return 45;
		}

}
