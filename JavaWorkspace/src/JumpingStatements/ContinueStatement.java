package JumpingStatements;

public class ContinueStatement {

	public static void main(String[] args) {
		/*for(int i=1; i<=10; i++)
		{
			if(i==5)   //5 is not printed 
			{
				continue;
			}
			System.out.println(i);
		} */

	
	// Skip 3,5,9 
	
	
	
		for(int i=1; i<=10; i++)
		{
			if(i==3 || i==5 || i==9)   //3,5,9 are not printed 
			{
				continue;
			}
			System.out.println(i);
		}
	
	
	
	
	
	
	
	
	
	}
	
}
