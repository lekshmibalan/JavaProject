package Operators;

public class LogicalOperators {
	
	public static void main (String[]args) {
		
		//Logical operators && || !(And Or Not)
		//returns boolean value -true/false
		//works between 2 boolean variable
	boolean x=true;
	boolean y=false;
	
	System.out.println(x && y);   //false
	System.out.println(x || y);   //true
	System.out.println( !y);     // true
	System.out.println(!x);      //false
	
	boolean b1=10>20;
	System.out.println(b1);  // false
	
	boolean b2=20>10;
	System.out.println(b2);   //true
	
	System.out.println(b1 && b2);  //false
	System.out.println(b1 || b2);  //true
	
	}

}
