package Strings;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// Mutable - Can Change
		
	/*	int a[]= {20,10,40,50,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);   //Mutable
		System.out.println(Arrays.toString(a)); */
		
		//Immutable - Cannot change
		
		String s=new String("welcome");
		System.out.println(s);  //welcome
		String concatstring=s.concat("to java");
		System.out.println(s);  //welcome   --Immutable  
		System.out.println(concatstring);
		
		
		
	}

}
