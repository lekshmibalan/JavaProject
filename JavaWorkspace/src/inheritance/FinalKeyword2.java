package inheritance;

final class Test1
{
final void m()
{
	System.out.println("This is a method from Test1..");
}
}
class Test2 extends Test1  //incorrect,bcoz Test1 is final class
{
	void m() // incorrect,bcoz m() is final method
	{
		System.out.println("This is a method from Test2..");
	}
}

public class FinalKeyword2 {

	public static void main(String[] args) {
		
	}
}