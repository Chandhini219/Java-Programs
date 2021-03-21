package java_programs;

		class SampleConstructor 
		{ 
		    int num; 
		    String name; 
		  
		    // this would be invoked while an object 
		    // of that class is created. 
		    public SampleConstructor() 
		    { 
		        System.out.println("Constructor Generated"); 
		    } 
		} 
		  
		public class DefaultConstructor {	
		    public static void main (String[] args) 
		    { 
		        // this would invoke default constructor. 
		        SampleConstructor s=new SampleConstructor(); 
		  
		        // Default constructor provides the default 
		        // values to the object like 0, null 
		        System.out.println(s.name); 
		        System.out.println(s.num); 
		    } 
		} 