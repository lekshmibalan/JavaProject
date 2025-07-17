package Polymorphism;

public class MethodOverLoadingMain {

	public static void main(String[] args) {
		MethodOverLoading addobj=new MethodOverLoading();
		addobj.sum(); //1
		
		addobj.sum(100, 200); //2
		
		addobj.sum(10.5, 30); //4
		
		addobj.sum(10,15.5); //3
		
		addobj.sum(10, 20, 30); //5
		
		// addobj.sum(10.2,15.5,20.5);    Invalid

	}

}
