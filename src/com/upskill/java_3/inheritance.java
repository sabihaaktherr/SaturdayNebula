package com.upskill.java_3;

import com.upskill.java_1.MethodType;
import com.upskill.java_1.Variables;

public class inheritance extends MethodType{
	/* The process of obtaining the data members and methods from 
	 * one class to another class is known as inheritance.
	-	Single Inheritance
	-	Multiple Inheritance(Java doesn't support Multiple Inheritance 
	directly rather through Interfaces)
	-	Multilevel Inheritance

	*/

	public static void main(String[] args) {
		inheritance obj=new inheritance();
		
		//single inheritance
		obj.annualIncomevoid();
		obj.weeklyIncomeStatic();
		
		//Multilevel Inheritance
		
	    obj.nj("Fill");
	    obj.ny("Kumo");
	    obj.practiceForLoop();
		
	

	}

	

}
