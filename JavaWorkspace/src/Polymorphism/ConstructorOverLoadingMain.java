package Polymorphism;

public class ConstructorOverLoadingMain {

	public static void main(String[] args) {
		
		 //ConstructorOverLoading b=new ConstructorOverLoading();  //1
		// ConstructorOverLoading b=new ConstructorOverLoading(10.5,15.5,20.5); //2
		ConstructorOverLoading b=new ConstructorOverLoading(10.5);   //3
		System.out.println(b.voulme()); 
	
	}

}
