package com.upskill.java_1;

import com.upskill.java_2.Loops;

public class Variables extends Loops{
//	Variables in Java
  //Instance OR global variable - Variables declared in Class level, outside method
  //Local variable - variables declared in methods 
  //Static variable - variables belong to class and don't required creating object
  //Method parameter - variables used as method parameter
	
	public static void main(String[] args) {
		
		Variables obj=new Variables();//classname objectname=new classname();
		
		System.out.println(president);
		System.out.println(obj.vicePresident);
		
		ny("Chuck");
		nj("Cory");
		
		}
	
	public static String country ="USA";         //instance or global variable
	public static String region="North America"; //instance or global variable
	public static String president="Trump";      //static variable
	public String vicePresident="Vance";        //Non-static variable
	
	
public static void ny(String senator) {
	String city ="Rego Park";     // local variable
	String county="Nassau ";       // local variable
	
	System.out.println(city);
	System.out.println(county);
	System.out.println(country);
	System.out.println(region);
	
	System.out.println(senator);
		
	}




public static void nj(String senator) {
	String city ="Jersey City";
	String county="Essex";
	System.out.println(city);
	System.out.println(county);
	System.out.println(country);
	System.out.println(region);
	
	System.out.println(senator);
		
	}

public static void ct(String senator) {
	String city ="Stampford";
	String county="Fairfield";
	
	System.out.println(city);
	System.out.println(county);
	System.out.println(country);
	System.out.println(region);
	
	System.out.println(senator);
		
	
}


}
