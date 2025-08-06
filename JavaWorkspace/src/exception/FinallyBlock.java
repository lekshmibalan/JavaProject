package exception;

public class FinallyBlock {

	public static void main(String[] args) {
	String s=null;
	try
	{
	System.out.println(s.length());
	}
	catch(NullPointerException e)
	{
		System.out.println("Catch block handled exception...");
		System.out.println(e.getMessage());
		
	}
	finally
	{
		System.out.println("Entered into finally block");
	}
	System.out.println("program is finished....");

	}

}
