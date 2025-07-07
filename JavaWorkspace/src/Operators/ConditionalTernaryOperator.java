 package Operators;

public class ConditionalTernaryOperator {

	public static void main(String[] args) {
		// Conditional/ Ternary Operators ?:
		// var=exp ? result1 : result2;
		
		// Example1
		/*int a=100,b=200;
		
		int x=(a>b) ? a:b;
		System.out.println(x); */
		
		//Example 2
		
		int person_age= 15;
		String res=(person_age>=18)? "Eligible": "Not Eligible";
		System.out.println(res);
		
	}

}
