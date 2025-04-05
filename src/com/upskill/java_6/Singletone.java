package com.upskill.java_6;

public class Singletone {
// Singleton is class that can have only one object

	
// Private constructor, it prevents any other class from instantiating
	private  Singletone() {
		}
	//Private static object of the class
	private static Singletone Singletoneobj=new Singletone();
	
	public static Singletone getInstance() {
		
		return Singletoneobj;
	}
	
	protected static void demo() {
		System.out.println("Demo method for singletone class");
	}

	protected static void car() {
		System.out.println("car method for singletone class");
	}

	protected static void bus() {
		System.out.println("bus method for singletone class");
	}
}
