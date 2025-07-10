package LoopingStatements;

public class ForLoop {

	public static void main(String[] args) {
		
		// Example1: 1.....10 numbers 
		/* for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		} */
		
		//Example2: 1.....10 Even Numbers
		/* for(int i=2;i<=10;i+=2)
		{
			System.out.println(i);
		} 	*/
		
		// Example3: Print Even and Odd Numbers from 1........10 
		/* for(int i=1;i<=10;i++)
		{
	if(i%2==0)
	{
		System.out.println(i +"Even");	
		}
	else
	{
		System.out.println(i +"odd");
	}
	} */
		
// Example4: 10.....1 in desc order
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		} 
}
}
