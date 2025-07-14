package Programs;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
// SortingElementsInArray
int a[]= {100,600,200,400,500};
System.out.println("Before Sorting");
System.out.println(Arrays.toString(a)); //[100, 600, 200, 400, 500]
/* for(int value:a)
{
System.out.println(value);
} */
Arrays.sort(a); // Sorts elements in array
System.out.println("After Sorting");
System.out.println(Arrays.toString(a));



	}

}
