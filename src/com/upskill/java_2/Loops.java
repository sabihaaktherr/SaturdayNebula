package com.upskill.java_2;

public class Loops {
	/* 	
 	Type of Loops
  		1. For Loop
  		2. While Loop
  		3. Do While Loop
  		4. Infinite Loop
 */
	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		doWhileLoop();
		//infiniteLoop();
		
		nestedForLoop();
		
	}
	
public static void practiceForLoop() { //For Loop - Do again and again upto upper limit
		
		int i;                                  //Initialize the variable
		for( i=1;i<=10;i++) {      //Setting lower limit, Upper limit, Increment or Decrement
			System.out.println("For Loops Number" + i); // statement
		}
		}


public static void practiceWhileLoop() {//WhileLoop-do again and again upto condition match
	int i=1;                            //Initialize the variable
	
	while(i<=10) {                       // Setting condition
		System.out.println("While Loop Number" + i); // Statement
		i++;                             //Increament or Decrament
	}
}

 public static void doWhileLoop() {//do while loop-do action then match action
	 
	 int i=1;                        //Initialize the variable
	 do{
		 System.out.println("Do WhileLoop Number" + i); //Statement
		 i++;                                //Increament or Decrament
	 }while(i<=10);                         // Checking condition
	 
	 
 }

 public static void infiniteLoop() {//infinity loop-never ending loop
	 int i=1;                       //Initialize the variable
	for(i=1; ; i++) {               //setting no upper limit
		System.out.println("Infinite Loop Number" + i);//Statement
	}		 
 }
 
 public static void nestedForLoop() {
	 int i;
	 int j;
	 for( i=1;i<=10;i++) {
		 
		for( j=1;j<=10;j++) {
			int multificationtable= i * j;
			System.out.print(multificationtable + " ");
		}
		System.out.println(" ");
	 }
	 
 }
 
 
 
}
