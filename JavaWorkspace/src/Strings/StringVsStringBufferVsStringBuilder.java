package Strings;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		// String - Immutable
		String s="welcome";
		s.concat("to java");
		System.out.println(s); // welcome - Immutable, cannot change original value of s
		
		// StringBuffer -Mutable 
		
	StringBuffer s1= new StringBuffer("welcome");
	s1.append("to java");
		System.out.println(s1); // welcometo java  - Mutable, can change value of s
		
    // StringBuilder -Mutable
		
		StringBuilder s2=new StringBuilder("welcome");
		s2.append("to java");
		System.out.println(s2); // // welcometo java  - Mutable, can change value of s
		
	}

}
