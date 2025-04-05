package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hash_Set_Hash_Table {
 /*
		 
		 The java.util package contains all the classes and interfaces for the Collection framework.
		 The Collection interface (java.util.Collection) and Map interface (java.util.Map) 
		 are the two main “root” interfaces of Java collection classes.
		 
		 
		 Collection Framework:
		 
		 java.util.Collection (i)
		 
		 		Set (i)
		 				HashSet -> linked HashSet
		 				
		 					HashSet: Hashset store unordered collection containing unique value
							Linked HashSet: The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.
		 				
		 				Sorted Set (i)-> Navigable Set (i) -> Tree Set
		 				
		 					Sorted Set: A SortedSet is a Set that maintains its elements in ascending order, sorted according to the elements' natural ordering.
		 					Navigable Set: NavigableSet represents a navigable set
		 					Tree Set: TreeSet is a sorted collection that extends the AbstractSet class and implements the NavigableSet interface
		 		
		 		List (i) -> 
		 				ArrayList
		 				Vector
		 				LinkedList
		 				
		 					ArrayList: The ArrayList class is a resizable array
		 					Vector: A vector can be defined as a dynamic array that can grow or shrink on its own
		 					LinkedList: Linked list class is an ordered collection that contains many objects of the same type.
		 		
		 		Queue (i)
		 				
		 				Priority Queue
		 				LinkedList
		 				
		 					Priority Queue: Special type of queue wherein all the elements are ordered as per their natural ordering.
		 					LinkedList: Linked list class is an ordered collection that contains many objects of the same type.
		 
		 java.util.Map (i)
		 		
		 		Hash Map -> linked HashMap
		 		
		 		Hash Table
		 		
		 		Sorted Map (i)-> Navigable Map (i) -> Tree Map
		 		
		 					Hash Map: Hashmap store multipul data using key-value pair, hashmap is syncronized, not thread-safe
		 					Linked HashMap: Provides a way to order and trace the elements
		 					Hash Table: Hashtable is synchronized, thread safe
		 					Sorted Map: Elements can be traversed in sorted order of keys
		 					Navigable Map: Possible to navigate the keys and values stored in the map
		 					Tree Map: Sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time
		 					
		 Object
		 		Arrays
		 		Collections
		 
		 */
 //Array store multiple data using index

	public static void main(String[] args) {
		//Array store multiple data using index
		
		int age=27;// variable
		//int[] ageNabula= {21,24,31,28,29};
		
		int[] ageNabula= new int[]{21,24,31,28,29};
		//Array index             [0] [1] [2] [3] [4]
		
		System.out.println("Student age: " + ageNabula[2]);
		System.out.println("Student age: " + ageNabula.length);
		
		
		String name= "Sabiha";
		String[] nameNabula= new String[] {"Sharmin", "Bithi", "Ram", "Saaebah"};
		//Array index             [0] [1] [2] [3] [4]
		
		System.out.println("Student age: " + nameNabula[3]);
		System.out.println("Student age: " + nameNabula.length);
		
		//Multi-Dimentional Array
		int[][] ageNabula2D= {{21,24,31,28,29}, //[0][0] [0][1] [0][2] [0][3] [0][4]
				             {22,26,32}};       // [1][0] [1][1] [1][2] 
	System.out.println("Student age 2D: " + ageNabula2D[0][3]);
	
	
	String [][] StringNabula2D= {{"Sabiha","Sharmin","Saaebah","Rasel","Shuvrha"}, //[0][0] [0][1] [0][2] [0][3] [0][4]
            {"Syed","Asif","MD"}};  // [1][0] [1][1] [1][2] 
System.out.println("Student age 2D: " + StringNabula2D[0][4]);
	
	
	
	
	// HashMAp store multiple data using key-value pair, implement of Map interface
		HashMap<String, Integer> student = new HashMap<String,Integer>();
		
		student.put("Sharmin", 21);
		student.put("Fahmida", 20);
		student.put("Rajesh", 21);
		student.put("Majid", 25);
		student.put("Sana", 21);
		
	
		HashMap<String, String> Capital = new HashMap<String,String>();
	
		Capital.put("USA","Albany" );
		Capital.put("England","London" );
		Capital.put("China","Beijing" );
		
		System.out.println("Capital: " + Capital.get("USA"));
		System.out.println("Capital: " + Capital.get("England"));
		System.out.println("Capital: " + Capital.get("China"));
		
//Hashtable store multiple data	using key-value pair,no null
//also is synchronized(only one thread can be modified)
		Hashtable<String, String> Region = new Hashtable<String,String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Region :" + Region.get("BD") );
		
// HasSet store unordered collection containing unique value, 
//implementation of set interface 
		
		HashSet<String> car= new HashSet<>();
		car.add("BMW");
		car.add("Tesla");
		car.add("Audi");
		car.add("Ford");
		System.out.println("car :" + car);
		
	}
	
	
	
	
	
	
	
	
	
	

}
