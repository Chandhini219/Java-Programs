package java_programs;

		class Person 
		{ 
		    void message() 
		    { 
		        System.out.println("This is person class"); 
		    } 
		} 
		  
		/* Subclass Student */
		class Student extends Person 
		{ 
		    void message() 
		    { 
		        System.out.println("This is student class"); 
		    }  
		    void display() 
		    { 
		        message();
		        super.message(); 
		    } 
		} 
		  
   public class Super_Method {

	public static void main(String[] args) {
		
		        Student s = new Student(); 
		  
		        s.display(); 
		    } 
		} 

