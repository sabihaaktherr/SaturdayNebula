package com.upskill.java_4;

public class Encapsulation {
// Encapsulation  used to hide the data using setter and getter method
	
	 private   String name="Sabihaakther";
	 private  int ssn= 23465549;
     private  String username= "sabihaakther";
     
	// setter nethod -name                          // set the data ,write
     public void setname(String value ) {
    	 name= value;
    	  }
     
  // Getter nethod -name                          // get the data ,read
     public String getname() {
    	 return name;
     }
     
     public void setssn(int value ) {
    	 ssn= value;
    	  }
     
     public String getname1() {
    	 return username;
     }
     
     
	public static void main(String[] args) {
		Encapsulation obj= new Encapsulation();
         obj.setname("Sharmin");
         obj.setssn(1234356);
         System.out.println(obj.getname1());
         System.out.println(obj.getname());
	}

}
