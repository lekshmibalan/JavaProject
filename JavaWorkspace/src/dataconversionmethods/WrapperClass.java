package dataconversionmethods;

public class WrapperClass {

	public static void main(String[] args) {
		// String -->int
		
		//String s="welcome";  // Cannot convert to int
		/* 
		 String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); 
		*/
		
		// String -->Double
		/*
		String s1="10.5";
		String s2="20.5";
		
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
       */
		
		//String -->Boolean
		
		/*
		 String s="true"; // other than true,if you pass any string that will return false.
		 System.out.println(Boolean.parseBoolean(s));
		*/
		
		//int,double,boolean,char ---->String
		
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		 s=String.valueOf(d);
		System.out.println(s);
		
		 s=String.valueOf(c);
			System.out.println(s);
			
			 s=String.valueOf(bool);
				System.out.println(s);
		
		
	}

}
