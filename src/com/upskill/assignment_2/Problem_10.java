package com.upskill.assignment_2;

import java.util.Scanner;

import org.checkerframework.checker.units.qual.s;

public class Problem_10 {
	/* Problem10. Write a Java program to convert temperature 
	 * from Fahrenheit to Celsius degree.  */
	

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter temperature in Fahrenheit: ");
	        double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
           System.out.println("Temperature in Celsius: " + celsius);

	        scanner.close();
	    }
		
	}
	
	


