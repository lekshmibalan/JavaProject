package Variables;

public class StudentMain {

	public static void main(String[] args) {
		//Student stu=new Student();
		
		// 1. Using object reference variables
		/*stu.sid=101;
		stu.sname="Lekshmi";
		stu.grad='A'; */
		
		//2.  Using method
		//stu.setStudentData(101, "Lekshmi", 'A');
		//stu.printStudentData();
		
		//3. Using Constructor
		
		Student stu=new Student(101,"Lekshmi",'A');
		stu.printStudentData();
		
			

	}
}