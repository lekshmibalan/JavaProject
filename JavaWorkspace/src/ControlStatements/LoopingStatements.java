package ControlStatements;

public class LoopingStatements {

	public static void main(String[] args) {
// 1. print 1.....10 numbers
/* int i=1;   //Initialization

while(i<=10) //Condition
{
System.out.println(i);
i++;   //inc
}	
	
	
	//2. print hello message 10 times
		int i=1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}   */


// Print the even numbers between  1...10
		//Approach 1
/*int i=2;
while(i<=10)
{
	System.out.println(i);
	i+=2;
}
	}
} */
		
		// Approach 2
int i=1;
while(i<=10)
{
if(i%2==0)
{
	System.out.println(i);
}
i++;
}
}
}