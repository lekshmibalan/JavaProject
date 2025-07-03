package day2;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="lekshmi";
		emp1.job="Test Engineer";
		emp1.sal=25000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Darsh";
		emp2.job="Test Engineer";
		emp2.sal=20000;
		emp2.display();

	}

}
