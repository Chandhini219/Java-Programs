package java_programs;
/*
---Method------We cannot define Non- Static variables inside the non-static methods.
         ------We cannot create object for calling methods and variables. Call it by class name.


*/
class StaticEg
{
		static int i;  // It gives error because when we remove static
		public static void show()
		{
		System.out.println(i);   // we cannot access non-static variables inside the static methods
		}
}
		public class StaticExample
		{
			public static void main(String[] args) 
			{
				StaticEg.i=20; 
				StaticEg.show();
           }
		}



