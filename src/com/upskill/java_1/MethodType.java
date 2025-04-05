package com.upskill.java_1;

public class MethodType extends Variables {
	/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */
	
public static void main(String[] args) {
	
	MethodType obj=new MethodType();
	obj.annualIncomevoid();
	weeklyIncomeStatic();	
	System.out.println("My monthly Income=" + obj.monthlyIncomeReturn() );
	System.out.println("My Name=" + obj.text() );
	System.out.println("True or False =" + obj.test() );
}
	
	public static int hourlyIncome=55;
	public void annualIncomevoid() {
		
		int calculateAnnualIncome= hourlyIncome * 2000;
		System.out.println("My Annual Income=" + calculateAnnualIncome );
		
	}
	
	public static void weeklyIncomeStatic() {
		
		int calculateWeeklyIncome =hourlyIncome * 40;
		System.out.println("My Weekly Income=" + calculateWeeklyIncome );
	}
	
	
	public int monthlyIncomeReturn() {
		int calculateMonthlyIncome= hourlyIncome * 180;
		//System.out.println("My monthly Income=" + calculateMonthlyIncome );
		return calculateMonthlyIncome;
		
	}
	
	

	public String text() {
		String name= "Sabiha";
		
		return name;
		
	}
	
	public boolean test() {
		boolean trueOrfalse= true;
		
		return trueOrfalse;
		
	}
	
	
}
	
	
	
	
	
	


