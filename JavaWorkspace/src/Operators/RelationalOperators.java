package Operators;

public class RelationalOperators {

	public static void main(String[] args) {
		// Relational/Comparison Operators > >= < <= != ==
		// returns boolean value
		
		int a=20 , b=10;
		
		System.out.println(a>b);  //true
		System.out.println(a<b);  //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		b=20;
		System.out.println(a<=b); //true
		System.out.println(a>=b); //true
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
		boolean res=a>b;
		System.out.println(res);

	}

}
