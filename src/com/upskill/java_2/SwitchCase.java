package com.upskill.java_2;

public class SwitchCase {
	public static void main(String[] args) {
		int day=7;
	   switch(day) {
//You end each case using the break statement.	
//Without break, Java would continue executing all the next cases 
	   //(this is called fall-through, which you usually don’t want here).
	case 1:
	System.out.println("Monday");
	break;
	case 2:
	System.out.println("Tusday");
	break;
	case 3:
	System.out.println("Wednesday");
	
	case 4:
	System.out.println("Thursday");
	
	case 5:
	System.out.println("Friday");
	
	case 6:
	System.out.println("Saturday");
	
	case 7:
	System.out.println("Sunday");
	
	
	}
	
	}
}
