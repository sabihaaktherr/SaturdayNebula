package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car("red");
		Polymorphism obj = new Polymorphism();
		obj.annualIncomevoid();
	}
	
	public void annualIncomeVoid() {
		int calculateAnnualIncome= hourlyIncome*2000;
		int bonus=10000;
		int profitSharing=37000;
		int rental=3000;
		int sidehussel=10000;
		int totlaIncome=calculateAnnualIncome+bonus+profitSharing+rental+sidehussel;
		System.out.println("My annual income :"  + totlaIncome);
	}
	
	public static void car() {
		System.out.println(" My car is Tesla");
	}
	
	public static void car(int door) {
		System.out.println(" My car is Tesla, it has door :" + door );
	}
	
	public static void car(String color) {
		System.out.println(" My car is Tesla, it has door :" + color );
	}

}
