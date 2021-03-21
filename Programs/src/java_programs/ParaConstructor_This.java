package java_programs;

		class Sample 
		{ 
		    // data members of the class. 
		    String name; 
		    int id; 
		  
		    Sample(String name, int id) 
		    { 
		        this.name = name; 
		        this.id = id; 
		    } 
		} 
		  
		class ParaConstructor_This {
		    public static void main (String[] args) 
		    {  
		        Sample s = new Sample("Chandhini", 2104); 
		        System.out.println("Name :" + s.name + 
		                           " and Id :" + s.id); 
		    } 
		} 
	
