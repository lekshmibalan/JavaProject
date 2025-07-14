package Strings;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		//String s="welcome";
		//String s=new String("Welcome");
		//System.out.println(s);
		
		//1. length() - Returns length of a string
		
		String s="welcome";
		//int l=s.length();
		//System.out.println(l);
		s.length();
		System.out.println(s.length());   //7
	System.out.println("welcome".length());   //7
	
	// 2. concat()- Joining Strings
	String s1="welcome"	;
	String s2="to java";
	String s3="Automation";
	System.out.println(s1+s2); // welcome to java
	System.out.println(s1.concat(s2));  // welcome to java
	
	System.out.println(s1+s2+s3); // welcome to java
	System.out.println(s1.concat(s2).concat(s3));  // welcometo javaAutomation
	System.out.println(s1.concat(s2+s3));  // welcometo javaAutomation
	
	System.out.println("welcome"+"to java"); // welcometo java
    System.out.println("welcome".concat("to java")); // welcometo java
	
	// 3. trim()- Remove spaces right and left side 
    s= "   welcome   ";
    System.out.println(s);  // print string along with spaces
    System.out.println("Before trimming:"+s.length());
    
    System.out.println(s.trim());
	System.out.println("After trimmed:"+s.trim().length());
	
	//4. CharAt() - Returns a character from a string based on index
	//index starts from 0 
	s= "welcome";
	System.out.println(s.charAt(3));  //c
	
	
	//5. contains() - Returns true/false
	// Check string is part of main string or not
   System.out.println(s.contains("wel"));  //true
   System.out.println(s.contains("Wel")); //false
	
	
	//6. equals() ,equalsIgnoreCase()- Compare Strings 
   s1="welcome";
   s2="welcome";
   System.out.println(s1==s2);  //true
   System.out.println(s1.equals(s2)); //true
   System.out.println(s1.equals("welcome"));  //true
   System.out.println(s1.equalsIgnoreCase("Welcome"));  //true
	 
	// 7. replace()  -Replace single/multiple(sequence)of characters in a string
   s="welcome to selenium java selenium python selenium c#";
   System.out.println(s.replace('e', 'X'));   // wXlcomX to sXlXnium java sXlXnium python sXlXnium c#
System.out.println(s.replace("selenium", "playwright"));  //welcome to playwright java playwright python playwright c#

	//8. substring() - Extract substring from the main string
	//Starting index -0
    // Ending index -1
	s="Selenium";
	System.out.println(s.substring(1, 5));  //elen
	System.out.println(s.substring(0, 3)); //Sel
	
	//9. toUpperCase       toLowerCase
	s="welcome";
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	
	//10. split()- Split the string into multiple parts based on delimeter 
	// Returns arrays
	s="abc@gmail.com";
	String a[]=s.split("@");
	System.out.println(Arrays.toString(a));
	System.out.println(a[0]);  // abc
	System.out.println(a[1]);  //gmail.com
	
	//Example 1 ---replace
	String amount ="$15,20,55";
	System.out.println(amount.replace("$",""));  //  15,20,55
	System.out.println(amount.replace("$","").replace(",",""));
	
	//Example 2 ---Split
	s="abc,123@xyz";    //abc 123 xyz
	String arr1[]=s.split(",");  //abc 123@xyz
	System.out.println(Arrays.toString(arr1));  //[abc, 123@xyz]
	
	String arr2[]=arr1[1].split("@");
	System.out.println(Arrays.toString(arr2));  //[123, xyz]
	
	System.out.println(arr1[0]);  //abc
	System.out.println(arr2[0]);  //123
	System.out.println(arr2[1]);  //xyz 
	
	//Example 3 --Split
	s="abc 123 zyz";
	String ar[]=s.split(" ");
	System.out.println(Arrays.toString(ar)); //[abc, 123, zyz]
	
	

	
	
	
	

}
}