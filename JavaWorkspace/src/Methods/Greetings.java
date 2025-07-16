package Methods;

public class Greetings {

	// 1. No parameters   No return value
	
	void m1()
	{
		System.out.println("hello....");
	}
	
  // 2. No parameters   Return value

      String m2()
   {
      return("Hello How are you?");
  
   }
   // 3. Takes parameters   No return value
      
      void m3(String name)
      {
    	  System.out.println("Hello"+name);
      }
      
 // 4. Takes parameters   Return value
      
      String m4(String name)
      {
    	  return("Hello"+name);
      }
      

}
