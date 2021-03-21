package java_programs;


		class Person1 
		{ 
		    Person1() 
		    { 
		        System.out.println("Person class Constructor"); 
		    } 
		} 
		class Student1 extends Person1 
		{ 
		    Student1() 
		    { 
		        super();   // invoke or call parent class constructor 
		        System.out.println("Student class Constructor"); 
		    } 
		} 
		public class Super_Constructor 
		{ 
		    public static void main(String[] args) 
		    { 
		        Student1 s = new Student1(); 
		    } 
		} 
		
