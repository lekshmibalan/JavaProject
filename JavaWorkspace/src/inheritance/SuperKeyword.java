package inheritance;

class Animal
{
	String color="white";
}

class Dog extends Animal
{
	String color="black";
	void displayColor()
	{
		System.out.println(super.color);
	}
	
}


public class SuperKeyword {

	public static void main(String[] args) {
	Dog d=new Dog();
	d.displayColor();

	}

}

