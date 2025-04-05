package com.upskill.java_4;

public class Constructor {
/* Constructor is instance of class,method name same as class name,
 * java will execute constructor first
 * Constructor cannot be static or override nor void or return type
 * Default Constructor : No constructor is initialized
 * Parameterized Constructor:Add different signature
 * Constructor overloading:Different signature
 * 
 */
	
	
	int studentAge;
	String studentName;
	public Constructor(int age) {
		studentAge= age;
		}
	
	public Constructor(int age,String name) {
		studentAge= age;
		studentName=name;
		}
	
	public Constructor(String name1) {
		studentName= name1;
		}

	public static void main(String[] args) {
		Constructor obj1= new Constructor(28);
		
		System.out.println("Age obj 1 :"  +obj1.studentAge);
		
		Constructor obj2= new Constructor(25,"Sabiha");
		
		System.out.println("Age object 2 :"  +obj2.studentAge);
		System.out.println("Name object 2 :"  +obj2.studentName);
		
		Constructor obj3= new Constructor("Sharmin");
		
		System.out.println("Name object 3 :"  +obj3.studentName);
		
		}

}
