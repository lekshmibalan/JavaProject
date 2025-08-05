package dataabstraction;

interface Shape
{
	int length=10;  // final & static variable
	int width=20;   // final & static variable
	
	void circle(); //Abstract method
	
	default void square()
	{
		System.out.println("This is square - Deafault Method");
	}
	
 static void rectangle()
 {
	 System.out.println("This is rectangle - Static Method");
 }
	
}



public class InterfaceDemo implements Shape
{
  public void circle()
{
	System.out.println("This is circle -Abstract method");
}

	public static void main(String[] args) {
		//Scenario 1
		//InterfaceDemo idobj=new InterfaceDemo();
		//idobj.circle();    //abstract
		//idobj.square();    
		//Shape.rectangle();  //static method can directly access from interface
		
		
		//Scenario 2
	Shape sh=new InterfaceDemo();
	sh.circle(); //abstract
	sh.square(); //default
	Shape.rectangle();  //static method can directly access from interface
		
		
		
		
	}
 
}
