package LoopingStatements;

public class EvenOrOddWhileLoop {

	public static void main(String[] args) {
		// Print Even and Odd Numbers from 1........10 
		
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
			System.out.println(i + "Even");
			}
			else
			{
				System.out.println(i + "Odd");
			}
			i++;
		}

	}

}
