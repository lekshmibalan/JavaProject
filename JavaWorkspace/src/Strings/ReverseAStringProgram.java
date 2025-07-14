package Strings;

public class ReverseAStringProgram {

	public static void main(String[] args) {
		// Reverse a String
		//Approach1  -length()   ,charAt()
		 String s="welcome";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string is:"+ rev); 
		
		//Approach2 - By converting string to char array type
		/* String s="welcome";
		String rev="";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse string is:"+ rev);    */
		
		//Approach3 - Using StringBuffer Class
		/* StringBuffer s= new StringBuffer("welcome");
		System.out.println("Reverse string is:"+ s.reverse());  */
		
		//Approach4 - Using StringBuilder Class
		/* StringBuilder s=new StringBuilder("welcome");
		System.out.println("Reverse string is:"+ s.reverse()); */
		
		
		
		
		
		
		
		
		
	}

}
 