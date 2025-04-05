package com.upskill.assignment_2;

public class Problem_2 {

	public static void main(String[] args) {
	
		/* Problem2. A school conducts 
		 * a 100 mark exam for its student and grades them as follows:  		
		 */
		MyGrade(100);
		
	}
		
		public static void MyGrade(int Marks) {
		if(Marks>=90 && Marks <=100 ) {
			System.out.println("Grade A");
		}else if(Marks >=80 && Marks <=89) {
			System.out.println("Grade B");
		}else if(Marks >=70 && Marks <=79) {
			System.out.println("Grade C");
		}else if(Marks >=60 && Marks <=69) {
			System.out.println("Grade D");
			
		}else if(Marks< 60) {
			System.out.println("Fail");
		}else {
			System.out.println("invalid Marks");
		}
		
		
		
			
		
		
		
		}
	}

	


