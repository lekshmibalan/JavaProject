package Arrays;
/*
 1. Declare an array
 2. Add values into array
 3. Find length of an array
 4. Read single value from an array
 5. Read multiple values from an array
 */
public class SingleDimensionalArray {

	public static void main(String[] args) {
		//Declare an array
		//Approach 1
		/*int a[]=new int[5];
		//Add values into array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; */
		
		//Approach 2
		int a[]={100,200,300,400,500};
		
		//Find length of an array
		System.out.println("Length of an array:"+ a.length);
		
		// Read single value from an array
		System.out.println(a[3]);
		
		//Reading all the values from array
		//Normal for loop
		/* for(int i=0;i<a.length;i++) // i<=4 i<5 i<=a.length-1  i<a.length
		{
			System.out.println(a[i]);  //100 200 300 400 500 
		} */
		
		//Enhanced for loop/ for..each loop
		for(int x:a)
	{
		System.out.println(x);
	}

}
}