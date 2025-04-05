package com.upskill.java_5;

public abstract class AbstracClass {
// Abstract class has both abstract method and regular method	
	
	public void car() {
		System.out.println(" My car is Tesla");
		}
	
	public void color() {
		System.out.println(" My car is Red");
		}
	
    public abstract void icar(); 
	
	public abstract void iWheel(); 
	
	public abstract int iDoor(); 
	
	public abstract String iSeatType(); 
	
	/*
	(Parent)				   (Keyword) 				(Child)					 (Keyword) 					(GrandChild)
							
	Class						extends					 Class		 
	Abstract Class				extends					 Class
	Interface(2) 			  	implements				 Class(-2)
	Interface(2) 				extends		  			 Interface(2+2)    			implements				Class(-4)
	Interface 		  			implements				 Abstract Class
	*/

	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
