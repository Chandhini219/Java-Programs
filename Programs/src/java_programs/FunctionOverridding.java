package java_programs;

//Run-time Polymorphism . (Late-Binding,Dynamic Binding)
	class Parent { 
	    void show() 
	    { 
	        System.out.println("Hello.."); 
	    } 
	} 
	  
	
	class Child extends Parent { 
	   
	    void show() 
	    { 
	        System.out.println("Have a good day"); 
	    } 
	} 
	  
	
	 class FunctionOverridding { 
	    public static void main(String[] args) 
	    { 
	        Parent obj1 = new Parent(); 
	        obj1.show();  
	        Parent obj2 = new Child(); 
	        obj2.show(); 
	    } 
	} 

	

